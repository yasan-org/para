package glass.yasan.para.string.sentence

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class ParaStringSentenceShort : PreviewParameterProvider<String> {
    override val values: Sequence<String> = sequenceOf(
        "He colored deep space a soft yellow.",
        "Her fragrance of choice was fresh garlic.",
        "Tom got a small piece of pie.",
        "It must be five o'clock somewhere.",
        "So long and thanks for the fish.",
        "I hear that Nancy is very pretty.",
        "Love is not like pizza.",
        "Iguanas were falling out of the trees.",
        "We should play with legos at camp.",
        "I'd rather be a bird than a fish.",
    )
}