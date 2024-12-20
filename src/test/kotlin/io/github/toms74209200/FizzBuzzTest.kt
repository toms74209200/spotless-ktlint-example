package io.github.toms74209200

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class FizzBuzzTest {
    @ParameterizedTest
    @MethodSource("provideFizzBuzz")
    fun testFizzBuzz(
        input: Int,
        expected: FizzBuzzResult,
    ) {
        assertEquals(expected, fizzBuzz(input))
    }

    companion object {
        @JvmStatic
        private fun provideFizzBuzz(): Stream<Arguments> =
            Stream.of(
                Arguments.of(1, Number(1)),
                Arguments.of(3, Fizz),
                Arguments.of(5, Buzz),
                Arguments.of(15, FizzBuzz),
                Arguments.of(30, FizzBuzz),
                Arguments.of(31, Number(31)),
            )
    }
}
