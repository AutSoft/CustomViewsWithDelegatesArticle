package hu.autsoft.customviewsarticle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        demoAllProperties()
    }

    fun demoAllProperties() {
        infoCard1.title = "Time to leave!"
        infoCard1.content = "If you leave now, you'll be right on time for you next appointment."
        infoCard1.icon = getDrawable(R.drawable.ic_leave)

        infoCard2.title = "Success"
        infoCard2.content = "Purchase completed. We'll prepare your package soon."
        infoCard2.icon = getDrawable(R.drawable.ic_ok)

        infoCard3.title = "View stats"
        infoCard3.content = "Click here to view the latest usage statistics."
        infoCard3.icon = getDrawable(R.drawable.ic_pie_chart)
    }

    fun demoMissingProperties() {
        infoCard1.title = "Time to leave!"
        infoCard1.content = "If you leave now, you'll be right on time for you next appointment."
        infoCard1.icon = null// getDrawable(R.drawable.ic_leave)

        infoCard2.title = "Success"
        infoCard2.content = null // "Purchase completed. We'll prepare your package soon."
        infoCard2.icon = getDrawable(R.drawable.ic_ok)

        infoCard3.title = null // "View stats"
        infoCard3.content = "Click here to view the latest usage statistics."
        infoCard3.icon = getDrawable(R.drawable.ic_pie_chart)
    }
}
