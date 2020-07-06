import kotlin.math.PI

/**
 * @Author: xiantang
 * @Date: 2020/7/3 14:47
 */
class TowerTank(override var height: Int, var diameter: Int):Aquarium(height= height,width =diameter, length = diameter) {

    override var volume:Int
        get() = (width/2 * length/2 * height * PI /1000 ).toInt()
        set(value) {
            height = (value *1000 / PI / (width/2 * length/2)).toInt()
        }

    override val shape = "cylinder"

    override var water = volume * 0.8
}