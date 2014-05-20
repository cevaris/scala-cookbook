// println("100".toInt)
// println("100".toDouble)
// println("100".toFloat)
// println("100".toLong)
// println("100".toShort)
// println("100".toByte)
// println("100".toLong == BigInt("001"))




val iterations = 50*1000*1000
var estimate = BigDecimal(3)
var position = BigInt(2)

for( iter <- 0 to iterations){

  val d0:BigInt = position
  val d1:BigInt = position+1
  val d2:BigInt = position+2
  position      = position+2

  // println(s"$d0 $d1 $d2 $position ${d0*d1*d2}")
  // println(d0*d1*d2)
  val step = BigDecimal(4.0)/BigDecimal(d0*d1*d2)
  // println(step)

  if(iter % 2 == 0){
    estimate += step
  } else {
    estimate -= step
  }

  // println(estimate)
  printf(s"\r$estimate")
  
}