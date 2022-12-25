package com.example.class_example_on_kotlin

class MobilePhones(osName: String, brand: String, model: String) {

    var battery:Int=0

    init{
        println("Class açıldı ve çalıştırıldı.")
    }

    fun ChargeBattery(chargedby: Int){
        println("Battery was at $battery and is at ${battery+chargedby} now")
        battery += chargedby

    }
}