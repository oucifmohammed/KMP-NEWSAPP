package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    background = Black,
    primary = Blue,
    error = DarkRed,
    surface = LightBlack
)

private val LightColorScheme = lightColorScheme(
    background = Color.White,
    primary = Blue,
    error = LightRed,
    surface = Color.White
)

@Composable
fun NewsAppTheme(isDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if(isDarkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}