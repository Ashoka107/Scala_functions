


object TraitsExamples {
 
 val frog =new Frog                               //> frog  : Frog#649264 = green
 val phil=frog.philosophize()                     //> And do UnInterrupted HardWork,Without Thinking about anything
                                                  //| phil  : Unit#2607 = ()
 
// A trait also defines a type. Here's an example in which Philosophical is used as a type:
 val philosoph:Philosophical=frog                 //> philosoph  : Philosophical#649263 = green
 val philso=philosoph.philosophize()              //> And do UnInterrupted HardWork,Without Thinking about anything
                                                  //| philso  : Unit#2607 = ()
 
 //Rich Interface -Rectangle example
 val rect=new Rectangle(new Point(1,1),new Point(10,10))
                                                  //> rect  : Rectangle#692738 = Rectangle@1684286
 val left=rect.left                               //> left  : Int#1080 = 1
 val right=rect.right                             //> right  : Int#1080 = 10
 val width=rect.width                             //> width  : Int#1080 = 9
 
 //Ordered traits with Rational
  val half = new Rational1(1, 2)                  //> half  : Rational1#1649004 = 1/2
 val third=new Rational1(1,3)                     //> third  : Rational1#1649004 = 1/3
 val result=half<third                            //> result  : Boolean#2502 = false
 val result1=half>third                           //> result1  : Boolean#2502 = true
 val result2=half<=third                          //> result2  : Boolean#2502 = false
 val result3=half>=third                          //> result3  : Boolean#2502 = true
 
 //STackable Modifications
 val queue=new MyQueue                            //> queue  : BasicIntQueue#1871803 = BasicIntQueue@17f6480
val put= queue.put(10)                            //> put  : Unit#2607 = ()
val put2=queue.put(20)
val get= queue.get()                              //> get  : Int#1080 = 10
val get2= queue.get()
 }
 
trait Philosophical{
def philosophize(){
println("First,Start with Confidence")
}
}
class Animal{
}

class Frog extends Animal with Philosophical{
override def toString ="green"
override def philosophize(){
println("And do UnInterrupted HardWork,Without Thinking about anything")
}
}


//Good Example Rectangular Objects

class Point(val x:Int,val y:Int)

trait Rectangular {
def topLeft : Point
def bottomRight : Point

def left = topLeft.x
def right = bottomRight.x
def width=right - left
}

class Rectangle (val topLeft:Point,val bottomRight:Point) extends Rectangular{

}

//Ordered Traits Example with Rational

class Rational1(n:Int,d:Int)extends Ordered[Rational1]{
require(d!=0)
def numer=n
def denom=d
def this(n:Int)=this(n,1)
override def toString=numer+"/"+denom
def compare(that:Rational1)=
(this.numer*that.denom)-(that.numer*this.denom)
}
trait Ordered[T]{
def compare(that:T):Int
def <(that:T):Boolean=(this compare that)<0
def >(that:T):Boolean=(this compare that)>0
def <=(that:T):Boolean=(this compare that)<=0
def >=(that:T):Boolean=(this compare that)>=0
}

//Stackable Modifications :Doubling,Increasing,Filtering
import scala.collection.mutable.ArrayBuffer
abstract class IntQueue{
def get():Int
def put(x:Int)
}
class BasicIntQueue extends IntQueue{
private val buf=new ArrayBuffer[Int]
override def get():Int= buf.remove(0)
override def put(x:Int)= buf+=x
}
trait Doubling extends IntQueue {
override def put(x:Int)={put(x*2)}
}
class MyQueue extends BasicIntQueue with Doubling