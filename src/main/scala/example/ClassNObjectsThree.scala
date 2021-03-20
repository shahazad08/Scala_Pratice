package example
class PointTwo(val xc:Int, val yc:Int) {
  var x=xc
  var y=yc;

  def move(dx:Int,dy:Int): Unit = {
    x=x+dx
    y=y+dy

  }
}
class Location(override val xc:Int, override val yc:Int, zc:Int) extends PointTwo(xc,yc) {
  var z=zc
  def move(dx:Int,dy:Int, dz:Int): Unit = {
    move(dx,dy)
    z=z+dz
    println(x)
    println(y)
    println(z);
  }
}

object ClassNObjectsThree {
  def main(args:Array[String]): Unit = {
    val loc=new Location(10,10, 10)
    loc.move(10,20,20);
  }
}
