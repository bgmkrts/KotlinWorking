package com.begumkaratas.kotlinogreniyorum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.nio.LongBuffer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("hello world")
        println("loglara 2.yazdırılacak satır")

        // değişkenler

        println(5 * 2)
        println(8 / 4)

        //kotlinde veritipleri ve değişkenler
        //var-> değeri sonradan değiştirebilir
        //val->sabit olan değeri değiştiremezsin..eğer değeri sonradan değiştirmeyecekse .tanımlanır.değer sabit kalır.

        //İnteger

        println("-----------İnteger--------")

        var x = 5
        println(x)
        println(x * 10)

        x = 40
        println(x * 7)

        var y = 5
        println(x + y)

        //implicit
        val b = 8
        // b=7   val tanımlandığı için sabiti değiştiremeyiz
        println(b * 5)

        val ornek: Long = 10
        println(ornek + 78)

        //explicit
        val ornekShort: Short = 15
        val ornekByte: Byte = 5
        val ornekInt: Int = 15
        println(ornekByte * ornekShort)
        //ornekByte=4000 hata verir. byte kapasitesi max 127 değerini alır

        //snake_case => val kullanici_yasi
        //camelCase => val kullaniciYasi

        val m = 56
        val n = 25
        val snc = m + n
        println(snc)
        println(snc + x)

        //DOUBLE-FLOAT KESİRLİ SAYI

        println("----------DOuble ve Float----------")
        println("****************Double Tanımlama**************")

        val pi = 3.14
        println(pi * 2.5)

        println(4.0 / 5.0)

        val orneKDouble = 8.0
        val sonucDouble: Double = pi * orneKDouble
        println(sonucDouble)
        println("****************Float Tanımlama**************")

        val ornekFloat: Float = 2.5F
        val sncFloat = ornekFloat * 8
        println(sncFloat)

        //Unsigned types= Hiçbir zaman negatif almayacak bir veri ile çalışılıyorsa kullanılır

        val unsignedByte: UByte = 10u
        val unsignedShort: UShort = 10u
        val unsignedInt: UInt = 10u
        val unsignedlLong: ULong = 10u

        //String=>Metinler

        println("-----------String------------------")

        val benimAdim: String = "Begüm"
        println(benimAdim)
        println(benimAdim.uppercase())

        val benimSoyismim: String = "Karataş"
        println(benimAdim + " " + benimSoyismim)

        val yas = "29"
        val deger = "2586"
        println(yas + deger)

        val stringDeger: String
        // stringDeger.uppercase()
        stringDeger =
            "Önceden StringDeğer belirtilmediği için (initialize) hata verir" //initialize,init,initialization

        //Tip dönüşümü
        println("--------Tip dönüşümü-----------")

        val yasInt = yas.toInt()
        println(yasInt * 20)

        x.toLong()
        println((x.toLong()) * 5)

        //Boolean
        println("------------------Boolean----------")
        val myTrue: Boolean = true
        val myFalse: Boolean = false

        var myBoolean: Boolean = true
        myBoolean = false

        println(4 > 5)
        println(4 < 5)
        println(4 == 4)

        val kullaniciYas = "29"
        println(kullaniciYas.toInt() > 18)

        //<= küçük eşit
        //>= büyük eşit
        // != eşit değil
        // && ve
        // || veya

        println(10 != 10)

        println("begum" == "bgm")

        println(4 > 5 && 3 == 3)
        println(4 > 5 || 3 == 3)

        //  Veri Yapıları
        //Diziler Array
        println("--------Array------------------")
        //Sabit boyutludur (başta belirlenir, sonradan değişmez)
        //Aynı türde elemanlar içerir.
        //Sıralıdır ve indeks ile erişilir

        val diziOrnek = "mehmet"

        val myArray = arrayOf(diziOrnek, "begum", "sevgi", "emine","emine", "büşra", "esma")

        /*değişken türü var olsaydı eleman eklemek için
        myArray += "ceren"
        println(myArray[6])*/

        println(myArray[0])
        println(myArray[1])
        println(myArray[4])
        println(myArray.last())

        myArray[0] = "MERVE"
        println(myArray[0])
        println(myArray.get(0))

        val numberArray = arrayOf(2, 4, 6, 8, 7, 445, 899)
        println(numberArray[5])
        println(numberArray[6] * 8)

        val complexArray = arrayOf("begum","sevgi", 45, 3.54, 78,78, "sevgi", "emine")
        println(complexArray[4])

        println("----------------ArrayList----------------")
        //Dinamik boyutludur (sonradan eleman eklenebilir/silinebilir).
        //Sıralıdır (eklenme sırasını korur).
        //Tekrarlı elemanlara izin verir.


        val sehirList = arrayListOf("malatya", "elazığ", "diyarbakır", "ankara", "kocaeli")
        println(sehirList[3])
        println(sehirList.size)

        sehirList.add("samsun")
        println(sehirList.get(5))
        sehirList[5] = "adana"
        println(sehirList.get(5))

        sehirList.remove("adana")
        // sehirList.removeAt(5)

        val numara = ArrayList<Int>()
        val digerNumara = ArrayList<Int>()

        numara.add(10)
        numara.add(20)
        numara.add(30)

        digerNumara.add(50)
        digerNumara.add(60)
        digerNumara.add(70)

        println(numara[2]*digerNumara[1])

        //// listelerde karışık boşliste oluşturma-><Any>

       // val complexEmptyList = arrayListOf("amerika", "ananas", "greyfurt",40,6, "muz",5.0,"almanya",4.56,"amerika")

        val complexEmptyList=ArrayList<Any>()

        complexEmptyList.add("amerika")
        complexEmptyList.add("ananas")
        complexEmptyList.add("greyfurt")
        complexEmptyList.add(40)
        complexEmptyList.add(6)
        complexEmptyList.add("muz")
        complexEmptyList.add(5.0)
        complexEmptyList.add("almanya")
        complexEmptyList.add(4.56)
        complexEmptyList.add("amerika")


        println(complexEmptyList.get(8))
        //println(complexEmptyList[8])

        //setler
        println("---------------------SET--------------------")
        //Benzersiz elemanlar için idealdir.
        //Tekrarlı elemanlara izin vermez.
        //Sırasızdır (bazı türleri sıralı olabilir).

        val Dizi=arrayOf(10,10,10,10,30,40,50)
        println(Dizi.size) //7

        val setDizi= setOf(10,10,10,10,30,40,50)
        println(setDizi.size)  //aynı değeri uniqe sayar= 4

        //setDizi.add() çalışmaz=> add fonk çalışmaz  setOf dizi gibi davranır.HashSetten ayrılan yönüde bu

        setDizi.forEach {
            println(it)
        }

        //Hızlı çalışır çünkü elemanları hash tablosuna göre saklar.
        //Eşsiz (unique) verileri saklamak için idealdir.
        //HashSet = Benzersiz + Hızlı + Sırasız

        val bosSetOrnek=HashSet<String>()

        bosSetOrnek.add("Begum")
        bosSetOrnek.add("Begum")
        bosSetOrnek.add("Begum")
        bosSetOrnek.add("Begum")
        bosSetOrnek.add("Begum")
        bosSetOrnek.add("merve")

        bosSetOrnek.forEach {
            println(it)
        }

        val tekileDonusturme=myArray.toHashSet()  //myArray dizisindeki tekrar eden elemanları atar
        tekileDonusturme.forEach {
            println(it)
        }


        //map

        println("----------------- MAP------------------")
        //Anahtar değer eşleşmesi
        //2li eşleştirme yapılacaksa

        val yemekDizisi= arrayListOf("elma","armut","muz")
        val kalori= arrayListOf(100,150,200)

       // println("${}")

        println("${yemekDizisi[0]}'nin kalorisi ${kalori[0]}'dür")

        val yemekKaloriMap= hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Armut",150)
        yemekKaloriMap.put("Muz",200)

        println(yemekKaloriMap["Elma"])
        println(yemekKaloriMap.get("Muz"))


        yemekKaloriMap.put("Elma",500)
        println(yemekKaloriMap["Elma"])


        val orn= hashMapOf<String,String>()
        orn.put("Ankara","Kocaeli")
        orn.put("abnk","cshus")

        println(orn["Ankara"])


        println("-----------------IF Kontrolü--------------------")

        println(3<4)

        var sayi=9
       // sayi=sayi+1
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        //kalanını bulma- remainder
        println(20%8)

        val skor:Int=26

        if(skor<10){
            println("Oyunu kaybettiniz")
        }else if(skor>=10 && skor<=20) {
            println("Fena değilsiniz")

        }
        else{
            println("Tebrikler Kazandınız")
        }

        println("--------------when---------------------------")

        //javada swich case ile kotlinde when aynı


        val not =5
        var notString=""

        when (not) {
            0 -> notString="geçersiz not"
            1 -> notString="zayıf"
            2 -> notString="kötü"
            3-> notString="orta"
            4-> notString="iyi"
            5 -> notString="pekiyi"
            else->notString="Not bilinmiyor"
        }
        println(notString)

        val notYeni=4
        when(notYeni){
            0-> println("geçersiz not")
            1-> println("zayıf")
            2-> println("kötü")
            3-> println("orta")
            4-> println("iyi")
            5-> println("pekiyi")
            else-> println("Not bilinmiyor")

        }

        println("--------------------------while---------------------------")

        var j=0
        println("döngü başladı")
        while(j<=10){
            println(j)
            j++
        }
        println("döngü bitti")

        println("----------------------FOR döngüsü------------------------------")

        var baskaDizi= arrayListOf(10,50,8,79,45,7,8,6)
       /* println(baskaDizi[0]/5*3)
        println(baskaDizi[1]/5*3)*/

        for(numara in baskaDizi){
            println(numara/5*3)
        }

        //range  0..9

        for(num in 0..9){
            println(num*5)
        }

        val stringDizim= arrayListOf<String>()
        stringDizim.add("İngilizce")
        stringDizim.add("Türkçe")
        stringDizim.add("Japonca")

        for(kelime in stringDizim){
            println(kelime.uppercase())
        }

        stringDizim.forEach {
            println(it.lowercase())
        }























    }
}