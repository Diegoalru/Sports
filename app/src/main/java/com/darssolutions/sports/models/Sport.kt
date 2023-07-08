package com.darssolutions.sports.models

import androidx.annotation.DrawableRes
import com.darssolutions.sports.R

data class Sport(
    val id: Int,
    val titleResourceId: Int,
    val subTitleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val sportsImageBanner: Int,
    val newsDetails: Int = R.string.sports_news_detail_text
)
