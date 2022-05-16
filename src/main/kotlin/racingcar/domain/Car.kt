package racingcar.domain

private const val MOVE_BASE_POINT = 4
private const val MOVE_START_POINT = 0
private const val MOVE_END_POINT = 9

class Car {
    var position = 0
        private set

    fun move(movePoint: Int = (MOVE_START_POINT..MOVE_END_POINT).random()) {
        validateMovePoint(movePoint)

        if (movePoint >= MOVE_BASE_POINT) {
            position++
        }
    }

    private fun validateMovePoint(movePoint: Int) {
        require(movePoint > MOVE_END_POINT || movePoint < MOVE_START_POINT) { "$MOVE_START_POINT ~ $MOVE_END_POINT 사이의 movePoint 만 가능합니다." }
    }
}
