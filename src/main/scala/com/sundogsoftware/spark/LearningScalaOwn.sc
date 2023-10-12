val hello: String = "Hola!"

// VARIABLES are mutable
var helloThere: String = hello
helloThere="hey "+helloThere
println(helloThere)

val inmutableHelloHey=hello+"Hey"
println(inmutableHelloHey)

// Data types
val numberOne: Int = 1
val trueth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.14159265
val piSinglePrecision: Float = 3.14159265f
val bigNumber: Long = 12345678
val smallNumber: Byte = 127

println("Here is a mess: "+numberOne+ trueth+letterA+pi+bigNumber)

println(f"Pi is about $piSinglePrecision%.3f")
println(f"Zero padding on the left: $numberOne%05d")

println(s"I can use the s prefix to use variables like $numberOne $trueth $letterA")
println(s"I can also calculated inside the formated expression ${numberOne+1}")

val theUltimateAnswer = "To life, the universe and everithin is 42."
val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)

// Boolean
val isGreater = 1> 2
val isLeser= 1<2
val imposible = isGreater & isLeser
val imposible2 = isGreater && isLeser

val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isBest : Boolean = picard ==bestCaptain

// Exercise
// Wrie some code that takes the value of pi, doubles it, and then prints it withint a string with
// three decimal places of precision to the right.

val pi= 3.141592
val doublePi=pi*2
println(f"the double value of pi is $doublePi%.3f")