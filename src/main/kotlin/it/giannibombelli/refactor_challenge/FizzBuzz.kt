package it.giannibombelli.refactor_challenge

class FizzBuzz : FizzBuzzInterface {
    override fun say(number: Int): String {
        var accumulator = ""

        accumulator += if (number % 3 == 0) "Fizz" else ""
        accumulator += if (number % 5 == 0) "Buzz" else ""

        return if (accumulator.isEmpty())
            number.toString()
        else
            accumulator
    }
}
