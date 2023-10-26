fun removeItems() {
    var continueRemove = true

    println(" ______     ______     __    __     ______     __   __   ______    \n" +
            "/\\  == \\   /\\  ___\\   /\\ \"-./  \\   /\\  __ \\   /\\ \\ / /  /\\  ___\\   \n" +
            "\\ \\  __<   \\ \\  __\\   \\ \\ \\-./\\ \\  \\ \\ \\/\\ \\  \\ \\ \\'/   \\ \\  __\\   \n" +
            " \\ \\_\\ \\_\\  \\ \\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_____\\  \\ \\__|    \\ \\_____\\ \n" +
            "  \\/_/ /_/   \\/_____/   \\/_/  \\/_/   \\/_____/   \\/_/      \\/_____/ \n" +
            "                                                                   ")

    while (continueRemove) {
        println("[S]how your items  " +
                "[R]emove items  " +
                "[B]ack  ")

        when (readln().replaceFirstChar { it.uppercaseChar() }) {
            "S" -> listInventory()
            "R" -> {
                print("Enter the item name you want to destroy: ")
                val itemName = readln().trim()
                removeFromInventory(itemName)
            }
            "B" -> continueRemove = false
            else -> {
                println("Invalid Option ")
                println("--------------------------------------------------")
            }
        }
    }
    main()
}