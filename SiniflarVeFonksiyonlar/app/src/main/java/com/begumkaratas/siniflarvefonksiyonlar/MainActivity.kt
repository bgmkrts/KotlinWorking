package com.begumkaratas.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var sayac = 0

    //lateinit->sonradan değişkenin değerini atamak gerekiyor.
    lateinit var benimKahraman: SuperKahraman

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        benimKahraman = SuperKahraman("Begüm", 29, "Yazılım")

        println("OnCreate çalıştı")
        birinciFonk()
        ikinciFonk()
        birinciFonk()
        birinciFonk()
        ikinciFonk()
        cikarma(8, 7)
        toplama(8, 9)

        /*var kahraman=SuperKahraman()  constructora parametre eklemeden önce
        kahraman.isim="Pokemon"
        kahraman.yas=15
        kahraman.meslek="gazeteci"*/

        val batman = SuperKahraman("Batman", 40, "patron")
        println(batman.isim)

        //Nullability    ?

        val kullaniciGirdisi = "15"
        println(kullaniciGirdisi.toInt() * 5)

        //Int?
        val kullaniciDigerGirdisi = "onbes"
        val kullaniciInteger = kullaniciDigerGirdisi.toIntOrNull()
        // println(kullaniciInteger*5)
        //Uygulama çökmemesi için
        if (kullaniciInteger != null) {
            println(kullaniciInteger * 5)
        }

        val kullaniciSon = "15"
        val kullaniciSonInteger = kullaniciSon.toIntOrNull()
        // println(kullaniciSonInteger*5)
        //Uygulama çökmemesi için
        if (kullaniciSonInteger != null) {
            println(kullaniciSonInteger * 5)
        }


        // var myDouble:Double?=null
        val kullaniciGirdisiDouble = kullaniciDigerGirdisi.toDoubleOrNull()

        /* !! kesinlikle null dönmeyecek anlamında,eğer null dönerse uygulama çöker..5.yol tavsiye edilmez

        println(kullaniciGirdisiDouble!!.div(2))*/

        // ? 4.yol
        println(kullaniciGirdisiDouble?.div(2))

        //BestPractise en iyi 1.yol
        if (kullaniciGirdisiDouble != null) {
            println(kullaniciGirdisiDouble / 8)
        }

        //elvis operatörü 3.yol
        println(kullaniciGirdisiDouble?.div(2) ?: 20)

        //en iyi 2.yol
        kullaniciGirdisiDouble?.let {
            println(it * 2)
        }


    }

    fun testFonk() {
        println(benimKahraman.isim)

    }

    fun birinciFonk() {
        sayac++
        println("birinci fonksiyon ${sayac} kere çalıştırıldı ")
    }

    fun ikinciFonk() {
        sayac = sayac * 2
        println("ikinci fonksiyon çalıştırıldı ${sayac}")
        println(benimKahraman.yas)

    }
    //girdi almak (sonrasında işlem yapmaya izin vermez .veri tipi UNit )

    fun cikarma(a: Int, b: Int) {
        println("Çıkan sonuç:${a - b}")

    }

    //çıktı vermek döndürmek, return (bu şekilde sonrasında işlem yapılabilir,veritipi Int  )

    fun toplama(a: Int, b: Int): Int {
        println("Çıkan sonuç:${a + b}")
        return a + b
    }


}