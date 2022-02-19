package com.example.degiskenlervestandartprogramlama.collection

fun main() {

    val sayılar = ArrayList<Int>()

    val meyveler = ArrayList<String>()

    // Veri Ekleme
    meyveler.add("Elma")    // 0. index
    meyveler.add("Muz")     // 1. index
    meyveler.add("Kiraz")   // 2. index

    println(meyveler.toString())

    // Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler.toString())

    // Yeni eleman eklemek
    meyveler.add(1,"Portakal")
    println(meyveler.toString())

    //Okuma işlemi
    println(meyveler.get(2))
    println(meyveler[3])


    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş kontrolu : ${meyveler.isEmpty()}")   // true ya da false döndürür
    println("İçeriyor mu : ${meyveler.contains("Elma")}")  // Büyük küçük harf duyarlı

    meyveler.reverse()
        println(meyveler.toString())

    meyveler.sort()                 // Alfabetik sıralama
    println(meyveler.toString())

    for (meyve in meyveler){
        println("Döngü 1 : $meyve")
    }


    for ((indeks,meyve) in meyveler.withIndex()){       // index numarası getirme
        println("$indeks. -> $meyve")
    }

    meyveler.removeAt(2)   // index numarasına göre listeden eleman silme
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())
}