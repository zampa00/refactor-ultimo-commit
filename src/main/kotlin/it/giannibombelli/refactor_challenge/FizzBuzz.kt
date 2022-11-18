package it.giannibombelli.refactor_challenge

class FizzBuzz : FizzBuzzInterface {
    override fun say(number: Int): String {
        var accumulator = ""

        accumulator += isNumberDivisibleFor(number, 3, "Fizz")
        accumulator += isNumberDivisibleFor(number, 5, "Buzz")

        return accumulator.ifEmpty { number.toString() }
    }

    private fun isNumberDivisibleFor(number: Int, i: Int, s: String) = if (number % i == 0) s else ""
}
