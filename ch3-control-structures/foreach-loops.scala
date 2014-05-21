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



implicit class BooleanUtils(left: Boolean) {
  def and(right:Boolean): Boolean = left && right
  def or(right:Boolean):  Boolean = left || right
}

for {
  i <- 1 to 10 
  if i != 4 and i % 2 == 0
} println(i)


