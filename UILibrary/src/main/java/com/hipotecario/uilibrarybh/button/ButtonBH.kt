package com.hipotecario.uilibrarybh.button

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import com.hipotecario.androidlibrary.R

class ButtonBH @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
): LinearLayout(context, attrs, defStyleAttr, defStyleRes) {
    val buttonLogin: Button
    init {
        val view = LayoutInflater.from(context).inflate(R.layout.button_bh, this, true)

        buttonLogin = view.findViewById(R.id.buttonLogin)
    }
}