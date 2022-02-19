package com.example.degiskenlervestandartprogramlama

import androidx.appcompat.app.AppCompatActivity    //Paketler ve paketlerden gelen sınıflar
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var str1:String? = null         //Eğer değer atamayacaksan böyle kullan

    lateinit var str2:String        //Başına lateinit koyarsan da değer atamadan olur. Ama sadece var için geçerli val olmaz. Riskli..

    //var sayi:Int? = null          // Primitive tanımlama, bunlarda null olmaz. Böyle kullanılmaz hatalı
    var sayi:Int = 0                // En kötü ihtimal böyle kullanılır. Varsayılan 0'dır zaten.
    //lateinit var sayi2:Int        // Primitif: Int,Double,Bool vb. olur ama lateinit ile çalışmaz.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}