package main.scala

object p2 extends App{

    var result1 = functionExample(a=15,b = 2)     // Calling with two values
    var result2 = functionExample(a= 15,b= 2)   // Calling with one value
    var result3 = functionExample(15,2)     // Calling without any value
    println(result1+"\n"+result2+"\n"+result3)

  def functionExample(a:Int, b:Int):Int = {   // Parameters with default values as 0
    a+b
  }

  passingFunc(3, multiply)

  def passingFunc(a:Int,  f:Int=> AnyVal):Unit  ={
    println(f(a))
  }
  def multiply(a:Int):Int ={
    a*2
  }
// create an array of 2

  val multiArray  = Array.ofDim[Int](2,2)
    multiArray(0)(0)= 5
    multiArray(0)(1)= 10
    multiArray(1)(0)= 15
    multiArray(1)(1)= 20
  for(i<-0 to 1; j<-0 to 1 ){
    println("Element "+i+j+ "= " + multiArray(i)(j))
  }



    trait MyCompany1 {
      def company
      def position            // why use trait if can be done with simple class creation ??????/
    }

   class MyClass1 {//extends MyCompany1 {
     def company {
       println("company :DiggiBite ")
     }

     def position {
       println("Position : Data Engine ")
     }

     def employee {
       println("name : Vivek Kumar")
     }
   }
  val obj1 = new MyClass1()
  obj1.company
  obj1.position
  obj1.employee
  println("===============================")
  println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)


















}
