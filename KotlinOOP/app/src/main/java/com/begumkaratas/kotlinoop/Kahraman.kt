package com.begumkaratas.kotlinoop
// final ve open var . varsayılan final olunca kahraman classına erişim olmaz
open class Kahraman(var isim:String, val ozelGuc:String) {

    fun kos() {
        println("Kahraman koştu")
    }
}