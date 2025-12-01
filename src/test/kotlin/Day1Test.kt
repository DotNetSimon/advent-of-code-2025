import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

/**
 * For testing the code for correctness based on the example input in the explanation.
 * Adjust the DAY, Data, and expected outputs.
 */
class Day1Test {

    // day to test
    private val day = DayFactory.createDay(1)


    private val dataA = """L68
L30
R48
L5
R60
L55
L1
L99
R14
L82
R500
""".trimIndent().split("\n").filterNot{it == ""}

    /*
        The dial starts by pointing at 50.
        The dial is rotated L68 to point at 82; during this rotation, it points at 0 once.
        The dial is rotated L30 to point at 52.
        The dial is rotated R48 to point at 0.
        The dial is rotated L5 to point at 95.
        The dial is rotated R60 to point at 55; during this rotation, it points at 0 once.
        The dial is rotated L55 to point at 0.
        The dial is rotated L1 to point at 99.
        The dial is rotated L99 to point at 0.
        The dial is rotated R14 to point at 14.
        The dial is rotated L82 to point at 32; during this rotation, it points at 0 once.
        */
    private val dataB = dataA
    // expected output puzzle A
    private val expected_puzzleA = """3"""

    // expected output puzzle B
    private val expected_puzzleB = """11"""

    // -------------------
    // Should be no need to modify the part below
    // -------------------
    @Test
    fun puzzleACorrect() {
        val actual = day.puzzleA(dataA)
        println(actual)
        assertEquals(expected_puzzleA, actual)
    }

    @Test
    fun puzzleBCorrect() {
        val actual = day.puzzleB(dataB)
        println(actual)
        assertEquals(expected_puzzleB, actual)
    }
}
