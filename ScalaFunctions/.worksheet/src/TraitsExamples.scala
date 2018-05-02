


object TraitsExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(48); 
 
 val frog =new Frog;System.out.println("""frog  : Frog = """ + $show(frog ));$skip(30); 
 val phil=frog.philosophize();System.out.println("""phil  : Unit = """ + $show(phil ));$skip(128); 
 
// A trait also defines a type. Here's an example in which Philosophical is used as a type:
 val philosoph:Philosophical=frog;System.out.println("""philosoph  : Philosophical = """ + $show(philosoph ));$skip(37); 
 val philso=philosoph.philosophize();System.out.println("""philso  : Unit = """ + $show(philso ));$skip(96); 
 
 //Rich Interface -Rectangle example
 val rect=new Rectangle(new Point(1,1),new Point(10,10));System.out.println("""rect  : Rectangle = """ + $show(rect ));$skip(20); 
 val left=rect.left;System.out.println("""left  : Int = """ + $show(left ));$skip(22); 
 val right=rect.right;System.out.println("""right  : Int = """ + $show(right ));$skip(22); 
 val width=rect.width;System.out.println("""width  : Int = """ + $show(width ));$skip(67); 
 
 //Ordered traits with Rational
  val half = new Rational1(1, 2);System.out.println("""half  : Rational1 = """ + $show(half ));$skip(30); 
 val third=new Rational1(1,3);System.out.println("""third  : Rational1 = """ + $show(third ));$skip(23); 
 val result=half<third;System.out.println("""result  : Boolean = """ + $show(result ));$skip(24); 
 val result1=half>third;System.out.println("""result1  : Boolean = """ + $show(result1 ));$skip(25); 
 val result2=half<=third;System.out.println("""result2  : Boolean = """ + $show(result2 ));$skip(25); 
 val result3=half>=third;System.out.println("""result3  : Boolean = """ + $show(result3 ));$skip(52); 
 
 //STackable Modifications
 val queue=new MyQueue;System.out.println("""queue  : MyQueue = """ + $show(queue ));$skip(23); 
val put= queue.put(10);System.out.println("""put  : Unit = """ + $show(put ));$skip(23); 
val put2=queue.put(20);System.out.println("""put2  : Unit = """ + $show(put2 ));$skip(21); 
val get= queue.get();System.out.println("""get  : Int = """ + $show(get ));$skip(22); 
val get2= queue.get();System.out.println("""get2  : Int = """ + $show(get2 ))}
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
