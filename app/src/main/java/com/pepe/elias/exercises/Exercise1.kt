package com.pepe.elias.exercises

fun main(){
    val moringNotification = 51
    val eveningNotification = 135
    printNotificationSummary(moringNotification)
    printNotificationSummary(eveningNotification)

}

fun printNotificationSummary (number0fMessages:Int){

    if (number0fMessages >=100){
        println("Tienes mas de 99 notificaciones")
    }else{
        print("Tienes $number0fMessages notificaciones")
    }
}