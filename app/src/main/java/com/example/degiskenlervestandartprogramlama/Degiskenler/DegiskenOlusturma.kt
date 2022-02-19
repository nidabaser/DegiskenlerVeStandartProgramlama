package com.example.degiskenlervestandartprogramlama.Degiskenler

fun main(){
    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasharf = 'A'
    var ogrenciDevamEdiyorMu = true

    //println(ogrenciAdi)
    //println(ogrenciYas)
    //println(ogrenciBoy)
    //println(ogrenciBasharf)
    //println(ogrenciDevamEdiyorMu)

    var urun_id : Int = 3416
    var urun_ad : String = "Kol Saati"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 149.99
    var urun_tedarikci : String = "Rolex"

    //println("Ürün id : $urun_id")
    //println("Ürün ad : $urun_ad")
    //println("Ürün adet : $urun_adet")
    //println("Ürün fiyat : $urun_fiyat")
    //println("Ürün tedarikci : $urun_tedarikci")

    var a = 10
    var b = 20

    println("$a x $b : ${ a * b }")

    var sayi = 30
    sayi = 90
    println(sayi)

    val numara = 100
    println(numara)

    //Tür Dönüşümü
    // 1. Sayısaldan sayısala dönüşüm
    val i = 42
    val d = 78.95
    // amaç double'ı int'e, int'i double'a dönüştürmek
    // Ondalıklı sayıyı tam sayı yapmak tehlikeli olabilir
    val sonuc1 = i.toDouble()
    println(sonuc1)
    val sonuc2 = d.toInt()
    println(sonuc2)

    // 2. Sayısaldan metne dönüşüm
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)

    // 3. Metinden Sayısala dönüşüm
    val yazi = "67.54"
    val sonuc5 = yazi.toDoubleOrNull()
    if(sonuc5 != null) {
        println(sonuc5)
    }else{
            println("Dönüşümde hata oluştu, sayınızı kontrol ediniz")
        }



}