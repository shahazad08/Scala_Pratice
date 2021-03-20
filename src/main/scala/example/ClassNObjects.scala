package example

class MyText(var name:String, var id:Int) {
 // var nm=name
  //var i=id

  def display(): Unit = {
    println("Name is" +name+ "And ID is" +id)
  }
}


object ClassNObjects {
  def main(Args:Array[String]): Unit = {
    val mt=new MyText("Shaikh", 10)
    mt.display()
  }
}
