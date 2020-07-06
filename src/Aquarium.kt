/**
 * @Author: xiantang
 * @Date: 2020/6/29 22:50
 */
open class Aquarium (width:Int = 20,height: Int = 40,length: Int = 100){
    var width: Int = width
    open var height: Int = height
    var length: Int = length
    open var volume:Int
        get() = width * height *length /1000
        set(value) { height = (value * 1000) / (width * length)}

    init {
        println("aquarium initializing")
    }
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
    fun printSize() {
        println(
                "Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }

    open val shape: String = "cylinder"
    open var water: Double = volume * 0.8
}