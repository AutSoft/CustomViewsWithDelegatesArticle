package hu.autsoft.customviewsarticle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoCard.icon = getDrawable(R.drawable.ic_leave)
        infoCard.title = "Time to leave!"
        infoCard.content = "If you leave now, you'll be right on time for you next appointment."
    }

}
