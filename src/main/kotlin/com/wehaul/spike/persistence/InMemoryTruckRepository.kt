package com.wehaul.spike.persistence

import com.wehaul.spike.domain.Truck
import com.wehaul.spike.domain.TruckRepository

class InMemoryTruckRepository : TruckRepository {
    private val trucks = mutableListOf(
            Truck("1NE-345"),
            Truck("6IX-212"),
            Truck("3RE-992")
    )

    override fun save(truck: Truck): Truck {
        trucks.add(truck)
        return truck
    }

    override fun findAll(): List<Truck> {
        return trucks
    }
}