package net.ahrefs.ahrefschallange.ui.dummy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import net.ahrefs.ahrefschallange.R
import net.ahrefs.ahrefschallange.base.BaseFragment
import net.ahrefs.ahrefschallange.databinding.FragmentDummyBinding

@AndroidEntryPoint
class DummyFragment : BaseFragment() {

    companion object {
        fun newInstance() = DummyFragment()
    }

    private lateinit var mBinding: FragmentDummyBinding
    private val viewModel: DummyViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setBaseViewModel(viewModel)
        mBinding = FragmentDummyBinding.inflate(layoutInflater, container, false)
        mBinding.lifecycleOwner = viewLifecycleOwner
        mBinding.viewModel = viewModel
        initClicks()
        return mBinding.root
    }

    private fun initClicks() {
        mBinding.btnOpenSearch.setOnClickListener { navController.navigate(R.id.openSearch) }
    }

    override fun onResume() {
        super.onResume()
        // this trigger when getting back from search page
        navController.currentBackStackEntry?.savedStateHandle?.getLiveData<String>("searchText")?.
        observe(viewLifecycleOwner) {
            mBinding.tvSearchWord.text = it
        }
    }
}