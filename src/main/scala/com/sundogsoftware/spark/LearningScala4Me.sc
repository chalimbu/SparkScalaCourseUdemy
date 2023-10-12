// Data structures

//Tuples
// Immutable list

val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")
println(captainStuff)
// Refer to the individual field with
// One-based index
captainStuff._1
captainStuff._2
captainStuff._3

val picardShip = "picard" -> "Enterprise-D"
println(picardShip._2)

val aBunchOfStuck = ("Kirk", 1964, true)

//List
//Like a tuble but more functionality
//Must be of same type

val shipList = List("Enterprise", "Defiant", "Voyager")
println(shipList(1))

println(shipList.head)
println(shipList.tail)

for (ship <- shipList) {
  println(ship)
}

val backwardsShip = shipList.map((ship: String) => {
  ship.reverse
})

for (ship <- backwardsShip) {
  println(ship)
}

// reduce() to combine all the item in a collection
//using some function

val numberList = List(1, 2, 3, 4, 5)
val sum = numberList.reduce((x, y) => x + y)

// filter(), remove stuff
val iHateFives = numberList.filter((x: Int) => x != 5)

val iHateThrees = numberList.filter(_ != 3)

// concataned list
val moreNUmber = List(6, 7, 8)
val lostOfNumber = numberList ++ moreNUmber

val reversed = numberList.reverse
val sorted = reversed.sorted
val lotsOfDuplicateds = numberList ++ numberList
val distinctValues = lotsOfDuplicateds.distinct
val maxValue = numberList.max
val total = numberList.sum
val hasThree = iHateThrees.contains(3)

// Maps
val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-d", "siska" -> "Deep space nine")
shipMap
println(shipMap("Picard"))
println(shipMap.contains("Archer"))
val archersShip = util.Try(shipMap("archer")) getOrElse "Uknown"
print(archersShip)

//Exercise
//create a list of the number 1-20, your job is to out number that are evenly disible
//by three

val numbers= List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
numbers.filter(_%3==0)

var first=0;
var second=1;
for(i <- 1 to 10){
  println(first)
  val temporal=first
  first=second
  second=temporal+second
}
