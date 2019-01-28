package components.appbar

import components.BaseMaterialAttributes
import components.appbar.enums.AppBarColor
import components.appbar.enums.AppBarPosition

interface AppBarAttributes : BaseMaterialAttributes {
    var classes: Any
    var color: AppBarColor
    var position: AppBarPosition
}