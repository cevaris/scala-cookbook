// println("100".toInt)
// println("100".toDouble)
// println("100".toFloat)
// println("100".toLong)
// println("100".toShort)
// println("100".toByte)
// println("100".toLong == BigInt("001"))




// def calcPi(iterations:Int, f:BigDecimal => Unit ): BigDecimal  = {
//   var estimate = BigDecimal(3)
//   var position = 2

//   for( iter <- 0 to iterations ){

//     val step = BigDecimal(4.0)/BigDecimal(BigInt(position)*BigInt(position+1)*BigInt(position+2))

//     iter % 2 match {
//       case 0 => estimate += step
//       case _ => estimate -= step
//     }

//     position = position+2

//     f(estimate)    
//   }
//   estimate
// }

// calcPi(1*100*100, x => printf(s"\r$x"))


def calcPi(iterations:Int): BigDecimal  = {
  var estimate = BigDecimal(3)
  var position = 2

  for( iter <- 0 to iterations ){

    val step = BigDecimal(4.0)/BigDecimal(BigInt(position)*BigInt(position+1)*BigInt(position+2))

    iter % 2 match {
      case 0 => estimate += step
      case _ => estimate -= step
    }

    position = position+2
    printf(s"\r$estimate")
  }
  println()
  estimate
}

calcPi(1*100*100)