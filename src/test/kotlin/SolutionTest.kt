import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    private val solution = Solution()

    @Test
    fun removeElement1() {
        val num = intArrayOf(3,2,2,3)
        val output = solution.removeElement(num,3)
        assertEquals(2, output)
        assertArrayEquals(intArrayOf(2,2,2,3),num)
    }

    @Test
    fun removeElement2() {
        val num = intArrayOf(0,1,2,2,3,0,4,2)
        val output = solution.removeElement(num,2)
        assertEquals(5, output)
        assertArrayEquals(intArrayOf(0,1,3,0,4,0,4,2),num)
    }

    @Test
    fun removeElement3() {
        val num = intArrayOf(1,1,1,1,1,1,1,1)
        val output = solution.removeElement(num,1)
        assertEquals(0, output)
        assertArrayEquals(intArrayOf(1,1,1,1,1,1,1,1),num)
    }

    @Test
    fun removeElement4() {
        val num = intArrayOf(1,1,1,1,1,1,1,1)
        val output = solution.removeElement(num,2)
        assertEquals(8, output)
        assertArrayEquals(intArrayOf(1,1,1,1,1,1,1,1),num)
    }

    @Test
    fun removeElement5() {
        val num = intArrayOf(4,5)
        val output = solution.removeElement(num,5)
        assertEquals(1, output)
        assertArrayEquals(intArrayOf(4,5),num)
    }
}