import Team
fun menu(): String {
    return """
        Menu:
        1. Ocurrieron muertes
        2. Matan torres
    """.trimIndent()
}
fun main(args: Array<String>) {
    val hero1 = Hero("Abaddon", "Strength")
    val hero2 = Hero.copy(name = "Alchemist")
    val hero3 = Hero.copy(name = "Axe")
    val hero4 = Hero.copy(name = "Beastmaster")
    val hero5 = Hero.copy(name = "Brewmaster")
    val hero6 = Hero.copy(name = "Bristleback")
    val hero7 = Hero.copy(name = "Clockwerk")
    val hero8 = Hero("Bloodseeker", "Agility")
    val hero9 = Hero("Broodmother", "Agility")
    val hero10 = Hero("Clinkz", "Agility")
    val hero11 = Hero("Gyrocopter", "Agility")
    val hero12 = Hero("Juggernaut", "Agility")
    val hero13 = Hero("Luna", "Agility")
    val hero14 = Hero("Medusa", "Agility")
    val hero15 = Hero("Bane", "Intelligence")
    val hero16 = Hero("Batrider", "Intelligence")
    val hero17 = Hero("Chen", "Intelligence")
    val hero18 = Hero("Dazzle", "Intelligence")
    val hero19 = Hero("Disruptor", "Intelligence")
    val hero20 = Hero("Enchantress", "Intelligence")

    val allTeams: ArrayList<Team> = arrayListOf()
    allTeams.add(Team("Radiant"))
    allTeams.add(Team("Dire"))

    




}