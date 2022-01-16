package net.ahrefs.ahrefschallange.data.entities

import net.ahrefs.ahrefschallange.utils.Language

data class SpinnerItemModel (
    val id: Int,
    val valueAr: String,
    val valueEn: String,
    var key: String = ""
){
    override fun toString(): String {
        return if (Language.getLanguage() == "ar"){
            valueAr
        } else {
            valueEn
        }
    }
}