package com.fanhl.androidtestdemo.bike

class Bike {
    fun track() = "___"

    fun run() = "${track()} run ${track()}"

    fun call() = Call().call()
}

class Call {
    fun call() = "Ring"
}

