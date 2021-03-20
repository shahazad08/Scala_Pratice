package example
class PointOne(var xc:Int, var xy:Int) {
  var x=xc
  var y=xy;

  def move(dx:Int,dy:Int): Unit = {
    x=x+dx
    y=y+dy
    println(x)
    println(y)
  }
}

object ClassNObjectTwo {
  def main(args:Array[String]): Unit = {
    val pt=new PointOne(10,10)
    pt.move(10,20);
  }
}
