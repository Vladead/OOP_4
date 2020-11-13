fun main(args: Array<String>) {
    val list = arrayListOf(
        Rectangle(5.0, 2.0),
        Circle(2.0),
        Square(5.0),
        Triangle(5.0, 6.0, 7.0)
    )

    val areas = arrayListOf<Double>()
    val perimeters = arrayListOf<Double>()
    for (i in list) {
        areas.add(i.calcArea())
        perimeters.add(i.calcPerimeter())
    }

    println(
        "Минимальная площадь: ${areas.minOrNull()} \n" +
                "Максимальная площадь: ${areas.maxOrNull()} \n" +
                "Минимальный периметр: ${perimeters.minOrNull()} \n" +
                "Максимальный периметр: ${perimeters.maxOrNull()} \n" +
                "Сумма площадей: ${list.sumByDouble { it -> it.calcArea() }}"
    )

    val shapeAccumulator = ShapeAccumulator()

    val listOfRectangle = arrayListOf(Rectangle(6.3, 3.2))
    val listOfCircle = arrayListOf(Circle(3.4))
    val square = Square(7.7)
    val triangle = Triangle(5.0, 6.0, 7.0)

    shapeAccumulator.add(square)
    shapeAccumulator.add(triangle)
    shapeAccumulator.addAll(listOfRectangle)
    shapeAccumulator.addAll(listOfCircle)
}
