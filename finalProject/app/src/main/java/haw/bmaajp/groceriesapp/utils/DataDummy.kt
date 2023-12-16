package haw.bmaajp.groceriesapp.utils

import haw.bmaajp.groceriesapp.R
import haw.bmaajp.groceriesapp.domain.model.AboutItem
import haw.bmaajp.groceriesapp.domain.model.CategoryItem
import haw.bmaajp.groceriesapp.domain.model.ProductItem
import haw.bmaajp.groceriesapp.ui.theme.*

object DataDummy {

    fun generateDummyProduct(): List<ProductItem> {
        return listOf(
            ProductItem(
                id = 1,
                title = "Boots",
                description = "",
                image = R.drawable.product1,
                unit = "1pcs, Price",
                price = 6.52,
                nutritions = "50gr",
                review = 3.5,
            ),
            ProductItem(
                id = 2,
                title = "Bag",
                description = "",
                image = R.drawable.product2,
                unit = "10pcs, Price",
                price = 2.50,
                nutritions = "150gr",
                review = 5.0
            ),
            ProductItem(
                id = 3,
                title = "Perfume",
                description = "",
                image = R.drawable.product3,
                unit = "1pcs, Price",
                price = 7.5,
                nutritions = "100gr",
                review = 4.0
            ),
            ProductItem(
                id = 4,
                title = "Perfume 2",
                description = "",
                image = R.drawable.product4,
                unit = "1pcs, Price",
                price = 9.5,
                nutritions = "90gr",
                review = 4.7
            ),
            ProductItem(
                id = 5,
                title = "Sleepers blue",
                description = "",
                image = R.drawable.product5,
                unit = "20pcs, Price",
                price = 2.0,
                nutritions = "50gr",
                review = 4.2
            ),
            ProductItem(
                id = 6,
                title = "Socks",
                description = "",
                image = R.drawable.product6,
                unit = "1pcs, Price",
                price = 1.5,
                nutritions = "10gr",
                review = 3.8
            ),
            ProductItem(
                id = 7,
                title = "Sleepers",
                description = "",
                image = R.drawable.product7,
                unit = "1pcs, Price",
                price = 5.0,
                nutritions = "70gr",
                review = 3.0
            ),
            ProductItem(
                id = 8,
                title = "Shoes",
                description = "It is a very clear liquid from which the pulp has been removed. This juice is often used to flavor meats, or as an ingredient in dressings and sauces, adding a sweet apple flavor.",
                image = R.drawable.product8,
                unit = "1pcs, Price",
                price = 6.5,
                nutritions = "100gr",
                review = 4.2
            ),
            ProductItem(
                id = 9,
                title = "Pins",
                description = "Orange juice is a fruit juice obtained by squeezing, pressing or otherwise crushing the interior of an orange. Orange juice is a nutrition powerhouse with naturally occurring vitamins and minerals and many antioxidants.",
                image = R.drawable.product9,
                unit = "1pcs, Price",
                price = 5.54,
                nutritions = "100gr",
                review = 4.7
            ),
            ProductItem(
                id = 10,
                title = "Jackets",
                description = "A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa. In some countries, bananas used for cooking may be called \"plantains\", distinguishing them from dessert bananas.",
                image = R.drawable.product10,
                unit = "8pcs, Price",
                price = 9.10,
                nutritions = "100gr",
                review = 4.5
            ),
        )
    }

    fun generateDummyCategories(): List<CategoryItem> {
        return listOf(
            CategoryItem(
                title = "Clothing",
                image = R.drawable.category1,
                background = BackgroundCategory1
            ),
            CategoryItem(
                title = "Footwear",
                image = R.drawable.category2,
                background = BackgroundCategory2
            ),
            CategoryItem(
                title = "Bags",
                image = R.drawable.category3,
                background = BackgroundCategory3
            ),
            CategoryItem(
                title = "Perfume",
                image = R.drawable.category4,
                background = BackgroundCategory4
            ),
            CategoryItem(
                title = "Socks",
                image = R.drawable.category5,
                background = BackgroundCategory5
            ),
            CategoryItem(
                title = "Souvenirs",
                image = R.drawable.category6,
                background = BackgroundCategory6
            )
        )
    }

    fun generateDummyAbout(): List<AboutItem> {
        return listOf(
            AboutItem(
                image = R.drawable.ic_orders,
                title = "Orders"
            ),
            AboutItem(
                image = R.drawable.ic_my_details,
                title = "My Details"
            ),
            AboutItem(
                image = R.drawable.ic_address,
                title = "Delivery Address"
            ),
            AboutItem(
                image = R.drawable.ic_payment,
                title = "Payment"
            ),
            AboutItem(
                image = R.drawable.ic_notification,
                title = "Notification"
            ),
        )
    }

}