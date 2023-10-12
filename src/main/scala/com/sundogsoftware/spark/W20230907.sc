var first=0
var second=1

for(i <- 1 to 10){
  var temporal=first;
  println(first)
  first=second
  second=temporal+second
}