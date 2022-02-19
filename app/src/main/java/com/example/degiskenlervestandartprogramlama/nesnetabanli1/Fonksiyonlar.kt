package com.example.degiskenlervestandartprogramlama.nesnetabanli1

class Fonksiyonlar {

    fun selamla1(){                         // void fonksiyon
        val sonuc ="Merhaba Nida"
        println(sonuc)
    }

    fun selamla2() : String {               // string döndürecek, void değil
        val sonuc2 = "Merhaba Nida"
        return sonuc2
    }

    fun selamla3(isim:String){              // Dışarıdan değişken alan
        val sonuc3 ="Merhaba $isim"
        println(sonuc3)
    }

    fun toplama1(){
        val toplam = 30 + 40                     //Void
        println(toplam)
    }

    fun toplama2(sayi1:Int, sayi2:Int) : Int {       //Kullanıcıdan sayı isteme
        val toplam2 = sayi1 + sayi2
        return toplam2
    }
    // Tür olarak Int yerine any deyip herhangi bir tür diyebiliriz. Bu genelde Web API'lerde kullanılır.


    //OVERLOADING
    //Aynı metodu tekrar tekrar kullanmak için
    fun çarp(sayi1:Int, sayi2:Int){
        println("Çarpma : ${sayi1 * sayi2}")
    }
    //1.yöntem ınt yerine double, tür değişimi
    fun çarp(sayi1:Double, sayi2:Int){
        println("Çarpma : ${sayi1 * sayi2}")
    }
    //2.yöntem yeni parametre eklemek
    fun çarp(sayi1:Int, sayi2:Int, isim:String){
        println("Çarpma : ${sayi1 * sayi2} - İşlem yapan : $isim")
    }

}