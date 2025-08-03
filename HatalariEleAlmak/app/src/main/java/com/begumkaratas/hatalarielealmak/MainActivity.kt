package com.begumkaratas.hatalarielealmak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sonuc=intOrNutNullFonk("10")
        val sonuc2=intOrNutNullFonk("begum")
        println(sonuc)
        println(sonuc2)



    }

    fun intOrNutNullFonk(str:String):Int{
        try {
            val sayi=str.toInt()
            return sayi
        }
        catch (e:Exception){
            e.printStackTrace()

        }
        return 0

    }

}