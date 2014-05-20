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






// def toLower(c: Char): Char = (c.toByte+32).toChar
// var result = "HELLO".map(toLower)
// println(result)







// def encode(c: Char): Char = (c.toByte+5).toChar
// def decode(c: Char): Char = (c.toByte-5).toChar
// var secret = "HELLO".map(encode)
// println(secret)
// var truth = secret.map(decode)
// println(truth)






// val numPattern = "[0-9]{3}-[0-9]{3}-[0-9]{4}".r
// val valid_num = "123-123-1234"
// val invalid_num = "123-12A-1234"
// println(numPattern.findFirstIn(valid_num))
// println(numPattern.findFirstIn(invalid_num).getOrElse("Could not find match"))








// val numPattern = "[0-9]{3}-[0-9]{3}-[0-9]{4}".r
// val valid_num = "123-123-1234"
// val invalid_num = "123-12A-1234"

// numPattern.findFirstIn(valid_num) match {
//   case Some(s) => println(s"Found Valid Number $s")
//   case None    => println(s"Not valid number found")
// }

// numPattern.findFirstIn(invalid_num) match {
//   case Some(s) => println(s"Found Valid Number $s")
//   case None    => println(s"Not valid number found")
// }







val address = "431 Main Street".replaceAll("[0-9]", "-")
println(address)



























































