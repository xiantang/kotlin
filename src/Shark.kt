/**
 * @Author: xiantang
 * @Date: 2020/7/3 15:03
 */
class Shark : FishColor by GoldColor,FishAction {
    override fun eat() {
        println("hunt and eat fish")
    }
}