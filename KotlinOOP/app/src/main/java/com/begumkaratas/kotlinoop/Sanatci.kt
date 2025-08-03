package com.begumkaratas.kotlinoop
                                                       //javada extends Insan implements Sarki,Dans
class Sanatci (var isim:String,val yas:Int,var enstruman:String):Insan(),Sarki,Dans{

    override fun test(){
        //bu abstract sınıftan gelen abstract fonk override edilmiş hali
        println("test")
    }

    private var sacRengi=""
    var sarkiTürü=""
    var gozRengi=""
        private set
        public get

    private var tur="insan"

    fun sarkiSoyle(){
        println("${isim} şarkı söyledi")
    }

    fun setSacRengi(yeniSacRengi:String){
        this.sacRengi=yeniSacRengi
    }

    fun getSacRengi(){
        println(this.sacRengi)
    }


    fun turYazdir(){
        println(this.tur)
    }

    //private kullanılırsa diğer sayfalara erişim  olmaz
     fun enstrumanCal(){
        println("${isim} enstruman olarak ${enstruman} çaldı")
    }

    init {
        println("init çağırıldı")
    }

    override fun dansEtmeFonk() {
    }
    override fun sarkiSoyleFonk() {
    }


}