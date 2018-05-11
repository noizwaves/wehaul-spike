package com.wehaul.spike.domain

interface TruckRepository {
    fun findAll(): List<Truck>
}