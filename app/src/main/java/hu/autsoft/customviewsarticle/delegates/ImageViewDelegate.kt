package hu.autsoft.customviewsarticle.delegates

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import androidx.core.view.isGone
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class ImageViewDelegate(
    private val imageView: ImageView,
    private val hideWhenEmpty: Boolean = true
) : ReadWriteProperty<View, Drawable?> {

    private var value: Drawable? = null

    override fun getValue(thisRef: View, property: KProperty<*>): Drawable? {
        return value
    }

    override fun setValue(thisRef: View, property: KProperty<*>, value: Drawable?) {
        this.value = value
        imageView.setImageDrawable(value)
        imageView.isGone = hideWhenEmpty && value == null
    }
}
