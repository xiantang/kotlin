/**
 * @Author: xiantang
 * @Date: 2020/7/3 15:05
 */
class Plecostomus(fishColor: FishColor = GoldColor):FishAction by PrintingFishAction("algae"),FishColor by fishColor {

}