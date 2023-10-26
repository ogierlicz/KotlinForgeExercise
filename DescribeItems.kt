fun describeItems() {
    var continueDescribe = true

    println(" _____     ______     ______     ______     ______     __     ______     ______    \n" +
            "/\\  __-.  /\\  ___\\   /\\  ___\\   /\\  ___\\   /\\  == \\   /\\ \\   /\\  == \\   /\\  ___\\   \n" +
            "\\ \\ \\/\\ \\ \\ \\  __\\   \\ \\___  \\  \\ \\ \\____  \\ \\  __<   \\ \\ \\  \\ \\  __<   \\ \\  __\\   \n" +
            " \\ \\____-  \\ \\_____\\  \\/\\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_\\  \\ \\_____\\  \\ \\_____\\ \n" +
            "  \\/____/   \\/_____/   \\/_____/   \\/_____/   \\/_/ /_/   \\/_/   \\/_____/   \\/_____/ \n" +
            "                                                                                   ")

    while (continueDescribe) {
        println("[S]how your items  " +
                "[D]escribe item  " +
                "[B]ack  ")

        when (readln().replaceFirstChar { it.uppercaseChar() }) {
            "S" -> listInventory()
            "D" -> {
                print("Enter the item name to get its description: ")
                val itemName = readln().trim()
                describeFromInventory(itemName)
            }
            "B" -> continueDescribe = false
            else -> {
                println("Invalid option ")
                println("--------------------------------------------------")
            }
        }
    }
    main()
}