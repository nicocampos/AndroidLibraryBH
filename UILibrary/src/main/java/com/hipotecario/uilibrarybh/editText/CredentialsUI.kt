package com.hipotecario.uilibrarybh.editText

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.hipotecario.androidlibrary.R
import com.hipotecario.androidlibrary.databinding.CredentialsUiBinding

class CredentialsUI @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
): LinearLayout(context, attrs, defStyleAttr, defStyleRes) {
    private var binding: CredentialsUiBinding

    val tvDni: TextView
    val editTextDni: EditText
    val layoutUser: TextView
    val rlUser: RelativeLayout
    val editTextUser: EditText
    val ivUserToggle: ImageView
    val layoutPassword: TextView
    val rlAAA: RelativeLayout
    val editTextPassword: EditText
    val ivBuhoPassToggle: ImageView

    init {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.credentials_ui, this, true)

        binding = CredentialsUiBinding.bind(view)

        tvDni = binding.tvDni
        editTextDni = binding.editTextDni
        layoutUser = binding.layoutUser
        rlUser = binding.rlUser
        editTextUser = binding.editTextUser
        ivUserToggle = binding.ivUserToggle
        layoutPassword = binding.layoutPassword
        rlAAA = binding.rlAAA
        editTextPassword = binding.editTextPassword
        ivBuhoPassToggle = binding.ivBuhoPassToggle
    }
}