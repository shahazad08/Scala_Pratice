package example

object FunctionAdd {
  def main(args:Array[String]): Unit = {
    println("Addition Value is", addFunc(5,7))
    println("Substration Value is", subFunc(10,7))
    println("Addition with operator is", Math.+(60,15))
    var mul=(x:Int, y:Int)=>x*y;
    println(mul(10,10))
  }

def addFunc(a:Int, b:Int): Int = {
  var sum:Int=0
  sum=a+b;
  println(sum)
  return sum
}
  def subFunc(a:Int,b:Int): Int = {
    a-b
  }
object Math{
  def +(x:Int=45, y:Int=15): Int = {
    x+y
  }
}
}
