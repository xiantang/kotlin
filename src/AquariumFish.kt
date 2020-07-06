/**
 * @Author: xiantang
 * @Date: 2020/7/3 15:02
 */
abstract class AquariumFish:FishAction {
    abstract val color:String

    override fun eat() {
        println("yum")
    }
}