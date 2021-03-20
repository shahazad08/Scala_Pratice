package example
class Point(x:Int, y:Int) {
  var a=x
  var b=y
  var c=x+y
  println(a)
  println(b)
  println("Addition is", c)

  def substraction(x:Int, y:Int): Unit = {
    var a=x
    var b=y
    c=a-b
    println("Substraction is", c)
  }
}

object Demo{
  def main(args: Array[String]) {
    val pt = new Point(10, 20)
    pt.substraction(50,10)
  }
}
