package example

class AdditionClass {
  def add(a: Int, b: Int): Unit = {
    var c: Int = 0
    c = a + b
    println(c)
  }
}
object Addition {
  def main(args:Array[String]): Unit = {
    val addition=new AdditionClass()
    addition.add(10,30)
  }


}
