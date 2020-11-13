class ShapeAccumulator() {
    private val shapes : MutableList<Shape> = ArrayList()

    fun add (shape: Shape) {shapes.add(shape)}

    fun getTotalArea() : Double = shapes.sumByDouble { i -> i.calcArea() }

    fun getTotalPerimeter() : Double = shapes.sumByDouble { i -> i.calcPerimeter() }

    fun getMinAreaShape() : Shape? = shapes.minByOrNull { i -> i.calcArea() }

    fun getMaxAreaShape() : Shape? = shapes.maxByOrNull { i -> i.calcArea() }

    fun getMaxPerimeterShape() : Shape? = shapes.minByOrNull { i -> i.calcPerimeter() }

    fun getMinPerimeterShape() : Shape? = shapes.minByOrNull { i -> i.calcPerimeter() }
}
