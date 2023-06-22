fun main(args: Array<String>) {
    val amount: Int = 10000
    val feeStart: Int = (amount*0.75/100).toInt()
    val feeResult: Int = if (feeStart <= 35) (35) else (feeStart)
    println("Transaction fee: $feeResult")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}