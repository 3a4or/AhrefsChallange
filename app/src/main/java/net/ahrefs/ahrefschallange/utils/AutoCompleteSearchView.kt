package net.ahrefs.ahrefschallange.utils

import android.content.Context
import android.util.AttributeSet
import android.widget.ArrayAdapter
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import net.ahrefs.ahrefschallange.R

class AutoCompleteSearchView(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int
) : MaterialAutoCompleteTextView(context, attrs, defStyleAttr) {
    constructor(context: Context, attrs: AttributeSet? = null):this(context,attrs, R.attr.autoCompleteTextViewStyle)

    constructor(context: Context):this(context,null)

    override fun replaceText(text: CharSequence?) {
        val noFilterAdapter = adapter as NoFilterAdapter<*>
        if(!noFilterAdapter.isFullSearch){
            return super.replaceText(text)
        }
        val activeWord = StringUtils.getActiveWord(selectionStart, getText().toString())
        val wordType = StringUtils.getWordType(activeWord.third)
        val replacement = "$text "
        when (wordType.second) {
            IdManager.AUTO_COMPLETE_TYPE_SUBJECT -> {
                setText(getText().toString().replaceRange(activeWord.first, activeWord.second, replacement))
                setSelection(activeWord.first + replacement.length)
            }
        }
        (adapter as ArrayAdapter<*>).clear()
    }
}