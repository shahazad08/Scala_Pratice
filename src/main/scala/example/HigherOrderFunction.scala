package example

object HigherOrderFunction {

  def math(x:Double, y:Double, z:Double,f:(Double, Double)=> Double): Double ={
    f(f(x,y),z)
  }
  def main(args:Array[String]) {
    val salaries = Seq(20000, 70000, 40000)
    val newSalaries = salaries.map(_ * 2)
    println(newSalaries);
//    val result=math(50,20,(x,y)=>x+y)
      val result=math(50,20,10,_+_)
    println(result)
  }

//  case class WeeklyWeatherForecast(temperatures: Seq[Double]) {
//    private def convertCtoF(temp:Double)= temp*1.8+32
//    def forecastInFahrenheit:Seq[Double]=temperatures.map(convertCtoF)
//  }


}
