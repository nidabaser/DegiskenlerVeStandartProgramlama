package com.example.degiskenlervestandartprogramlama.nesnetabanli1

fun main() {
    var str1:String? = null    //Soru işareti ile null da olabileceğini söyledik. Tür belirtmek zorunlu !
    str1 = "Merhaba"

    //Yöntem 1 :
    println("Sonuç 1: ${str1?.trim()}")   //Burada trimden önce soru işareti kullanarak yapabiliriz. Null olsada uygulama çökmez.

    //Yöntem 2 :
    // println("Sonuç 2: ${str1!!.trim()}")
    // İki tane ünlem: Ben koduma güveniyorum hata olmayacak demek, bana uyarı gösterme demek bu risklidir!!

    //Yöntem 3 :
    // En mantıklısı null kontrolünü if ile yapmak. Garantidir.
    if(str1 != null){
        println("Sonuç 3: ${str1.trim()}")
    }else{
        println("Sonuç nulldur")
    }

    //Yöntem 4:
    // Swift dilindede olan yöntemdir. Bu null ise hiç çalışmaz, null olmadığı durumda çalışır.
    str1?.let{
        println("Sonuç 4: ${str1.trim()}")
    }

}