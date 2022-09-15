package dev.yasan.para.string.name

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class ParaStringNameFirst : PreviewParameterProvider<String> {
    override val values: Sequence<String> = sequenceOf(
        "Brad",
        "Knute",
        "Jerrie",
        "Janelle",
        "Kurt",
        "Zenia",
        "Conor",
        "Hollie",
        "Brant",
        "Archie",
    )
}