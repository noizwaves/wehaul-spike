package com.wehaul.spike.application

import com.wehaul.spike.domain.Truck
import com.wehaul.spike.domain.TruckListScreen

class ConsoleScreen : TruckListScreen {
    override fun showTrucks(trucks: List<Truck>) {
        println("## All Trucks in Fleet ##")

        for (truck in trucks) println("- ${truck.vin}")
    }
}