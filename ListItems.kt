fun listItems() {
    println("Available items: \n")
    items.forEach { item ->
        println("Name: ${item.name}")
        println("Durability: ???")
        println("Description: ${item.description}")
        println("--------------------------------------------------")
    }
}