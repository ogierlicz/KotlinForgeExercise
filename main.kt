fun main() {
    var continueMain = true

    println(
        "\n" +
                " __     __     ______     __         ______     ______     __    __     ______    \n" +
                "/\\ \\  _ \\ \\   /\\  ___\\   /\\ \\       /\\  ___\\   /\\  __ \\   /\\ \"-./  \\   /\\  ___\\   \n" +
                "\\ \\ \\/ \".\\ \\  \\ \\  __\\   \\ \\ \\____  \\ \\ \\____  \\ \\ \\/\\ \\  \\ \\ \\-./\\ \\  \\ \\  __\\   \n" +
                " \\ \\__/\".~\\_\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_____\\ \n" +
                "  \\/_/   \\/_/   \\/_____/   \\/_____/   \\/_____/   \\/_____/   \\/_/  \\/_/   \\/_____/ \n"
    )

    while (continueMain) {
        println(
            "[F]orge items  " +
            "[R]emove items  " +
            "[D]escription of items  " +
            "[U]se items  " +
            "[I]nventory  " +
            "[Q]uit"
        )

        when (readln().replaceFirstChar { it.uppercaseChar() }) {
            "F" -> forgeItems()
            "R" -> removeItems()
            "D" -> describeItems()
            "U" -> useItems()
            "I" -> listInventory()
            "Q" -> System.exit(0)
            else -> {
                println("Invalid option")
                println("--------------------------------------------------")
            }
        }
    }
    main()
}
