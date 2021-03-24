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

  val myArray:Array[Int]=new Array[Int](4)
  myArray(0)=20
  myArray(1)=50
  myArray(2)=10
  myArray(3)=30

  for(x <- myArray){
    println("My Array",x)
  }

  // or

  for(i <- 0 to (myArray.length - 1)) {
    println(myArray(i))
  }

  val myArray3=Array(1,2,3,4,5)
  var result=Array.concat(myArray, myArray3)
  println(result);
  for(r<-result) {
    println(r)
  }
//  val myArray2=new Array[Boolean](5)
//  for(m<-myArray2) {
//    println("Scond Array",m)
//  }
}

