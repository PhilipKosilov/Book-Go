package com.example.bookgo.core.utils.manager

import android.widget.Toast
import androidx.annotation.StringRes

data class ToastEvent(@StringRes val messageResId: Int, val duration: Int = Toast.LENGTH_SHORT)