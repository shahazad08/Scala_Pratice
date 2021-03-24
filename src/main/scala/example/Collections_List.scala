package example

object Collections_List extends App {
  // List of Strings
  val fruit: List[String] = List("apples", "oranges", "pears")

  // List of Integers
  val nums: List[Int] = List(1, 2, 3, 4)

  // Empty List.
  val empty: List[Nothing] = List()

  // Two dimensional list
  val dim: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )

  println("Fruit List", fruit)
  println("nums List", nums)
  println("empty List", empty)
  println("dim List", dim)

  

}
