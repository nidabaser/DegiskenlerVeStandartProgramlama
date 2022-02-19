package com.example.degiskenlervestandartprogramlama.nesnetabanli1
//Veritabanı yapıları için Composition kavramı önemli
fun main() {
    val k = Kategoriler(1,"Bilim Kurgu")
    val y = Yonetmenler(34,"Christopher Nolan")

    val f = Filmler(100,"Inception",2011,k,y)  //Compositon ile dolaylı erişim yapmış olduk.

    println("Film id : ${f.film_id}")
    println("Film ad : ${f.film_ad}")
    println("Film yil : ${f.film_yil}")
    println("Film kategori : ${f.kategori.kategori_ad}")   // kategori k'yı temsil ediyor, dolaylı olarak verileri aldık.
    println("Film yönetmen : ${f.yonetmen.yonetmen_ad}")   // yönetmen y'yi temsil ediyor, dolaylı olarak verileri aldık.
}