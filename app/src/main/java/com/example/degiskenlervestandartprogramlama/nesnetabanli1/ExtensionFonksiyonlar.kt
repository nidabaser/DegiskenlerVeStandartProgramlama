package com.example.degiskenlervestandartprogramlama.nesnetabanli1

fun main() {
    //val sonuc =5.carpi(2)
    val sonuc = 5 carpi 2           //infix ön ekiyle
    println("Gelen sonuç : $sonuc")
}

//EXTENSION FONKSIYONLAR
//Başına ınt. ekleyerek

   // fun Int.carpi(sayi:Int):Int{
infix fun Int.carpi(sayi:Int):Int{    // infix ön ekine dikkat
    return this * sayi
}