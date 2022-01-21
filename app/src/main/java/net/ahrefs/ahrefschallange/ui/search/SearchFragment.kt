package net.ahrefs.ahrefschallange.ui.search

import android.os.Bundle
import android.view.*
import android.view.inputmethod.EditorInfo
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.ahrefs.ahrefschallange.base.BaseFragment
import net.ahrefs.ahrefschallange.databinding.FragmentSearchBinding
import net.ahrefs.ahrefschallange.utils.NoFilterAdapter
import net.ahrefs.ahrefschallange.utils.hideKeyboard

@AndroidEntryPoint
class SearchFragment : BaseFragment() {

    companion object {
        fun newInstance() = SearchFragment()
    }

    private val viewModel: SearchViewModel by viewModels()
    private lateinit var mBinding: FragmentSearchBinding
    private lateinit var autoCompleteAdapter: NoFilterAdapter<String>
    private var searchJob: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setBaseViewModel(viewModel)
        mBinding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        mBinding.lifecycleOwner = viewLifecycleOwner
        mBinding.viewModel = viewModel
        init()
        initClicks()
        return mBinding.root
    }

    private fun init() {
        autoCompleteAdapter = NoFilterAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item)
        viewModel.resultsList.observe(viewLifecycleOwner, {
            autoCompleteAdapter.clear()
            autoCompleteAdapter.addAll(it)
            autoCompleteAdapter.isFullSearch = true
        })
        mBinding.search.setAdapter(autoCompleteAdapter)
        mBinding.search.doAfterTextChanged {
            if (mBinding.search.isPerformingCompletion) return@doAfterTextChanged
            searchJob?.cancel()
            searchJob = lifecycleScope.launch {
                if (it.isNullOrBlank()) return@launch
                delay(1500)
                viewModel.getData(it.toString())
            }
        }
    }

    private fun initClicks() {
        mBinding.search.setOnEditorActionListener { _, actionId, _ ->
            when (actionId) {
                EditorInfo.IME_ACTION_SEARCH -> {
                    if (viewModel.searchQuery.value!!.isNotBlank()) {
                        hideKeyboard()
                        showMessageFromActivity(viewModel.searchQuery.value!!)
                        returnWithSearchText()
                    }
                    true
                }
                else -> false
            }
        }
        mBinding.imgBack.setOnClickListener {
            navController.navigateUp()
        }
    }

    private fun returnWithSearchText() {
        navController.previousBackStackEntry?.savedStateHandle?.set("searchText", viewModel.searchQuery.value!!)
        navController.popBackStack()
    }
}