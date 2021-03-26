package example
/*
Currying is a technique of transforming the function that takes multiple arguments into a function that takes
a single argument...
 */
object CurryingFunction {
  def add(x:Int, y:Int)=x+y
  def add2(x:Int)=(y:Int)=> x+y
  def add3(x:Int)(y:Int)=x+y
  def main(args:Array[String]): Unit = {
    println(add(10,20))
    println(add2(30)(20))
    println(add3(100)(100))
    val sum50=add3(50)_
    println(sum50(100));

    val sum40=add2(90)
    println(sum40(100))

  }
}
