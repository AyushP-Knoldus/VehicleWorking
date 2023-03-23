package com.knoldus

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val vehicleObj= new Vehicle
    vehicleObj.moveVehicle
    println(vehicleObj.fuel_Capacity)
    vehicleObj.moveVehicle
    println(vehicleObj.fuel_Capacity)
    println(vehicleObj.moveVehicle)
    println(vehicleObj.fuel_Capacity)
    println(vehicleObj.refuelVehicle)
    println(vehicleObj.fuel_Capacity)
    println(vehicleObj.moveVehicle)
    println(vehicleObj.fuel_Capacity)
  }
}