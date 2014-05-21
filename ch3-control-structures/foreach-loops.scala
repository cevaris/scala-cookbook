val source = """This 
is a song
a 3 really 48 long song
it 44 has some numbers 33
do not 3343 worry about them...
"""
println(source)

for {
  line <- source.split("\n") 
  char <- line
  if char.isLetter
} print(char)

for (line <- source.split("\n")) {
  for { 
    char <- line
    if char.isLetter || char == ' '
  } print(char)

  println()
} 