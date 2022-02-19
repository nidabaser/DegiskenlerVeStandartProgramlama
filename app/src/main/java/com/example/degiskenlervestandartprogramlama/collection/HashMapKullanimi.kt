package com.example.degiskenlervestandartprogramlama.collection

fun main() {
    val iller = HashMap<Int,String>()
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    println(iller.toString())

    println(iller.get(16))
    println(iller[34])

    //Güncelleme
    iller[16] = "Yeni Bursa"
    println(iller.toString())

    println(iller.size)
    println(iller.isEmpty())

    for((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }

    //Silme
    iller.remove(34)
    println(iller.toString())

    iller.clear()
        println(iller.toString())

}