object Rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(43); 
  val x=new Rational(2,3);System.out.println("""x  : Rational#1082146 = """ + $show(x ));$skip(26); 
  val y=new Rational(5,7);System.out.println("""y  : Rational#1082146 = """ + $show(y ));$skip(26); 
  val z=new Rational(3,9);System.out.println("""z  : Rational#1082146 = """ + $show(z ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int#1080 = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int#1080 = """ + $show(res$1));$skip(18); val res$2 = 
  x.add(y).add(z);System.out.println("""res2: Rational#1082146 = """ + $show(res$2))}
  
}

class Rational(n:Int,d:Int)extends Ordered[Rational]{
require(d!=0)
def numer=n
def denom=d

def this(n:Int)=this(n,1)
override def toString=numer+"/"+denom
def add(that:Rational):Rational={
new Rational(numer*that.denom+that.numer*denom,that.denom*denom)
}
def add(n:Int):Rational=
new Rational(numer+n*denom,denom)

def sub(that:Rational):Rational=
new Rational(numer*that.denom-that.numer*denom,that.denom*denom)

def sub(n:Int):Rational=
new Rational(numer-n*denom,denom)

def mul(that:Rational):Rational=
new Rational(numer*that.numer,denom*that.denom)

def mul(n:Int):Rational=
new Rational(numer*n,denom)

def compare(that:Rational)=
(this.numer*that.denom)-(that.numer*this.denom)
}
