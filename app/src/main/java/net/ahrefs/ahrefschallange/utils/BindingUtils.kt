package net.ahrefs.ahrefschallange.utils

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ListView
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import androidx.fragment.app.Fragment
import net.ahrefs.ahrefschallange.R

@BindingAdapter("valueAttrChanged")
fun AutoCompleteTextView.setListener(listener: InverseBindingListener?) {
    onItemClickListener = listener?.let {
        AdapterView.OnItemClickListener { parent, view, position, id ->
            listSelection = position
            setTag(R.id.autoComplete, position)
            it.onChange()
        }
    }
}

@get:InverseBindingAdapter(attribute = "value")
@set:BindingAdapter("value")
var AutoCompleteTextView.selectedValue: Any?
    get() {
        val position = getTag(R.id.autoComplete) as Int
        return if (position != ListView.INVALID_POSITION) adapter.getItem(position) else null
    }
    set(value) {
        if (value != null) {
            setText(value.toString(), false)
            if (adapter is ArrayAdapter<*>) {
                val position = (adapter as ArrayAdapter<Any?>).getPosition(value)
                setTag(R.id.autoComplete, position)
            }
        }
    }

fun Fragment.hideKeyboard() {
    view?.let { activity?.hideKeyboard(it) }
}

fun Activity.hideKeyboard() {
    hideKeyboard(currentFocus ?: View(this))
}

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}