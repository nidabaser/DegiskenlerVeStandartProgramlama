package com.example.degiskenlervestandartprogramlama

class Odevler {

    fun soru1(derece: Int): Double {
        return (derece * 1.8) + 32
    }

    fun soru2(kenar1: Int, kenar2: Int): Int {
        return 2 * (kenar1 + kenar2)
    }

    fun soru3(sayi: Int): Int {
        var f = 1
        for (i in 1..sayi) {
            f *= i
        }
        return f
    }

    fun soru4(kelime: String, harf: Char): Int {
        var sayac = 0
        for(i in 1 until kelime.length){
            if(kelime[i] == harf)
            sayac++
        }
        return sayac
    }

    fun soru5(n:Int):Int{
        return (n-2)*180
    }

    fun soru6(gun: Int): Int {
        if(gun<=20) {
            return gun * 8 * 10
        }else {
            val mesai = 20
            return (gun - mesai) * 8 * 20 + 1600
        }
    }

    fun soru7(kotaMiktari:Int):Int{
        if(kotaMiktari<=50) {
            return 100
        }else {
            val varsayilanKota = 50
            return (kotaMiktari - varsayilanKota) * 4 + 100
        }
    }
}