package com.example.degiskenlervestandartprogramlama.standart_programlama_yapilari

fun main() {

    val yas = 23
    val isim = "Nida"

    if (yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit Değilsiniz")
    }
        if(isim == "Nida"){
            println("Merhaba Nida")
        }else if(isim == "Sena") {
            println("Merhaba Sena")
        }else{
            println("Tanınmayan Kişi")
        }

    val ka = "admin"
    val s = 12345

    if(ka == "admin" && s == 12345){
        println("Hoşgeldiniz")
    }else{
        println("Hatalı Giriş")
    }

    val sayi = 11
    if(sayi == 9 || sayi == 10){
        println("Sayi 9 veya 10'dur")
    }else{
        println("Sayi 9 veya 10 değildir")
    }

    // When ( Switch ) Kullanımı

    val gun = 9

    when(gun){
        1 -> println("pzt")
        2 -> println("salı")
        3 -> println("çrş")
        4 -> println("prş")
        5 -> println("cuma")
        6 -> println("cmt")
        7 -> println("pzr")
        else -> println("Böyle bir gün yok")
    }





}