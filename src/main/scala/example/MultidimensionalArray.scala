package example

import scala.Array.ofDim

object MultidimensionalArray extends App {

//  var arr1=Array.range(2,15)
//  for(i<-arr1) {
//    println(i)
//  }

 // Multidimenstional Arrays
// var myMatrix=ofDim[Int](3,3)
//
//  // build the matrix
//  for(i<-0 to 2) {
//    for(j<-0 to 2) {
//      myMatrix(i)(j)=j
//    }
//
//    // Print the Dimensional Matrix
//    for(i<-0 to 2) {
//      for(j<-0 to 2) {
//        print(" "+myMatrix(i)(j))
//      }
//      println()
//
//    }
//  }
var myMatrix = ofDim[Int](3,3)

  // build a matrix
  for (i <- 0 to 2) {
    for ( j <- 0 to 2) {
      myMatrix(i)(j)=j;
    }
  }

  // Print two dimensional array
  for (i <- 0 to 2) {
    for ( j <- 0 to 2) {
      print(" " + myMatrix(i)(j));
    }
    println();
  }

}
