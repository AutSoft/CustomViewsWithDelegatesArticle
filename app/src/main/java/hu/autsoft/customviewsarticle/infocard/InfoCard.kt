package hu.autsoft.customviewsarticle.infocard

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.FrameLayout
import hu.autsoft.customviewsarticle.R
import hu.autsoft.customviewsarticle.delegates.ImageViewDelegate
import hu.autsoft.customviewsarticle.delegates.TextViewDelegate
import kotlinx.android.synthetic.main.view_info_card.view.*

class InfoCard : FrameLayout {

    init {
        inflate(context, R.layout.view_info_card, this)
    }

    var title: String? by TextViewDelegate(infoCardTitleText)
    var content: String? by TextViewDelegate(infoCardContentText)
    var icon: Drawable? by ImageViewDelegate(infoCardImage)

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initView(attrs)
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
