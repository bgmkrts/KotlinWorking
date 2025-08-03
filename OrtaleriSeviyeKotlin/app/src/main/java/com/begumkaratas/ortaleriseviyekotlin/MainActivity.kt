package com.begumkaratas.ortaleriseviyekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("------------LAMBDA--------------")

        val yazdiğimiYazdirLambda = { isim: String -> println(isim) }
        yazdiğimiYazdirLambda("begum")

        val carpmaIslemiLambda = { a: Int, b: Int -> a * b }
        val sonuc = carpmaIslemiLambda(3, 5)
        println(sonuc)

        val carpmaIkinciYontem: (Int, Int) -> Int = { a, b -> a * b }
        println(carpmaIkinciYontem(3, 5))

        yazdiğimiYazdir("bgm")
        carpmaIslemi(5, 7)
        carpmaIslemii(5, 4)

        println("----------------High order Functions-------------")

        //FİLTER
        val bnmList = arrayListOf(1, 3, 5, 7, 9, 10, 45, 14, 78, 44, 25, 62)
        val buyukSayiList = bnmList.filter { sayi -> sayi > 10 }
        buyukSayiList.forEach {
            println(it)
        }

        val kucukSayiList = bnmList.filter { it < 10 }
        // println(kucukSayiList)
        kucukSayiList.forEach {
            println(it)
        }

        //MAP

        val kupluSayilar = bnmList.map { it * it * it }
        kupluSayilar.forEach {
            println(it)
        }

        //map&filter

        val ikisiBirArada = bnmList.filter { it < 10 }.map { it * it }
        ikisiBirArada.forEach {
            println(it)
        }

        val sanatci1 = Sanatci("Begum", 29, "Keman")
        val sanatci2 = Sanatci("Merve", 34, "piyano")
        val sanatci3 = Sanatci("Hakan", 41, "org")
        val sanatci4 = Sanatci("Murat", 50, "bağlama")
        val sanatci5 = Sanatci("Yasemin", 63, "flüt")


        val sanatciList = arrayListOf<Sanatci>(sanatci1, sanatci2, sanatci3,sanatci4,sanatci5)
                                    //30 yaşından büyük sanatçıların enstrumanları
        val otuzdanbykEnst = sanatciList.filter { it.yas > 30 }.map { it.enstruman }
        otuzdanbykEnst.forEach {
            println(it)
        }
                               //32 yaşından küçük sanatçıların ismi
        val abc= sanatciList.filter { it.yas<32 }.map{it.isim}
        abc.forEach{
            println(it)
        }

        //Scope

        //let: bir nesne üzerinde belirli işlemleri gerçekleştirmek ve
        // sonucu döndürmek için kullanılan kapsam (scope) fonksiyonlarından biridir.
        // Özellikle null kontrolü gereken durumlarda ve
        // nesne üzerinde dönüşüm yaparken oldukça kullanışlıdır

        var myIntg:Int?=null
         myIntg=7
        myIntg?.let {
            println(it)
        }

        val yeniDeger=myIntg?.let { it+1 }?:0
        println(yeniDeger)

        //also:bide bunu yap....

        /*
        val bnmList = arrayListOf(1, 3, 5, 7, 9, 10, 45, 14, 78, 44, 25, 62)
        val kucukSayiList = bnmList.filter { it < 10 }
        kucukSayiList.forEach {
            println(it)
        }*/

        kucukSayiList.filter { it<10 }.also{it.forEach{ println(it) }}





    }

    fun yazdiğimiYazdir(isim: String) {
        println(isim)
    }

    fun carpmaIslemi(a: Int, b: Int) {
        println(a * b)
    }

    fun carpmaIslemii(a: Int, b: Int): Int {
        println(a * b)
        return a * b
    }
}