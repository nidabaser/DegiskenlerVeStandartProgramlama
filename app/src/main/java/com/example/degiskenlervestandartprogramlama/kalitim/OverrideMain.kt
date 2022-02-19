package com.example.degiskenlervestandartprogramlama.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()
    memeli.sesCikar()       // Ust sınıfa bakar, hayvandaki fonksiyonu çalıştırır.
    kedi.sesCikar()         // Kedi ve kopek zaten kendi fonksiyonlarını çalıştırır.
    kopek.sesCikar()
}