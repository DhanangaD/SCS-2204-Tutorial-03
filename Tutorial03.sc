//Question 01----------------------------------------------------------------------------------------------------
def Area(r : Float):Double = {
  math.Pi*r*r
}
println("AREA OF A DISK: "+Area(5))

//Question 02-----------------------------------------------------------------------------------------------------
def convertFahrenheit(celsius:Float):Float = {
  (celsius * 1.800f) + 32.00f
}
println("TEMPERATURE IN FAHRENHEIT: "+convertFahrenheit(35))

//Question 03-----------------------------------------------------------------------------------------------------
def volume(r:Float):Double = {
  4.0f/3.0f * math.Pi * r * r * r
}
println("VOLUME OF A SPHERE: "+volume(5))


//Question 04-----------------------------------------------------------------------------------------------------
val price = 24.95f
val discount  = 0.4f
val shippingCostForFirstFifty = 3.00f
val shippingCostForAdditional = 0.75f

def totalPrice(copiesCount: Int):Float = {
  copiesCount * price
}
def discountedPrice(totalPrice: Float):Float = {
  totalPrice * (1 - discount)
}
//def shippingCost(copiesCount: Int):Float = copiesCount > 50 match {
//  case true => 50 * shippingCostForFirstFifty + (copiesCount - 50) * shippingCostForAdditional
//  case false => copiesCount*shippingCostForFirstFifty
//}
def shippingCost(copiesCount: Int):Float = {
  if(copiesCount>50){
    50 * shippingCostForFirstFifty + (copiesCount - 50) * shippingCostForAdditional
  }
  else{
    copiesCount*shippingCostForFirstFifty
  }
}

def totalCostForBooks(copiesCount: Int):Float = {
  val total_Price = totalPrice(copiesCount)
  val discounted_Price = discountedPrice(total_Price)
  val shipping_Cost = shippingCost(copiesCount)
  discounted_Price + shipping_Cost
}
println("TOTAL WHOLESALE COST FOR 60 COPIES: "+totalCostForBooks(60))


//Question 05-----------------------------------------------------------------------------------------------------
val easyPace = 8
val tempo = 7

def easy(easyPaceDistance: Int):Int = {
  easyPaceDistance*8
}
def tempo(tempoDistance: Int):Int = {
  tempoDistance*7
}
val totalRunningTime = easy(2) + tempo(3) + easy(2)
println("TOTAL RUNNING TIME : "+totalRunningTime)
