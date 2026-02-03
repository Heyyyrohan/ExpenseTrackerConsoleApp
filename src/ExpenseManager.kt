public class ExpenseManager{
    val expenses = mutableListOf<Expense>()

    public fun addExpense(amount : Double, category : String, note : String){
        val expense = Expense(amount,category,note)
        expenses.add(expense)
        println("Expense added Successfully...\n")
    }

    fun showExpenses(){
        if(expenses.isEmpty()){
            println("There is no Expenses...\n")
        }else{
            expenses.forEachIndexed { index, expense ->
                println("${index + 1}. ${expense.amount} || ${expense.category} || ${expense.note}")
            }
        }
    }

    fun totalExpenses(){
        val total = expenses.sumOf { it.amount }
        println(" The total spent : $total\n")
    }

}