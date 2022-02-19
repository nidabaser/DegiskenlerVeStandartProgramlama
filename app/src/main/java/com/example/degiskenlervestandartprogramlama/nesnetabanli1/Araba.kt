package com.example.degiskenlervestandartprogramlama.nesnetabanli1

data class Araba(var renk:String,var hiz:Int,var calisiyorMu:Boolean) {
// Başına data ekledik, artık set,get metodlarına gerek yok

    // var str1:String     class içinde boş değişken tanımlayınca hata alıyoruz.

    init{
        println("Araba sınıfından nesne oluşturuldu")
    }

    //Side Effect
    fun calistir(){
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKM:Int){
        hiz+=kacKM  // Hiz = hiz + kacKM
    }

    fun yavasla(kacKM:Int){
        hiz-=kacKM  // Hiz = hiz - kacKM
    }


    fun bilgiAl(){
        println("*************************")
        println("Renk           : ${renk}")
        println("Hız            : ${hiz}")
        println("Çalışıyor mu   : ${calisiyorMu}")
    }

    //this veya self : Bulunduğu sınıfı temsil eder.
    //super : Kalıtımdır, üst sınıfı temsil eder.



}