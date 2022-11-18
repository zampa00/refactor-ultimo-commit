package it.giannibombelli.refactor_challenge

class FizzBuzz : FizzBuzzInterface {
    override fun say(number: Int): String {
        var accumulator = ""

        accumulator += isNumberDivisibleFor(number, 3, "Fizz")
        accumulator += isNumberDivisibleFor(number, 5, "Buzz")

        return if (accumulator.isEmpty())
            number.toString()
        else
            accumulator
    }

    private fun isNumberDivisibleFor(number: Int, i: Int, s: String) = if (number % i == 0) s else ""
}
