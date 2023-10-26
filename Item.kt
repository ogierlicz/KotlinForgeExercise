data class Item(
    val name: String,
    var durability: Int,
    val description: String,
    var usageCounter: Int = 0,
    val rarity: String
)

fun addItems(): List<Item> {
    return mutableListOf(
        Item("Axe", 0, "A gleaming enchanted axe forged from ancient starlight, capable of cleaving through reality itself.", 0, "Mythic"),
        Item("Shield", 0, "A majestic shield adorned with mystical runes, offering impenetrable defense against the darkest of sorceries.", 0, "Rare"),
        Item("Sword", 0, "A legendary blade infused with the essence of dragons, granting its wielder unmatched power and precision.", 0, "Legendary"),
        Item("Dagger", 0, "A shadowy dagger crafted from obsidian, whispering promises of swift and silent demise to its master.", 0, "Legendary"),
        Item("Staff", 0, "A towering staff carved from the World Tree, channeling nature's raw energy to unleash devastating spells upon foes.", 0, "Epic"),
        Item("Bow", 0, "A celestial bow crafted from ethereal moonwood, its arrows guided by the light of distant stars, striking with unparalleled accuracy.", 0, "Mythic"),
        Item("Hammer", 0, "An ancient hammer imbued with the fury of thunderstorms, capable of shattering mountains and foes alike with a single mighty swing.", 0, "Rare"),
        Item("Crossbow", 0, "A crossbow of eldritch design, crafted by enigmatic artisans, firing bolts infused with elemental chaos, wreaking havoc upon targets from afar.", 0, "Epic"),
        Item("Halberd", 0, "A majestic halberd forged from celestial metals, its razor-sharp blade and radiant energy can cut through the strongest armor and the darkest magic.", 0, "Uncommon"),
        Item("Scythe", 0, "A deathly scythe with a blade as black as the void, reaping the souls of the fallen and harnessing their essence to fuel its wielder's unholy power", 0, "Uncommon")
    )
}

val items = addItems()