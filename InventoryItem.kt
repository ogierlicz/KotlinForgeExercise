data class InventoryItem(
    val item: Item,
    var durability: Int
)

val inventory: MutableList<InventoryItem> = mutableListOf()

fun addToInventory(itemName: String, diceType: String) {
    val foundItem = items.find { it.name.equals(itemName, ignoreCase = true) }

    if (foundItem != null) {
        val durability = when (diceType) {
            "d10" -> (1..10).random()
            "d20" -> (1..20).random()
            else -> {
                println("Invalid dice type, durability set to 1")
                1
            }
        }

        val existingItem = inventory.find { it.item == foundItem }
        if (existingItem != null) {
            println("You already have $itemName in your inventory. Choose another item.")
        } else {
            inventory.add(InventoryItem(foundItem, durability))
            println("Added $itemName to inventory with durability: $durability")
        }
    } else {
        println("'$itemName' is not an available item.")
    }
    println("--------------------------------------------------")
}

fun removeFromInventory(itemName: String) {
    val foundItem = items.find { it.name.equals(itemName, ignoreCase = true) }

    if (foundItem != null) {
        val inventoryItem = inventory.find { it.item == foundItem }
        if (inventoryItem != null) {
            inventory.remove(inventoryItem)
            println("Removed $itemName from inventory")
        } else {
            println("You don't have $itemName in your inventory")
        }
    } else {
        println("No such item as '$itemName'")
    }
    println("--------------------------------------------------")
}

fun describeFromInventory(itemName: String) {
    val foundItem = items.find { it.name.equals(itemName, ignoreCase = true) }

    if (foundItem != null) {
        val inventoryItem = inventory.find { it.item == foundItem }
        if (inventoryItem != null) {
            println("\nName: ${foundItem.name}")
            println("Durability: ${inventoryItem.durability}")
            println("Description: ${foundItem.description}")
            println("Usage counter: ${foundItem.usageCounter}")
            println("Rarity: ${foundItem.rarity}")
        } else {
            println("You don't have $itemName in your inventory")
        }
    } else {
        println("No such item as '$itemName'")
    }
    println("--------------------------------------------------")
}

fun useFromInventory(itemName: String) {
    val foundItem = items.find { it.name.equals(itemName, ignoreCase = true) }

    if (foundItem != null) {
        val inventoryItem = inventory.find { it.item == foundItem }
        if (inventoryItem != null) {
            println("Using $itemName")
            foundItem.usageCounter++
            if (foundItem.usageCounter == inventoryItem.durability) {
                println("!!Oops looks like $itemName just broke")
                inventory.remove(inventoryItem)
            }
        } else {
            println("You don't have $itemName in your inventory")
        }
    } else {
        println("No such item as '$itemName'")
    }
    println("--------------------------------------------------")
}

fun listInventory() {
    println(" __     __   __     __   __   ______     __   __     ______   ______     ______     __  __    \n" +
            "/\\ \\   /\\ \"-.\\ \\   /\\ \\ / /  /\\  ___\\   /\\ \"-.\\ \\   /\\__  _\\ /\\  __ \\   /\\  == \\   /\\ \\_\\ \\   \n" +
            "\\ \\ \\  \\ \\ \\-.  \\  \\ \\ \\'/   \\ \\  __\\   \\ \\ \\-.  \\  \\/_/\\ \\/ \\ \\ \\/\\ \\  \\ \\  __<   \\ \\____ \\  \n" +
            " \\ \\_\\  \\ \\_\\\\\"\\_\\  \\ \\__|    \\ \\_____\\  \\ \\_\\\\\"\\_\\    \\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\/\\_____\\ \n" +
            "  \\/_/   \\/_/ \\/_/   \\/_/      \\/_____/   \\/_/ \\/_/     \\/_/   \\/_____/   \\/_/ /_/   \\/_____/ \n" +
            "                                                                                              ")
    inventory.forEach { inventoryItem ->
        println("Item: ${inventoryItem.item.name}")
        println("Durability: ${inventoryItem.durability}")
        println("--------------------------------------------------")
    }
}
