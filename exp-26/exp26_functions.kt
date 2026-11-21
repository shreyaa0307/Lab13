
fun main() {

    // 1. Function with default parameters
    fun greet(name: String = "Student", course: String = "Kotlin") {
        println("Hello, $name! Welcome to $course.")
    }

    println("----- DEFAULT PARAMETERS -----")
    greet()
    greet("Shreya", "Programming")


    // 2. Named arguments
    println("\n----- NAMED ARGUMENTS -----")
    greet(course = "Kotlin Lab", name = "Aarav")


    // 3. Vararg function
    println("\n----- VARARG -----")
    fun printNumbers(vararg numbers: Int) {
        for (number in numbers) {
            print("$number ")
        }
        println()
    }

    printNumbers(10, 20, 30, 40, 50)


    // 4. Higher-order function
    println("\n----- HIGHER-ORDER FUNCTION -----")

    fun applyOperation(numbers: List<Int>, operation: (Int) -> Int) {
        val result = numbers.map(operation)
        println("Original list: $numbers")
        println("Result: $result")
    }

    val values = listOf(1, 2, 3, 4, 5)

    applyOperation(values) { it * it }
    applyOperation(values) { it * 2 }
}
