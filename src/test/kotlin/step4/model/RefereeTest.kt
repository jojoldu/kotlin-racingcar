package step4.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import step4.model.Car
import step4.model.Referee

class RefereeTest {
    @Test
    fun `우승자 판별 test`() {
        val raceCars = listOf(
            Car("a", 5, mutableListOf()),
            Car("b", 6, mutableListOf()),
            Car("c", 7, mutableListOf()),
            Car("d", 7, mutableListOf()),
            Car("e", 5, mutableListOf())
        )
        assertThat(Referee().getWinner(raceCars) == "c,d")
    }
}