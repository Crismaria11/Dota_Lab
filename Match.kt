class Match<T>: Narrator {
    var allTeams: ArrayList<Team> = arrayListOf()
    var deathTeams: ArrayList<Team> = arrayListOf()
    var winner: String = ""

    fun welcoming() {
        narrate("Welcome!")
    }
    fun startGame(){
    }
    fun aKillHappened(esRadiant: Boolean) {

    }
    fun moreKillsHappened(esRadiant: Boolean) {

    }
    fun fiveKillsHappened(esRadiant: Boolean) {

    }
    fun towerIsKilled(esRadiant: Boolean) {

    }
    fun direWinner() {
        winner = "Dire"

    }
    fun radiantWinner() {
        winner = "Radiant"

    }
}