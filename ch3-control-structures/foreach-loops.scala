// val source = """This 
// is a song
// a 3 really 48 long song
// it 44 has some numbers 33
// do not 3343 worry about them...
// """
// println(source)

// for {
//   line <- source.split("\n") 
//   char <- line
//   if char.isLetter
// } print(char)

// for (line <- source.split("\n")) {
//   for { 
//     char <- line
//     if char.isLetter || char == ' '
//   } print(char)

//   println()
// } 










// val nieces = List("emily", "hannah", "mercedes", "porsche")
// println(nieces)
// val NIECES = for (n <- nieces) yield n.capitalize
// println(NIECES)

// println(nieces.zipWithIndex)
// for ((n, i) <- nieces.zipWithIndex) {
//   println(s"$i - $n")
// }
// nieces.foreach{ e => 
//   println(e)
// }



// implicit class BooleanUtils(left: Boolean) {
//   def and(right:Boolean): Boolean = left && right
//   def or(right:Boolean):  Boolean = left || right
// }

// for {
//   i <- 1 to 10 
//   if i != 4 and i % 2 == 0
// } println(i)







// for {
//   i <- 1 to 3
//   j <- 1 to 5
//   k <- 1 to 10
// } println(s"i = $i, j = $j, k = $k")






// val data = for {
//   i <- 1 to 3
//   j <- 1 to 5
//     if i != 1 && j != 1
//     k <- 1 to 10
// } yield List(i,j,k)

// println(data)






import util.control.Breaks._

// breakable {
//   for (i <- 1 to 10) {
//     println(i)
//     if (i > 4) break // break out of the for loop
//   } 
// }

def findPs(s:String) = {
  var numPs = 0
  for (i <- 0 until s.length) {
    breakable {
      if (s.charAt(i) != 'p') {
        break // break out of the 'breakable', continue the outside loop 
      } else {
        numPs += 1 
      }
    } 
  }
  println("Found " + numPs + " p's in the string.")
}
findPs("test this string")
findPs("phun in the sun")
findPs("pepperdinpep")



