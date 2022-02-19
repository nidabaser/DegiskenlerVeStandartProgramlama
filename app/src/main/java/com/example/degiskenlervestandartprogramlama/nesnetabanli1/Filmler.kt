package com.example.degiskenlervestandartprogramlama.nesnetabanli1

data class Filmler(var film_id:Int,
                   var film_ad:String,
                   var film_yil:Int,
                   var kategori:Kategoriler,     //Kategoriler tablosunu temsil edecek
                   var yonetmen:Yonetmenler) {   //Yönetmenler tablosunu temsil edecek



}