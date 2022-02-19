package com.example.degiskenlervestandartprogramlama

fun main() {
    val o = Odevler()

    //Soru1
    val gelenFahrenheit = o.soru1(30)
    println("Soru 1: \nGirilen derece = 30 \nFahrenheit olarak değeri = $gelenFahrenheit")

    //Soru2
    val gelenCevre = o.soru2(3,5)
    println("\nSoru 2: \nDikdörtgen birinci kenar = 3cm, ikinci kenar = 5cm \nCevresi = $gelenCevre cm")

    //Soru3
    val gelenFaktoriyel = o.soru3(6)
    println("\nSoru 3: \nGirilen sayı = 6 \nFaktoriyeli = $gelenFaktoriyel")

    //Soru4
    val gelenHarfSayisi = o.soru4("MeselaBuBirKelimeOlmakÜzere",'a')
    println("\nSoru 4: \nGirilen sözcük = MeselaBuBirKelimeOlmakÜzere \nİçindeki a harfi sayısı = $gelenHarfSayisi")

    //Soru5
    val gelenIcAcilarToplam = o.soru5(7)
    println("\nSoru 5: \nGirilen kenar sayısı n = 7 \nİç açılar toplamı = $gelenIcAcilarToplam")

    //Soru6
    val gelenMaas = o.soru6(21)
    println("\nSoru 6: \nÇalışılan gün sayısı = 21 \nVarsa fazla mesai dahil maaş = $gelenMaas₺")

    //Soru7
    val gelenFatura = o.soru7(52)
    println("\nSoru 7: \nGirilen kota = 52 GB \nFatura ücretiniz = $gelenFatura₺")

}