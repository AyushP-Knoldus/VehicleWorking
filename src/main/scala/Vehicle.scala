package com.knoldus
/*The following assignment consists of a Vehicle class which contains two following methods:-
 1-moveVehicle:-To move the vehicle and reduce the fuel from it.
 2-refuelVehicle:-To fill the fuel into the vehicle.
                                                              -Ayush Pathak
* */
class Vehicle
{ //Maximum fuel capacity of the vehicle is 50l.
  var fuel_Capacity:Int=50
  def moveVehicle : Boolean={
    if(fuel_Capacity >= 20)
    {
      //Everytime the vehicle moves fuel capacity is decreased by 20l.
      fuel_Capacity=fuel_Capacity-20
      true
    }
    else{
      false
    }
  }
  def refuelVehicle: Boolean={
    //Checks fuel capacity if it is less then minimum required to move the vehicle, then refuel it to maximum limit.
    if(fuel_Capacity < 50)
    {
      fuel_Capacity=fuel_Capacity + (50-fuel_Capacity)
      true
    }
    else
    {
      false
    }
  }
}
