package net.michaeljmiller.dragonpoints.models

class User(name: String, dragon: Dragon?) {

    companion object {
        final val Names = arrayOf<String>(
            "Chelsea Spika",
            "Jessica Miller",
            "Michael Miller",
            "Molly Mosketti",
            "Peter Elliott",
            "Trevor Spika"
        )

        fun get() : User? { return null }
        fun loggedIn() : Boolean { return User.get() != null }
    }
}