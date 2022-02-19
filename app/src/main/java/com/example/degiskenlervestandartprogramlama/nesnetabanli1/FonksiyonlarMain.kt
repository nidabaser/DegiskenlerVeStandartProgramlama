package com.example.degiskenlervestandartprogramlama.nesnetabanli1

fun main() {
    val f = Fonksiyonlar()

    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    f.selamla3("Zeynep")

    f.toplama1()

    val gelenToplam = f.toplama2(100,200)
    println("Gelen Toplam : $gelenToplam")

    f.çarp(5,4,"nida")
}