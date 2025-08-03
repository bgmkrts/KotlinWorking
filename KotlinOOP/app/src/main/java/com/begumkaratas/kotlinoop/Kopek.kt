package com.begumkaratas.kotlinoop

class Kopek:Hayvan() {

    fun havla(){
        println("Kopek havladı")
    }
    //sesCikar fonksiyonu Hayvan classında da var olduğu için override ettik. Hayvan classına erişmek için open kullandık
    override fun sesCikar(){
        println("Köpek ses çıkardı")
    }
}