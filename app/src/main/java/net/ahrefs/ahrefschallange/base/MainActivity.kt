package net.ahrefs.ahrefschallange.base

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import net.ahrefs.ahrefschallange.R
import net.ahrefs.ahrefschallange.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var activityBaseBinding: ActivityMainBinding
    private val viewModel: BaseViewModel by viewModels()
    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBaseBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityBaseBinding.root)
        setSupportActionBar(activityBaseBinding.toolbar)
        activityBaseBinding.lifecycleOwner = this
        init()
    }

    private fun init() {
        navController = findNavController(R.id.main_nav_fragment)
        setSupportActionBar(activityBaseBinding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        NavigationUI.setupActionBarWithNavController(this, navController)
        activityBaseBinding.viewModel = viewModel

        navController.addOnDestinationChangedListener { _, destination, arguments ->
            val label = destination.label?:""
            activityBaseBinding.toolbarTitle.text = label
        }
    }

    fun showHideProgress(show: Boolean) {
        viewModel.dataLoading.value = show
    }

    fun showMessageFromActivity(message: String) {
        showToast(message)
    }

    private fun showToast(message: String) {
        Snackbar.make(
            findViewById(android.R.id.content),
            message,
            Snackbar.LENGTH_LONG
        ).apply {
            setBackgroundTint(ContextCompat.getColor(this@MainActivity, R.color.purple_500))
            view.background =
                ResourcesCompat.getDrawable(resources, R.drawable.round_corner_bg, null)
            setActionTextColor(Color.WHITE)
            setAction(R.string.label_dismiss) { dismiss() }
        }.show()
    }

    override fun onSupportNavigateUp(): Boolean {
        return when (navController.currentDestination?.id) {
            R.id.searchFragment -> {
                onBackPressed()
                true
            }
            else -> super.onSupportNavigateUp()
        }
    }
}