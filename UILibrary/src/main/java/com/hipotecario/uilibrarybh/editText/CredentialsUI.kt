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

class CredentialsUI @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
): LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    val tvDni: TextView
    val editTextDni: EditText
    val layoutUser: TextView
    val rlUser: RelativeLayout
    val editTextUser: EditText
    val ivUserToggle: ImageView
    val layoutPassword: TextView
    val rl: RelativeLayout
    val editTextPassword: EditText
    val ivBuhoPassToggle: ImageView

    init {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.credentials_ui, this, true)


        tvDni = view.findViewById(R.id.tvDni)
//        tvDni = binding.tvDni
        editTextDni = view.findViewById(R.id.editTextDni)
//        editTextDni = binding.editTextDni
        layoutUser = view.findViewById(R.id.layoutUser)
//        layoutUser = binding.layoutUser
        rlUser = view.findViewById(R.id.rlUser)
//        rlUser = binding.rlUser
        editTextUser = view.findViewById(R.id.editTextUser)
//        editTextUser = binding.editTextUser
        ivUserToggle = view.findViewById(R.id.ivUserToggle)
//        ivUserToggle = binding.ivUserToggle
        layoutPassword = view.findViewById(R.id.layoutPassword)
//        layoutPassword = binding.layoutPassword
        rl = view.findViewById(R.id.rl)
//        rl = binding.rl
        editTextPassword = view.findViewById(R.id.editTextPassword)
//        editTextPassword = binding.editTextPassword
        ivBuhoPassToggle = view.findViewById(R.id.ivBuhoPassToggle)
//        ivBuhoPassToggle = binding.ivBuhoPassToggle
    }
}