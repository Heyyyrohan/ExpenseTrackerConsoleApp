import ExpenseManager
fun main(){
    println("Welcome to Expense Tracker ")
    val e = ExpenseManager()

    while (true){
        println("\nChoose the action :")
        println("1. Add Expense ")
        println("2. Show All Expenses ")
        println("3. Show Total Expense ")
        println("4. Quit\n")

        val n = readln().toInt()

        when(n){
            1 -> {
                println("Enter Amount : ")
                val amount = readln()?.toDoubleOrNull()

                if(amount == null || amount <=0)   {
                    println("Invalid Amount ")
                    continue
                }

                println("Enter Category : ")
                val cat = readln()?.trim().orEmpty()

                println("Enter Note : ")
                val note = readln()?.trim().orEmpty()

                e.addExpense(amount, cat,note)

            }

            2 -> e.showExpenses()

            3 -> e.totalExpenses()

            4 -> {
                println("Thank you ") ;
                break
            }

            else -> println("Invalid Input ")

        }
    }



}