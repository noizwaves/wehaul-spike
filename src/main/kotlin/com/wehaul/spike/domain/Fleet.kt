package com.wehaul.spike.domain

class Fleet {
    fun showTruckList(repository: TruckRepository, screen: TruckListScreen) {
        val trucks = repository.findAll()
        screen.showTrucks(trucks)
    }

    fun addTruck(repository: TruckRepository, vin: String) {
        val truck = Truck(vin)
        repository.save(truck)
    }
}