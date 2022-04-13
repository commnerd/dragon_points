package net.michaeljmiller.dragonpoints.models

class User(public var id: Int?, name: String, dragon: Dragon) {
    companion object {
        // fun get() : User? { return void; // User(1, "Michael J. Miller", Dragon("http://hi".toByteArray()))}
        fun loggedIn() : Boolean { return false }
    }
}