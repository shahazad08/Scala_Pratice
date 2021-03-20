package example

object StringScala {
    def main(args: Array[String]) {
      var palindrome = "Dot saw I was Tod";
      var len = palindrome.length();
      var string1="Hello"
      var string2="Hello"
      var string3=string1.concat(string2) //Concatanate the Strings
      var floatVar=12.456 // Formattin the String...
      var intVar=2000
      var stringVar="Hello, Scala"
      println("String 3 is", string3)
      println( "String Length is : " + len );
      println("The value of FLoat is  "+ "%f" ,+floatVar+ "& Integer variable is %d" +intVar+ " & Strig is %s" ,stringVar)

      val name = "James"   // Literal Strings

      println(s"Hello, $name")
      println(s"1 + 1 = ${1 + 1}")

      var string4=string1.contentEquals(string2)
      println("String Comparasion gives the result", string4)

      var string5=string1.compareTo(string2)
      println("String Comparasion gives the result", string5)

    }
}
