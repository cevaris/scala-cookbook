// "hello".foreach(println)




// for(c <- "hello") println(c)




// val s = "hello"
// s.getBytes.foreach(println)




// val result = "hello".filter( _ != 'l' )
// println(result)




// val result = "hello".take(2)
// println(result)




// val result = "hello".drop(2)
// println(result)




// val left  = "hello"
// val right = "HEllO"
// println(left == right)
// println(left.toUpperCase == right.toUpperCase)
// println(left.equalsIgnoreCase(right))




// val foo = """This 
// is 
// a 

// multiline 
// String that is preserved"""
// println(foo)






// "hello world".split(" ").foreach(println)
// "hello, world".split(',').map(_.trim).foreach(println)





// val name = "Adam"
// val age = 20
// val weight = 200.3
// println(s"$name is $age years old, and weighs $weight pounds.")
// println(s"Age next year: ${(math floor (age / 10.1 + 22))}")
// println(f"Age next year: ${(age / 10.1 + 22)}%.2f")





// "hello, world".map(_.toUpper).split(',').foreach(x => println(x.trim))





// val result = for {
// c <- "hello, world".filter(_ != 'l')
// } yield c.toUpper
// println(result)





// val result = "HELLO".map(c => (c.toByte+32).toChar)
// println(result)





// val result = "HELLO".map{ c =>
//   (c.toByte+32).toChar
// }
// println(result)





// val result = "HELLO".map{ c =>
//   c.toByte+32
// }
// println(result)






def toLower(c: Char): Char = (c.toByte+32).toChar
var result = "HELLO".map(toLower)
println(result)






























