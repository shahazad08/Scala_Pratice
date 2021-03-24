package example

object Lists {
  val myLists:List[Int] = List(1,2,5,8,9,6,4)
  val names:List[String] = List("Tom", "Dick", "Harry")
  def main(args:Array[String]): Unit = {
    println(myLists)
    println(names)
    println(0::myLists)
    println(1 :: 5 :: 9 :: Nil)
    println(myLists.head)
    println(myLists.tail)
    println(myLists.isEmpty)
    println(myLists.reverse)
    println(List.fill(5)(2))
    println(myLists.max)




  }

}
