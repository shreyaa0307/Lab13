
fun main() {

    // 1. Hello Kotlin
    println("Hello Kotlin!!!")


    // 2. Employee bonus calculation
    println("\n----- EMPLOYEE BONUS -----")

    print("Enter department code (IT, HR, SALES): ")
    val deptCode = readLine()!!.trim().uppercase()

    print("Enter years of experience: ")
    val years = readLine()!!.toInt()

    print("Enter employee salary: ")
    val salary = readLine()!!.toDouble()

    val bonusPercentage = when {
        deptCode == "IT" && years > 5 -> 20
        deptCode == "HR" && years > 3 -> 15
        deptCode == "SALES" && years > 2 -> 12
        else -> 10
    }

    val bonus = salary * bonusPercentage / 100

    println("Bonus percentage: $bonusPercentage%")
    println("Bonus amount: ₹$bonus")


    // 3. Average of individual digits
    println("\n----- DIGIT AVERAGE -----")

    print("Enter an integer: ")
    val number = readLine()!!.toInt()

    val digits = number.toString()
        .removePrefix("-")
        .map { it.toString().toInt() }

    val average = digits.average()

    println("Digits: $digits")
    println("Average of digits: $average")
}
