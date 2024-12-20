package io.github.toms74209200

fun main() {
    for (i in 1..100) {
        when (val result = fizzBuzz(i)) {
            is Fizz -> println("Fizz")
            is Buzz -> println("Buzz")
            is FizzBuzz -> println("FizzBuzz")
            is Number -> println(result.n)
        }
    }
}
