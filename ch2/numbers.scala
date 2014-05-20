// println("100".toInt)
// println("100".toDouble)
// println("100".toFloat)
// println("100".toLong)
// println("100".toShort)
// println("100".toByte)
// println("100".toLong == BigInt("001"))




def calcPi(iterations:Int, f:BigDecimal => Unit ) = {
  var estimate = BigDecimal(3)
  var position = BigInt(2)

  for( iter <- 0 to iterations){

    val d0:BigInt = position
    val d1:BigInt = position+1
    val d2:BigInt = position+2
    position      = position+2

    val step = BigDecimal(4.0)/BigDecimal(d0*d1*d2)

    if(iter % 2 == 0){
      estimate += step
    } else {
      estimate -= step
    }

    f(estimate)
  }
}

calcPi(1*100*100, x => printf(s"\r$x"))