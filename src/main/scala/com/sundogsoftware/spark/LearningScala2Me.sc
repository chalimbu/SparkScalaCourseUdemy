
if(1 > 3) println("Imposible") else println("The world makes sense")

if(1 > 3){
  println("imposible")
  println("Really!")
}else{
  println("the world makes sense")
  println("still")
}


//Matching
val number = 3
number match {
  case 1 => println("one");
  case 2 => println("two");
  case 3 => println("three");
  case _ => println("Something else");
}


for( x <- 1 to 4){
  val square = x* x
  println(square)
}

var x=0;
while(x<10){
  println(x)
  x=x+1;
}

x = 0
do{
  println(x);
  x+=1;
}while(x<=10);

// Expressions

println({val x = 10; x+20})

var firs=0;
var second=1;
for(i <- 1 to 10){
  println(firs)
  var temp=firs;
  firs=second
  second=firs+temp;
}



