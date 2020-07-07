import java.util.*

/**
 * @Author: xiantang
 * @Date: 2020/6/28 22:28
 */

/**
 * return type Unit
 */
data class Fish(val name: String)
fun fishExamples():String {
    val fish = Fish("splashy")  // all lowercase
    with(fish.name) {
        return this.capitalize()
    }
}
//fun feedTheFish() {
//    val day = randomDay()
//    val food = "pellets"
//    println ("Today is $day and the fish eat $food")
//}
//
//fun randomDay(): String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//            "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}


fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun updateDirty(dirty: Int, operation: (Int) -> Int) {
    val increaseDirty = operation(dirty)
    println(increaseDirty)
}

fun increaseDirty( start: Int ) = start +1
fun main(args:Array<String>) {
//    feedTheFish()
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val filtered = decorations.filter {
        it[0] == 'p'
    }
    println("filtered: $filtered")
    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")
    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    var dirtyLevel = 20
//    val waterFilter = { dirty : Int -> dirty / 2}
//    println(waterFilter(dirtyLevel))
//    val waterFilter : (Int) -> Int = { dirty ->dirty/2 }
    val filter = decorations.filter {
        it.contains("p")
    }
    println(filter)
    updateDirty(1,::increaseDirty)
}

