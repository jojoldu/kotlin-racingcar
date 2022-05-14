package racingcar.view

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import racingcar.view.result.Output

class ResultViewTest : AnnotationSpec() {

    @Test
    fun `이동거리만큼 -로 표기된다`() {
        val sut = ResultView(StubOutput())

        val result = sut.statusBy(3)

        result shouldBe "---"
    }

    @Test
    fun `모든 자동차들의 이동거리만큼 출력된다`() {
        val output = StubOutput()
        val sut = ResultView(output)

        sut.show(listOf(1, 2))

        val result = output.result.split("\n")
        result.size shouldBe 3
        result[0] shouldBe "-"
        result[1] shouldBe "--"
        result[2] shouldBe ""
    }
}

class StubOutput : Output {
    lateinit var result: String

    override fun show(message: String) {
        this.result = message
    }
}
