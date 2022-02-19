package com.example.degiskenlervestandartprogramlama.kalitim

class ClassA : Interface1 {             // Interface için parantez gerekmez. DEğişken metodları sınıfa aktarmak zorundasınız yoksa hata alırız.
    override val degisken: Int = 10

    override fun metod1() {
        println("Metod 1 çalıştı")
    }

    override fun metod2(): String {
        return "Metod 2 çalıştı"
    }


}