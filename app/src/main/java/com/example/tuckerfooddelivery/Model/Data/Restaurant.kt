package com.example.tuckerfooddelivery.Model.Data

data class Restaurant(
    val name: String = "",
    val id: String = "",
    val contact: Contact = Contact(),
    val menu: Menu = Menu()
)

data class Contact(
    val phone: String = "",
    val email: String = ""
)

data class Menu(
    val category: String = "",
    val items: Item = Item() //List<Item> = listOf()
)

data class Item(
    val name: String = "",
    val price: Double = 0.0,
    val images: String = ""
)

/*
class Restaurant {
    var name: String = ""
    var id: String = ""
    var contact: Contact = Contact()
    var menu: Menu = Menu()

    constructor()

    constructor(name: String, id: String, contact: Contact, menu: Menu) {
        this.name = name
        this.id = id
        this.contact = contact
        this.menu = menu
    }
}

class Contact {
    var phone: String = ""
    var email: String = ""

    constructor()

    constructor(phone: String, email: String) {
        this.phone = phone
        this.email = email
    }
}

class Menu {
    var category: String = ""
    var items: Items = Items()

    constructor()

    constructor(category: String, items : Items) {
        this.category = category
        this.items = items
    }
}

class Items {
    var name: String = "" ,
    var price : Double =  0.0 ,
    var images : String = ""

    constructor()

    constructor( name: String, price : Double, images : String) {
        this.name = name
        this.price = price
        this.images = images
    }
}

*/
