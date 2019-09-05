package hu.autsoft.customviewsarticle.infocard

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import hu.autsoft.customviewsarticle.R

class InfoCard : FrameLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        inflate(context, R.layout.view_info_card, this)
    }

}
