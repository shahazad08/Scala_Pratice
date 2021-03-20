package example

object ArrayOperations extends App {
  // Using For Loop Iterating the array
  var arr = Array(11, 22, 33, 44)
  var i: Int = 0
  var total = 0.0
  for (i <- arr) {
    println(i)
    total += i
  }
  println(total)

  // Linear Search Program


  var key: Int = 33
  for (i <- arr) {
    if (key == i) {
      println("Element is found and data is %d", key)
    }
    else {
      println("Element is Not Found")
    }
  }
  // Finding the Max
  var myList = Array(1.9, 2.9, 3.4, 3.5)
  var max = myList(0);

  for (i <- 1 to (myList.length - 1)) {
    if (myList(i) > max) {
      max = myList(i)
    }
    println(max)
  }
}

