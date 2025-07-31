
fun main() {

    // Preparing for the day

    val responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")
    var responsibilitiesComplete = 0
    var timeSpent = 0
    val totalShiftTime = 4

    val foxiesHealthCheck = mutableMapOf<String, Any?>("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

    println("First, ${responsibilities[0]}.")

    // Feeding the Chimps

    println("Feeding Bonnie...")
    foxiesHealthCheck["Bonnie"] = true
    responsibilitiesComplete++
    timeSpent++

    println("Feeding Jubilee...")
    foxiesHealthCheck["Jubilee"] = true
    responsibilitiesComplete++
    timeSpent++

    println("Feeding Frodo...")
    foxiesHealthCheck["Frodo"] = true
    responsibilitiesComplete++
    timeSpent++

    println("Feeding Foxie...")
    foxiesHealthCheck["Foxie"] = true
    responsibilitiesComplete++
    timeSpent++

    println("All chimps have now been fed! You've completed $responsibilitiesComplete / $totalShiftTime responsibilities.")

    // Playing a Random Game

    println("Next, ${responsibilities[1]}")

    val games = setOf("tug-of-war with a blanket", "catch and throw", "number game")
    val randomGame = games.random()
    println(randomGame)

    println("Each chimp has now played a game of ${randomGame}! You've completed ${responsibilitiesComplete} / $totalShiftTime responsibilities.")


}