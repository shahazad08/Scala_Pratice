package example

object FindMaxNum {
  def main(args:Array[String]) {
    var no1: Int = 10
    var no2: Int = 15
    var no3: Int = 5
    if (no1 > no2 && no1 > no3) {
      println("Number 1 is greater")
    }
    else if (no2 > no1 && no2 > no3) {
      println("NUmber 2 is greater")
    }
    else {
      println("Number 3 is greater")
    }
  }


}
