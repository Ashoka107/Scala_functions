object Rational {
  val x=new Rational(2,3)                         //> x  : Rational#1082146 = 2/3
  val y=new Rational(5,7)                         //> y  : Rational#1082146 = 5/7
  val z=new Rational(3,9)                         //> z  : Rational#1082146 = 3/9
  x.numer                                         //> res0: Int#1080 = 2
  x.denom                                         //> res1: Int#1080 = 3
  x.add(y).add(z)                                 //> res2: Rational#1082146 = 324/189
  
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