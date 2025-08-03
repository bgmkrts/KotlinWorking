package com.begumkaratas.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("oncreate çalıştı")

        //Encapsulation
        var buray = Sanatci("Buray", 45, "GİTAR")
        println(buray.enstruman)
        buray.isim = "Burayyy"
        println(buray.isim)
        buray.sarkiSoyle()

        buray.sarkiTürü = "pop"
        println(buray.sarkiTürü)

        val begum = Sanatci("Begüm", 29, "kEMAN")
        begum.enstrumanCal()
        begum.turYazdir()
        println(begum.gozRengi)

        begum.setSacRengi("Kumral")
        begum.getSacRengi()

        //inheritance
        val kahraman = Kahraman("superman", "uçmak")
        kahraman.kos()

        val superKahraman = SuperKahraman("superman", "uçmak")
        superKahraman.kos()
        superKahraman.isim = "bgm"
        println(superKahraman.isim)

        superKahraman.superFonk()

        //Polymorpishm

        //static polymorphism
        val islemler = Islemler()
        println(islemler.cikarma(8, 1))
        println(islemler.cikarma(8, 2, 6))
        println(islemler.cikarma(18, 4, 4, 8))

        //dinamik polymorphism

        val kopek = Kopek()
        val kedi = Hayvan()
        val hayvanList = arrayListOf(kedi, kopek)
        hayvanList.forEach {
            it.sesCikar()
        }

        //ABSTRACTİON
        //abstract interface
        //Bir sınıftan en fazla bir kaiıtım alınır
        //soyut yapılardan obje oluşturulmaz.
        //Birden fazla interface alabilir,kullanılmak zorunda
        //sınıfların davranışlarını düzenlemek için geliştirilen yapılar

        buray.test()


    }
}