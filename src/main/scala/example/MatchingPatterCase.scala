package example

object MatchingPatterCase {
  def main(args:Array[String]): Unit = {
    var num=1
    num match{
      case 1 => println("I am First")
      case 2 => println("I am First")
      case 3 => println("I am First")
      case _ => println("Default")
    }
  }
}
