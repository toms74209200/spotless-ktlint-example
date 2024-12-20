package io.github.toms74209200

sealed interface FizzBuzzResult

data object Fizz : FizzBuzzResult

data object Buzz : FizzBuzzResult

data object FizzBuzz : FizzBuzzResult

data class Number(
    val n: Int,
) : FizzBuzzResult

fun fizzBuzz(n: Int): FizzBuzzResult =
    when {
        n % 15 == 0 -> FizzBuzz
        n % 3 ==  0 -> Fizz
        n % 5 ==  0 -> Buzz
        else -> Number(n)
    }
