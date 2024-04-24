package com.kma.supervision.app.presentation.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.joujonaapp.R


val SfPro = FontFamily(
    Font(R.font.siemens_sans_bold, FontWeight.Bold),
    Font(R.font.siemens_sans_bold, FontWeight.Medium),
    Font(R.font.siemens_sans_roman, FontWeight.Light),
    Font(R.font.siemens_sans_roman, FontWeight.Normal)
)
val Typography = Typography(

    h1 = TextStyle(
        fontFamily = SfPro ,
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp,
        lineHeight = 32.sp,
        color = GrayScale100),

    h2 = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        color = GrayScale100
    ),
    h3 = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp,
        color = GrayScale100
    ),
    h4 = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        color = GrayScale100
    ),
    h5 = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        color = GrayScale100
    ),
    body1 = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        color = GrayScale100
    ),
    body2 = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        color = GrayScale100
    ),
    caption = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        color = GrayScale100
    ),
    subtitle1 = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        color = GrayScale100
    ),
    subtitle2 = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = GrayScale100
    ),
    overline = TextStyle(
        fontFamily = SfPro,
        fontWeight = FontWeight.Medium,
        color = GrayScale100,
        fontSize = 16.sp

    )

)
