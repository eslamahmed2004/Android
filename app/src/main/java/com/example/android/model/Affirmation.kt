package com.example.android.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes  val stringResourceId: Int,

    @StringRes  val aboutStringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
