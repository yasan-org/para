package glass.yasan.para.bool

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class ParaBoolean : PreviewParameterProvider<Boolean> {

    override val values = sequenceOf(
        true,
        false,
    )

}