package com.example.degiskenlervestandartprogramlama.collection

fun main() {
    val o1 = Ogrenciler(200,"nida","11D")
    val o2 = Ogrenciler(300,"sena","12A")
    val o3 = Ogrenciler(100,"nurgül","10B")
    val o4 = Ogrenciler(100,"sebahattin","10B")

    val ogrencilerListesi = ArrayList<Ogrenciler>()
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)
    ogrencilerListesi.add(o4)

    for(o in ogrencilerListesi){
        println("No: ${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    //SIRALAMA

    println("Sayısal : Küçükten -> Büyüğe")
    val siralama1 = ogrencilerListesi.sortedWith(compareBy({ it.no }))
    for (o in siralama1){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Sayısal : Büyükten -> Küçüğe")
    val siralama2 = ogrencilerListesi.sortedWith(compareByDescending({ it.no }))
    for (o in siralama2){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Harfsel : Küçükten -> Büyüğe")
    val siralama3 = ogrencilerListesi.sortedWith(compareBy({ it.ad }))
    for (o in siralama3){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Harfsel : Küçükten -> Büyüğe")
    val siralama4 = ogrencilerListesi.sortedWith(compareByDescending({ it.ad }))
    for (o in siralama4){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    //Filtreleme

    val filtreleme1 = ogrencilerListesi.filter{ it.no >= 200 } //Koşullu filtreleme
    for (o in filtreleme1){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    val filtreleme2 = ogrencilerListesi.filter{(it.ad).contains("i")} //Koşullu filtreleme
    for (o in filtreleme2){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }
}