import kotlin.math.abs

/**
 * Day 1 class, should solve the puzzle A and puzzle B for you.
 */
class Day1 : Day {

    override fun puzzleA(data: List<String>): String {
        var current = 50
        var countZero = 0
        data.forEach {
            val direction = it.first()
            val step = it.drop(1).toInt()
            // negative should be 100-?
            if (direction == 'L') current -= step
            else current += step

            current = (current + 100) % 100

            if (current == 0) { countZero++}
        }
        return countZero.toString()
    }

    override fun puzzleB(data: List<String>): String {
        var current = 50
        var countZero = 0
        var prev = 50
        data.forEach {
            prev = current
            val direction = it.first()
            var step = it.drop(1).toInt()

            val fullRotations = abs(step / 100)
            countZero += fullRotations
            step = step % 100

            if (step != 0) {
                if (direction == 'L') current -= step
                else current += step

                if (current !in 1 until 100 && prev != 0) {
                    countZero++
                }
                current = (current + 100) % 100
            }
        }
        return countZero.toString()

    }
}
