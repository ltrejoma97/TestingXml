package com.kma.supervision.app.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object Palette {

    // Principal colors
    val white = Color(0xFFFDFDFD)
    val black = Color(0xFF050505)
    val gray50 = Color(0xFFF3F4F8)
    val gray70 = Color(0xFFE0E5EC)
    val gray90 = Color(0xFF8292AC)
    val grayButton = Color(0xFFE2E2E6)

    // Button - Primary
    val blue = Color(0xFF007AFF)
    val red = Color(0xFFFF6464)

    //val gray100 = Color(0XFF414141)
    //val black30 = Color(0xFF1E1E1E)
    val black40 = Color(0xFF282828)
    val black50 = Color(0xFF323232)
    val borderPersonal = Color(0XFFF29B3A)
    val borderCommercial = Color(0XFF5756CE)
    val workerTag = Color(0XFFFDF0D6)
    val managerTag = Color(0XFFC8E1E8)
    val workerTagDark = Color(0XFF5b5145)
    val managerTagDark = Color(0XFF2a3849)
    val circleBlack = Color(0XFF4B4B4B)
}

private val DarkColorPalette = darkColors(
    primary = Palette.blue,
    onPrimary = Palette.white ,
    background = Black30,
    onBackground = Palette.white,
    primaryVariant = Palette.gray50,
    secondary = Palette.black40,
    onSecondary = Palette.black50 ,
    secondaryVariant = Palette.gray90,
    error = Palette.red,
    surface = BlackSurface,

)

private val LightColorPalette = lightColors(
    primary = Palette.blue,
    onPrimary = Palette.white ,
    background = Color.White,
    onBackground = Palette.black ,
    primaryVariant = Palette.gray50,
    secondary = Palette.gray70,
    onSecondary= Palette.gray50 ,
    secondaryVariant = Palette.gray90,
    error = Palette.red,
    surface = WhiteSurface
    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun SupervisionAppTheme(
    darkTheme: Boolean =false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}