package hu.autsoft.customviewsarticle.delegates

import android.view.View
import android.widget.TextView
import androidx.core.view.isGone
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class TextViewDelegate(
    private val textView: TextView,
    private val hideWhenEmpty: Boolean = true
) : ReadWriteProperty<View, String?> {

    private var value: String? = null

    override fun getValue(thisRef: View, property: KProperty<*>): String? {
        return value
    }

    override fun setValue(thisRef: View, property: KProperty<*>, value: String?) {
        this.value = value
        textView.text = value
        textView.isGone = hideWhenEmpty && value.isNullOrEmpty()
    }
}
