package teka.android.smoothrufaaandroidclient.utils

data class BadgeState(
    val count: Int,
    val isVisible: Boolean
) {
    companion object {
        val Empty = BadgeState(0, false)
    }
}