package com.wehaul.spike.domain

interface TruckRepository {
    fun findAll(): List<Truck>
    fun save(truck: Truck): Truck
}