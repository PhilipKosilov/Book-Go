package com.example.bookgo.core.domain.models

import android.widget.Toast

data class ToastEvent(val messageResId: Int, val duration: Int = Toast.LENGTH_SHORT)