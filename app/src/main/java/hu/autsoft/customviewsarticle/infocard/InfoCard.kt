package hu.autsoft.customviewsarticle.infocard

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.core.view.isVisible
import hu.autsoft.customviewsarticle.R
import kotlinx.android.synthetic.main.view_info_card.view.*
import kotlin.properties.Delegates

class InfoCard : FrameLayout {

    var title: String? by Delegates.observable(null) { _, _, newTitle ->
        infoCardTitleText.text = newTitle
        infoCardTitleText.isVisible = !newTitle.isNullOrEmpty()
    }

    var content: String? by Delegates.observable(null) { _, _, newContent ->
        infoCardContentText.text = newContent
        infoCardContentText.isVisible = !newContent.isNullOrEmpty()
    }

    var icon: Drawable? by Delegates.observable(null) { _, _, newIcon ->
        infoCardImage.setImageDrawable(newIcon)
        infoCardImage.isVisible = newIcon != null
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initView(attrs)
    }

    init {
        inflate(context, R.layout.view_info_card, this)
    }

    private fun initView(attrs: AttributeSet?) {
        attrs ?: return

        val attributeValues = context.obtainStyledAttributes(attrs, R.styleable.InfoCard)
        with(attributeValues) {
            try {
                icon = getDrawable(R.styleable.InfoCard_ic_icon)
                title = getString(R.styleable.InfoCard_ic_title)
                content = getString(R.styleable.InfoCard_ic_content)
            } finally {
                recycle()
            }
        }
    }

}
