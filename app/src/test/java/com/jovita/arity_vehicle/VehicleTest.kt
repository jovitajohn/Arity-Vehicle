package com.jovita.arity_vehicle

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Assert
import org.junit.Test

class VehicleTest {

     var vehicleList :ArrayList<Vehicle> = arrayListOf<com.jovita.arity_vehicle.Vehicle>(
         Vehicle("Tesla", "Model 3", 2023, Type.ELECTRIC),
         Vehicle("Chevrolet", "Blazer ev", 2016, Type.ELECTRIC),
         Vehicle("Ford", "Focus", 2018, Type.PETROL)
    )

    @Test
    fun testInsert(){

        assertEquals(3,vehicleList.size)
    }

    @Test
    fun testValues(){


        assertTrue(vehicleList.contains(Vehicle("Chevrolet", "Blazer ev", 2016, Type.ELECTRIC)))
    }


    //Test to confirm filtered list does not contain a vehicle with type petrol
    @Test
    fun testFilter(){

        val electric:ArrayList<Vehicle> = vehicleList.filter { vehicle: Vehicle ->  vehicle.type.equals(Type.ELECTRIC)} as ArrayList<Vehicle>
        assertEquals(2,electric.size)
        assertFalse(electric.contains(Vehicle("Ford", "Focus", 2018, Type.PETROL)))
    }

    //Test to very the sorting is working
    @Test
    fun testSort(){
        vehicleList.sortBy { vehicle: Vehicle -> vehicle.year }

        assertEquals(2016,vehicleList.get(0).year)
        assertEquals(2018,vehicleList.get(1).year)
        assertEquals(2023,vehicleList.get(2).year)
    }

}