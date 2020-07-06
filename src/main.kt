import data.Decoration

/**
 * @Author: xiantang
 * @Date: 2020/6/29 22:51
 */

fun buildAquarium(): Aquarium {
    return Aquarium()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}

fun makeDecoration() {
    val decoration1 = Decoration("granite")
    println(decoration1)
}


fun main() {
//    val buildAquarium = buildAquarium()
//    val aquarium = Aquarium(29)
//    aquarium.volume = 1000
//    aquarium.printSize()
//    println("Volume: ${aquarium.width * aquarium.length * aquarium.height / 1000} l")
//    val myTower = TowerTank(diameter = 25, height = 40)
//    myTower.printSize()
//    val plecostomus = Plecostomus()
//    val shark = Shark()
//    print("plecostomus:${plecostomus.color}")
//    print("shark:${shark.color}")
    makeDecoration()
}