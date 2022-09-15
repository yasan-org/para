package dev.yasan.para.bool

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class ParaBooleanNullable : PreviewParameterProvider<Boolean?> {

    override val values = sequenceOf(
        true,
        false,
        null,
    )

}