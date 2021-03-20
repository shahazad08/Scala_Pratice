package example

import scala.util.control.Breaks

object ForLoop extends App {
  var i:Int=0
  var a:Int=0
  var loop=Breaks
  val num1=List(1,2,3,4,5,6,7,8,9,10)
  for(i<-1 until 10 by 2) {  // or  for(i<-1 to 10)
    println(i)
//    if(i==7) {
//      loop.break
//    }
  }
  for(a <- num1 ) {
    println("Value is",a)
    if (a==4) {
      loop.break
    }

  }
}
