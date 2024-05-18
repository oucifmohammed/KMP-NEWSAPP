package theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import newsapp.composeapp.generated.resources.Res
import newsapp.composeapp.generated.resources.poppins_bold
import newsapp.composeapp.generated.resources.poppins_regular
import newsapp.composeapp.generated.resources.poppins_semibold
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

@OptIn(ExperimentalResourceApi::class)
val Poppins: FontFamily
    @Composable get() = FontFamily(
    fonts = listOf(
        Font(Res.font.poppins_regular, FontWeight.Normal),
        Font(Res.font.poppins_bold, FontWeight.Bold),
        Font(Res.font.poppins_semibold, FontWeight.SemiBold),
    )
)


// Set of Material typography styles to start with
// body is "Text" in the Figma Design
// label small is xsmall in Figma Design

val Typography: Typography
    @Composable get() = Typography(
    displaySmall = TextStyle(
        fontSize = 24.sp,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Normal,
        lineHeight = 36.sp,
    ),
    displayMedium = TextStyle(
        fontSize = 32.sp,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Normal,
        lineHeight = 48.sp,
    ),
    bodySmall = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Normal,
        lineHeight = 21.sp,
    ),
    bodyMedium = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
    ),
    labelSmall = TextStyle(
        fontSize = 13.sp,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Normal,
        lineHeight = 19.sp,
    ),
)