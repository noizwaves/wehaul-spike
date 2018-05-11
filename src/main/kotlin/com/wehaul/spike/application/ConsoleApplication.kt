package com.wehaul.spike.application

import com.wehaul.spike.domain.Fleet
import com.wehaul.spike.persistence.InMemoryTruckRepository

fun main(args : Array<String>) {
    val screen = ConsoleScreen()
    val fleet = Fleet()
    val repo = InMemoryTruckRepository()

    fleet.showTruckList(repo, screen)
}