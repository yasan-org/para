package glass.yasan.para.string.username

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class ParaStringUsernameWithAtSign : PreviewParameterProvider<String> {
    override val values: Sequence<String> = sequenceOf(
        "@selenagomez",
        "@kyliejenner",
        "@therock",
        "@arianagrande",
        "@kimkardashian",
        "@ladygaga",
        "@nickiminaj",
        "@jlo",
        "@badgalriri",
        "@nasa",
    )
}