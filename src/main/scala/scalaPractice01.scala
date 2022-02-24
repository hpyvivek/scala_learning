package main.scala

object scalaPractice01 extends App{
  def functionExample(a:Int, b:Int):Int = {
  if(b == 0)  0       // Base condition
  else
  a+functionExample(a,b-1) //     o/p=      // 10+(....)
                                              // (10 +(10+(.....))
                                                //(10 +(10+(10+(0)))
  }
  var result = functionExample(10,1)
  println(result)
}

