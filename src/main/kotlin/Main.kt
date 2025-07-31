
fun main() {
    val responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")
    var responsibilitiesComplete = 0
    var timeSpent = 0
    val totalShiftTime = 4

    val foxiesHealthCheck = mutableMapOf<String, Any?>("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

    println("First, ${responsibilities[0]}.")

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


}