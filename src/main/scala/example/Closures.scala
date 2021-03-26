package example

object Closures {
  var number=10
  val add=(x:Int) =>{
    x+number
  }
  def main(args:Array[String]): Unit = {
    number=120
    println(add(20))
    println(number)
  }
}
