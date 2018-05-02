object recursiveOperations {
val obj=new Sum()                                 //> obj  : Sum = Sum@14f9431
 val sum1= obj.sum2(List(1,2,3,4,5,2,4,56,7,8,54,33,354
 ),0)                                             //> sum1  : Int = 533
 val sum2=obj.sum2(List(1,2,3,4, 5),0)            //> sum2  : Int = 15
 val sum3=obj.sum3(List(1,2,3,4, 5))              //> sum3  : Int = 15
 val sum4=obj.byReduceLeft(List(1,2,3,4, 5))      //> sum4  : Int = 15
 
val fib=new Fibonacci()                           //> fib  : Fibonacci = Fibonacci@aa5eb0
 println(fib.fibo(1,2))                           //> 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
                                                  //| 55
                                                  //| 89
                                                  //| 144
}


//SUM Using Recursion
class Sum {
// yields a "java.lang.StackOverflowError" with large lists
def sum1(list:List[Int]):Int = list match{
case Nil=>0
case x::tail=> x + sum1(tail)
}
 def sum(ints:List[Int]):Unit=ints match{
  case Nil=>println(0)
  case  x::xs => println(x+" "+xs)
  }
  
  def sum2(ints:List[Int],acc:Int):Int=ints match{
  case Nil=>acc
  case x::tail =>sum2(tail,acc+x)
  }
  def sum3(ints:List[Int]):Int={
  if(ints.isEmpty)0
  else ints.head+sum3(ints.tail)
  }
  
  def byReduceLeft(ints:List[Int]):Int={
  ints.reduceLeft(_+_)
  }
}

//FIBONACCI Series Using Recursion
class Fibonacci(){
def fibo(prevPrev:Int,prev:Int):Int={
var next=prevPrev+prev
println(next)
if(next>100)System.exit(0)
fibo(prev,next)
}
}

//FACTORIAL Using Recursion
class Factorial(){
//1-general way to find factorial
def fact(num:Int):Int={
if(num==0)1
else(num*fact(num-1))
}
//2-tail-Recursion to find factorial
def fact2(num:Int):Int={
def accFact(numb:Int,acc:Int):Int={
if(numb==0)acc
else(accFact(numb-1,acc*numb))
}
accFact(num,1)
}
}