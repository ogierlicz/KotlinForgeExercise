fun forgeItems() {
    var continueForge = true

    println(" ______   ______     ______     ______     ______    \n" +
            "/\\  ___\\ /\\  __ \\   /\\  == \\   /\\  ___\\   /\\  ___\\   \n" +
            "\\ \\  __\\ \\ \\ \\/\\ \\  \\ \\  __<   \\ \\ \\__ \\  \\ \\  __\\   \n" +
            " \\ \\_\\    \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\  \\ \\_____\\ \n" +
            "  \\/_/     \\/_____/   \\/_/ /_/   \\/_____/   \\/_____/ \n" +
            "                                                     ")

    while (continueForge) {
        println("[S]how available items  " +
                "[F]orge  " +
                "[B]ack  ")

        when (readln().replaceFirstChar { it.uppercaseChar() }) {
            "S" -> listItems()
            "F" -> {
                print("Enter the item name you want to forge: ")
                val itemName = readln().trim()

                print("Choose dice type (d10 or d20): ")
                val diceType = readln().trim()

                addToInventory(itemName, diceType)
            }
            "B" -> continueForge = false
            else -> {
                println("Invalid option")
                println("--------------------------------------------------")
            }
        }
    }
    main()
}
