package com.jovita.arity_vehicle


lateinit var vehicleList :ArrayList<Vehicle>

fun main(){

    println("Adding Vehicles")
    addVehicles()
    sortVehicles()
    filterElectric()

}

fun addVehicles(){
         vehicleList = arrayListOf<Vehicle>(
        Vehicle("Tesla","Model 3",2023,Type.ELECTRIC),
        Vehicle("Tesla","Model S",2012,Type.ELECTRIC),
        Vehicle("Ford","Focus",2018,Type.PETROL),
        Vehicle("Ford","Bronco",2020,Type.PETROL),
        Vehicle("Chevrolet","Trax",2013,Type.PETROL),
        Vehicle("Chevrolet","Blazer ev",2023,Type.ELECTRIC),
        Vehicle("Audi","A5",2016,Type.PETROL),
        Vehicle("Audi","A8",2017,Type.PETROL),
        Vehicle("BMW","Series 4",2020,Type.PETROL),
        Vehicle("BMW","X7",2018,Type.PETROL)
        )
}

fun sortVehicles(){
     vehicleList.sortBy { vehicle: Vehicle -> vehicle.year }
    println("Sorted Vehicles--------------------")
    printData(vehicleList)

}

fun filterElectric(){
   val electric:ArrayList<Vehicle> = vehicleList.filter { vehicle: Vehicle ->  vehicle.type.equals(Type.ELECTRIC)} as ArrayList<Vehicle>

    println("\n Electric Vehicles--------------------")
    printData(electric)
}

fun printData(data : ArrayList<Vehicle>){
    for(v in data) {
        println(v.toString())
    }
}
