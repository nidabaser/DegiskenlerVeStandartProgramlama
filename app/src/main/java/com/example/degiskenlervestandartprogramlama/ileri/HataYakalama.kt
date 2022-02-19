package com.example.degiskenlervestandartprogramlama.ileri

fun main() {
    val x = 10
    val y = 2

    try{
        val sonuc = x / y
        println("Sonuc : $sonuc")
        println("Bitti")
    }catch(e:Exception){
        println("Sayı sıfıra bölünemez")
    }

}