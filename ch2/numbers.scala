// println("100".toInt)
// println("100".toDouble)
// println("100".toFloat)
// println("100".toLong)
// println("100".toShort)
// println("100".toByte)
// println("100".toLong == BigInt("001"))




val iterations = 100000000
var estimate = BigDecimal(3)
var position = 2

for( iter <- 0 to iterations){

  val d0 = position
  val d1 = position+1
  val d2 = position+2
  position += 3

  // println(s"$d0 $d1 $d2 $position")

  println(BigDecimal(4.0/(d0*d1*d2)))

  // if(iter % 2 == 0){
  //   estimate += BigDecimal(4.0/(d0*d1*d2))
  // } else {
  //   estimate -= BigDecimal(4.0/(d0*d1*d2))
  // }

  // println(estimate)
  // printf(s"\r$estimate")
  
}