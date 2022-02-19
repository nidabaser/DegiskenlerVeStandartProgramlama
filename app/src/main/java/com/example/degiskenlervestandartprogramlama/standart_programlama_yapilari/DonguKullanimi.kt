package com.example.degiskenlervestandartprogramlama.standart_programlama_yapilari

fun main() {
    // 1,2,3

    for(i in 1..3){
        println("Döngü 1 : $i")
    }

    // range 10 ile 20 arasında 5'er artsın
    for (a in 10..20 step 5){
        println("Döngü 2 : $a")
    }

    // 20 ile 10 arasında -5 azalsın
    for(b in 20 downTo 10 step 5){
        println("Azalan döngü: $b")
    }

    // While
    var sayac = 1

    while(sayac < 6){
        println("Döngü 4 : $sayac")
        sayac++
    }

    // Break ve Continue
    //Break döngüyü tamamen durdurur.
    for(i in 1..5) {
        if (i == 3) {
            break
        }
        println("Döngü 5 : $i")
    }

    //Continue'de 3.adımı atlar, diğerlerine devam eder.
    for(i in 1..5) {
        if (i == 3) {
            continue
        }
        println("Döngü 6 : $i")
    }



}