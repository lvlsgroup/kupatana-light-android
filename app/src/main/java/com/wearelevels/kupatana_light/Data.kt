package com.wearelevels.kupatana_light

object Data {

    @JvmStatic
    val ads = (0..100).map { id ->
        val title = when (id % 9) {
            0 -> "Samsung Galaxy S9"
            1 -> "Philips 50' TV"
            2 -> "Iphone 7"
            3 -> "Toyota"
            4 -> "BMW"
            5 -> "Volvo"
            6 -> "T-shirt"
            7 -> "Jacket"
            8 -> "Shorts"
            else -> throw IllegalStateException("Won't happen.")
        }
        val category = when (id % 9) {
            in 0..2 -> "Electronics"
            in 3..5 -> "Cars"
            in 6..8 -> "Clothes"
            else -> throw IllegalStateException("Won't happen.")
        }
        val imageResId = when (id % 9) {
            3 -> R.drawable.toyota
            4 -> R.drawable.bmw
            else -> null
        }
        Ad(
            id,
            title,
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
            category,
            imageResId
        )
    }

}

data class Ad(
    val id: Int,
    val title: String,
    val description: String,
    val category: String,
    val imageResId: Int?
)