
class Student(
    private var rollNo: Int,
    private var name: String,
    private var course: String,
    private var percentage: Double
) {

    // Function to update student details
    fun updateDetails() {
        println("\nEnter student details:")

        print("Roll number: ")
        rollNo = readLine()!!.toInt()

        print("Name: ")
        name = readLine()!!

        print("Course: ")
        course = readLine()!!

        print("Percentage: ")
        percentage = readLine()!!.toDouble()
    }

    // Function to display student details
    fun displayDetails() {
        println("\n----- STUDENT DETAILS -----")
        println("Roll Number: $rollNo")
        println("Name: $name")
        println("Course: $course")
        println("Percentage: $percentage%")
    }
}


fun main() {

    // Creating the first student object
    val student1 = Student(1, "Aman", "B.Tech", 85.0)

    println("Student 1")
    student1.updateDetails()
    student1.displayDetails()


    // Creating the second student object
    val student2 = Student(2, "Riya", "BCA", 90.0)

    println("\nStudent 2")
    student2.updateDetails()
    student2.displayDetails()
}
