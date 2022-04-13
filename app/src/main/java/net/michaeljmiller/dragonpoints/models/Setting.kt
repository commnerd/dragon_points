package net.michaeljmiller.dragonpoints.models

class Setting {
    companion object {
        fun get(key: String): String? {
            return null
        }
        fun set(key: String, value: String) {

        }
        fun has(key: String): Boolean {
            return get(key) != null
        }
    }
}