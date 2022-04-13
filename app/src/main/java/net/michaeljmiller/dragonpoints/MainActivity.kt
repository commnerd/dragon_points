package net.michaeljmiller.dragonpoints

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.michaeljmiller.dragonpoints.models.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        when(User.loggedIn()) {
            true -> startActivity(Intent(this, DragonActivity::class.java))
            false -> startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}