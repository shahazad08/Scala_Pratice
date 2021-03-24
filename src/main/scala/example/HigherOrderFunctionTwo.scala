package example

object HigherOrderFunctionTwo {
  def functionExample(a:Double, f:Double=> Double): Unit ={
    println(f(a))
  }
  def multiplyBy2(a:Double): Double ={
    a*2
  }


  def main(args:Array[String]): Unit = {
    functionExample(7,multiplyBy2)
  }
}
