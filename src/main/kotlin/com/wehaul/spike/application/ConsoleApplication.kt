package com.wehaul.spike.application

import com.wehaul.spike.domain.Fleet
import com.wehaul.spike.persistence.InMemoryTruckRepository

fun main(args: Array<String>) {
    val screen = ConsoleScreen()
    val repo = InMemoryTruckRepository()
    val fleet = Fleet()

    when (args[0]) {
        "listTrucks" -> fleet.showTruckList(repo, screen)
        "addTruck" -> fleet.addTruck(repo, args[1])
        else -> showUsage()
    }
}

fun showUsage() {
    println(
            """Usage: java -jar wehaul-spike.jar [command [options]]

Commands include:
 - listTrucks
 - addTruck [vin]""")
}