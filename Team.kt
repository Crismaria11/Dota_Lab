class Team (val teamsName: String, val hero: ArrayList<Hero> = arrayListOf(),
            val tower: ArrayList<Tower> = arrayListOf(), val ancient: Ancient = Ancient()) {
    fun moreTowers() {
        tower.add(Tower())
        tower.add(Tower())
        tower.add(Tower())
        tower.add(Tower())
        tower.add(Tower())
        tower.add(Tower())
    }
}