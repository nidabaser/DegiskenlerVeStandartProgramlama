package com.example.degiskenlervestandartprogramlama.paket2

import com.example.degiskenlervestandartprogramlama.paket1.A
// VISIBILITY MODIFIER
//Biz B paketindeyken A paketini aktarmak

class B : A() {            //Kalıtım yoluyla A'ya eriştik.

   fun fonksiyon(){
     //   var a = A()   //A paketini buraya aktarmak

       // a.publicDegisken
       // a.varsayilanDegisken        //Private ve protected a erişemedik.


        publicDegisken              //Kalıtımla eriştik.
        protectedDegisken           //Kalıtımla eriştik.


    }

}
