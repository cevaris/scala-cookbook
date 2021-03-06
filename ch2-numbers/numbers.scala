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


// def calcPi(iterations:Int): BigDecimal  = {
//   var estimate = BigDecimal(3)
//   var position = 2

//   for( iter <- 0 to iterations ){

//     val step = BigDecimal(4.0)/BigDecimal(BigInt(position)*BigInt(position+1)*BigInt(position+2))

//     iter % 2 match {
//       case 0 => estimate += step
//       case _ => estimate -= step
//     }

//     position = position+2
//     printf(s"\r$estimate")
//   }
//   println()
//   estimate
// }

// calcPi(1*100*100)





// abstract class Parity
// case class Even() extends Parity
// case class Odd()  extends Parity

// implicit class BigIntUtils(x: BigInt) {

//   val even:BigInt = 0
//   val odd:BigInt  = 1

//   def parity(): Parity = x % 2 match {
//     case `odd`  => Odd()
//     case `even` => Even()
//   }
// }

// assert(BigInt(2).parity == Even())
// assert(BigInt(0).parity == Even())
// assert(BigInt(1).parity == Odd())
// assert(BigInt(11).parity == Odd())


// abstract class Parity
// case class Even() extends Parity
// case class Odd()  extends Parity

// implicit class BigIntUtils(x: BigInt) {

//   val even:BigInt = 0
//   val odd:BigInt  = 1

//   def parity(): Parity = x % 2 match {
//     case `odd`  => Odd()
//     case `even` => Even()
//   }
// }

// assert(BigInt(2).parity == Even())
// assert(BigInt(0).parity == Even())
// assert(BigInt(1).parity == Odd())
// assert(BigInt(11).parity == Odd())



// def calcPi(): BigDecimal  = {

//   val maxIterations:Int = 1*100*100*100

//   @annotation.tailrec
//   def go(iteration:BigInt, position:BigInt, estimate:BigDecimal): BigDecimal = {
//     printf(s"\r$estimate")

//     val step:BigDecimal = BigDecimal(4.0)/BigDecimal(position*(position+1)*(position+2))

//     iteration.parity match {
//       case Even() => go(iteration+1, position+2, (estimate + step))
//       case Odd() if iteration < maxIterations => 
//         go(iteration+1, position+2, (estimate - step))
//       case Odd() => println(); estimate 
//     }
//   }

//   go(0, 2, BigDecimal(3))
// }


// calcPi()











// implicit class StringToInt(s: String) {
//   def parseInt():Option[Int] = { 
//     try {
//       Some(s.toInt) 
//     } catch {
//     case e: NumberFormatException => None 
//     }
//   }
// }

// "100".parseInt() match {
//   case Some(n) => println(n)
//   case None => println("Boom! That wasn't a number.")
// }

// "100+".parseInt() match {
//   case Some(n) => println(n)
//   case None => println("Boom! That wasn't a number.")
// }

// "-1001".parseInt() match {
//   case Some(n) => println(n)
//   case None => println("Boom! That wasn't a number.")
// }







// val a = 100000L
// assert(a.isValidByte == false)
// assert(a.isValidShort == false)
// assert(a.isValidInt == true)










val r = scala.util.Random
r.setSeed(1002L)
println(r.nextInt)

var range = 0 to r.nextInt(10)
println(range)

var randRange = for (i <- 0 to r.nextInt(10)) yield (i * r.nextFloat)
println(randRange)