package onBoarding.presentation

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource

data class Page @OptIn(ExperimentalResourceApi::class) constructor(
    val title: StringResource,
    val description: StringResource,
    val image: DrawableResource,
)