package com.knoldus
import org.scalatest.funsuite.AnyFunSuite
class VehicleTest extends AnyFunSuite {
  //Created object of Vehicle class to use in all the tests
  val vehicleObject = new Vehicle
  test("moveVehicle method should return true if fuel capacity is atleast 20l")
  { //The vehicle will move once
    val result = vehicleObject.moveVehicle
    assert(result == true)
  }
  test("moveVehicle method should return false if fuel capacity is less than 20l")
  {//The vehicle will only move twice and return false the third time
    val vehicleObject2=new Vehicle
    assert(vehicleObject2.moveVehicle == true)
    assert(vehicleObject2.moveVehicle == true)
    val result = vehicleObject2.moveVehicle
    assert(result == false)
  }
  test("refuelVehicle method should return true if fuel capacity is less than 50l")
  {//Vehicle will refuel if it is less than 50l
    vehicleObject.moveVehicle
    val result = vehicleObject.refuelVehicle
    assert(result == true)
  }
  test("refuelVehicle method should return false if fuel is already full")
  {//If fuel capacity is 50l it will return false
    val result = vehicleObject.refuelVehicle
    assert(result == false)

  }
}