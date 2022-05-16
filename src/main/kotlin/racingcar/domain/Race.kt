package racingcar.domain

class Race(private val cars: List<Car>) {
    constructor(carCount: Int) : this(List(carCount) { Car() })

    val movingDistances: List<Int>
        get() = this.cars.map { it.position }

    val carsSize: Int
        get() = this.cars.size

    fun run() {
        cars.forEach { it.move() }
    }
}
