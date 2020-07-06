class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println("eat "+food)
    }
}
