package glass.yasan.para.string.name

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class ParaStringNameFullFamous : PreviewParameterProvider<String> {
    override val values: Sequence<String> = sequenceOf(
        "Eddie Murphy",
        "Morgan Freeman",
        "Elton John",
        "Michelle Obama",
        "Oprah Winfrey",
        "Mariah Carey",
        "Betty White",
        "Bill Gates",
        "Whoopi Goldberg",
        "Keanu Reeves",
    )
}