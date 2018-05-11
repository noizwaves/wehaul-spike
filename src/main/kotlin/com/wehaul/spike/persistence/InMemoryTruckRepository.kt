package com.wehaul.spike.persistence

import com.wehaul.spike.domain.Truck
import com.wehaul.spike.domain.TruckRepository

class InMemoryTruckRepository : TruckRepository {
    override fun findAll(): List<Truck> {
        return listOf(
                Truck("1NE-345"),
                Truck("6IX-212"),
                Truck("3RE-992")
        )
    }
}