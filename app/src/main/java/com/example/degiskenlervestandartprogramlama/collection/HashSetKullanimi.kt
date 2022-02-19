package com.example.degiskenlervestandartprogramlama.collection

fun main() {
    val meyveler = HashSet<String>()
    // İçeriğin sırasını karıştırır. Eklenen her veriyle sıralama değişir.
    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler.toString())

    meyveler.add("Amasya Elması")
    println(meyveler.toString())

    println(meyveler.elementAt(1))    // get metodu yerine elementAt 1.index

    println(meyveler.size)
    println(meyveler.isEmpty())

    for(m in meyveler){
        println("Sonuc : $m")
    }

    for((i,m) in meyveler.withIndex()){
        println("Sonuc : $i. -> $m")
    }

    meyveler.remove("Elma")     //silme
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())

}