<h1>💰 Expense Tracker – Kotlin Console Application</h1>

<p>
A <b>simple console-based Expense Tracker</b> built using <b>Kotlin</b>, created to practice and demonstrate
core programming and object-oriented concepts in a clean, menu-driven way.
</p>

<h2>✨ Features</h2>
<ul>
  <li>➕ <b>Add Expenses</b> – Record amount, category, and note.</li>
  <li>📋 <b>View All Expenses</b> – Display all recorded entries.</li>
  <li>🧮 <b>Total Calculation</b> – Calculate total money spent.</li>
  <li>❌ <b>Safe Exit</b> – Quit the application gracefully.</li>
  <li>✅ <b>Input Validation</b> – Prevents invalid amount entries.</li>
  <li>🧭 <b>Menu-Driven Interface</b> – Simple and easy-to-use console menu.</li>
</ul>

<h2>🧠 How It Works</h2>
<p>
The application runs inside an infinite <code>while</code> loop and continuously shows a menu.
User input is handled using a <code>when</code> expression to trigger the correct action.
</p>

<h3>📌 Expense (Data Class)</h3>
<p>Represents a single expense entry.</p>
<pre><code>data class Expense(
    val amount: Double,
    val category: String,
    val note: String
)</code></pre>

<h3>📌 ExpenseManager (Logic Class)</h3>
<p>Handles all expense-related operations:</p>
<ul>
  <li>Add new expense</li>
  <li>Display all expenses</li>
  <li>Calculate total expenses</li>
</ul>

<h3>📌 main() Function</h3>
<ul>
  <li>Displays the menu</li>
  <li>Reads user input</li>
  <li>Calls appropriate methods based on the selected option</li>
</ul>

<h2>📂 Project Structure</h2>
<code>
├── Main.kt<br>
├── ExpenseManager.kt<br>
└── Expense.kt
</code>

<h2>🖥 Sample Output</h2>
<pre><code>Welcome to Expense Tracker

Choose the action :
1. Add Expense
2. Show All Expenses
3. Show Total Expense
4. Quit

Expense added Successfully...
1. 250.0 || Food || Lunch
2. 100.0 || Travel || Bus fare
The total spent : 350.0
</code></pre>

<h2>🛠 Technologies Used</h2>
<ul>
  <li><b>Language:</b> Kotlin (JVM)</li>
  <li><b>Core Concepts:</b> Classes, Data Classes, OOP</li>
  <li><b>Control Flow:</b> <code>when</code>, <code>while</code></li>
  <li><b>Collections:</b> <code>mutableListOf</code></li>
  <li><b>I/O:</b> Console-based user input</li>
</ul>

<h2>🎯 Purpose of This Project</h2>
<ul>
  <li>Learn Kotlin fundamentals</li>
  <li>Practice object-oriented programming</li>
  <li>Build confidence with console applications</li>
  <li>Showcase logic and structure on GitHub / LinkedIn</li>
</ul>

<h2>📜 License</h2>
<p>
Free to use for <b>learning and practice purposes</b>.
</p>
