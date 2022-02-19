package com.example.degiskenlervestandartprogramlama.nesnetabanli1

fun main() {
    val bmw = Araba("Kırmızı",0,false)

    // Okuma İşlemi
    /*println("Renk         : ${bmw.renk}")
    println("Hız            : ${bmw.hiz}")
    println("Çalışıyor mu   : ${bmw.calisiyorMu}")*/
    bmw.bilgiAl()

    //Veri Aktarma
    bmw.renk = "Mavi"
    bmw.hiz = 40
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(100)
    bmw.bilgiAl()

    //println("Renk           : ${bmw.renk}")
    //println("Hız            : ${bmw.hiz}")
    //println("Çalışıyor mu   : ${bmw.calisiyorMu}")

    val sahin = Araba("Beyaz",100,true)

    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(50)
    sahin.bilgiAl()
    sahin.yavasla(20)
    sahin.bilgiAl()

    //println("Renk           : ${sahin.renk}")
    //println("Hız            : ${sahin.hiz}")
    //println("Çalışıyor mu   : ${sahin.calisiyorMu}")

}