fun useItems() {
    var continueUse = true

    println(" __  __     ______     ______    \n" +
            "/\\ \\/\\ \\   /\\  ___\\   /\\  ___\\   \n" +
            "\\ \\ \\_\\ \\  \\ \\___  \\  \\ \\  __\\   \n" +
            " \\ \\_____\\  \\/\\_____\\  \\ \\_____\\ \n" +
            "  \\/_____/   \\/_____/   \\/_____/ \n" +
            "                                 ")

    while (continueUse) {
        println("[S]how your items  " +
                "[U]se item  " +
                "[B]ack  ")

        when (readln().replaceFirstChar { it.uppercaseChar() }) {
            "S" -> listInventory()
            "U" -> {
                print("Enter the item name you want to use: ")
                val itemName = readln().trim()
                useFromInventory(itemName)
            }
            "B" -> continueUse = false
            else -> {
                println("Invalid Option ")
                println("--------------------------------------------------")
            }
        }
    }
    main()
}