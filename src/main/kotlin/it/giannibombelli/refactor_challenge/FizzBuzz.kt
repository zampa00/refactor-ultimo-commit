package it.giannibombelli.refactor_challenge

class FizzBuzz : FizzBuzzInterface {
    override fun say(number: Int): String {
        var accumulator = ""
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz" + "Buzz"
        }
        if (number % 3 == 0) {
            accumulator += "Fizz"
            return "Fizz"
        }
        if (number % 5 == 0) {
            accumulator += "Buzz"
            return "Buzz"
        }

        if (accumulator.isEmpty())
            return number.toString()
        else
            return accumulator
    }
}
