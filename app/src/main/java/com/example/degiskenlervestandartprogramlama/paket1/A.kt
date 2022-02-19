package com.example.degiskenlervestandartprogramlama.paket1

// VISIBILITY MODIFIER

open class A {          //open kelimesi

    var varsayilanDegisken = 1              // Bu şekilde tanımlayınca public her yerden erişilebilir
    public var publicDegisken = 2           // Yine public
    private var privateDegisken = 3         // Private özel, yalnızca A sınıfından erişilir.
    protected var protectedDegisken = 4     // Protected korumalı, kalıtım yoluyla diğer sınıfa aktararak erişilir.


    fun fonksiyonA() {
        var a = A()   //A paketini aktarmak

        a.publicDegisken            //Bunlara her yerden erişilir.
        a.varsayilanDegisken        //Private ve protected olduğu için erişemedik.
        publicDegisken              //Kalıtımla eriştik.
        protectedDegisken           //Kalıtımla eriştik.
    }
}