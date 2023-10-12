def squareIt(x: Int): Int = {
  x * x
}

squareIt(3)

def cubeIt(x: Int): Int = {
  x * x * x
}

println(cubeIt(2))

def transformIn(x: Int, f: Int => Int): Int = {
  f(x)
}

transformIn(2, cubeIt)

transformIn(3, x => x * x * x)

transformIn(10, x => x / 2)

transformIn(2, x => {
  val y = x * 2;
  y * y
})

"hello".toUpperCase()

def transformString(x: String, f: String => String): String = {
  f(x)
}

transformString("hi there", x => x.toUpperCase())