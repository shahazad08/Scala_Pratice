package example

import java.util.Date

object PartiallyAppliedFunction {
  def log(date:Date, message:String): Unit = {
    println(date + " " + message)
  }
  def main(args:Array[String]) {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, 20, _)
    println(f(15))
    val date=new Date
    val newLog=log(date, "This is example 1") // or log(date, _:String)
   // newLog("This is example")
  }
}
