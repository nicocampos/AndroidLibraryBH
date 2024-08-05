package com.hipotecario.uilibrarybh.editText

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.hipotecario.androidlibrary.R
import com.hipotecario.androidlibrary.databinding.CredentialsUiBinding

class CredentialsUI @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
): LinearLayout(context, attrs, defStyleAttr, defStyleRes) {
    private var binding: CredentialsUiBinding

    init {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.credentials_ui, this, true)

        binding = CredentialsUiBinding.bind(view)
    }

    fun setDNI(dni:String) {
        binding.tvDni.text = dni
    }
}