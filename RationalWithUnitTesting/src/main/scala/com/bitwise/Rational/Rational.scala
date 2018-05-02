

package com.bitwise.Rational

class Rational(numer: Int, denom: Int) {
//require(denom!=0)

  val g=gcd(numer.abs,denom.abs)
  val numerator=numer / g
  val denominator=denom / g
  def this(num:Int)=this(num,1)
override def toString()={numerator+"/"+denominator }
 private def gcd(num:Int,deno:Int):Int=
   if(deno==0)num else gcd(deno,num%deno)

  def add(that:Rational):Int={
    (this.numerator*that.denominator+that.numerator+denominator)/(denominator*that.denominator)
  }
}
object Rational{
  def apply(n:Int,d:Int):Rational = d match{
    case 0=> throw new IllegalArgumentException
    case _=> new Rational(n,d)
  }
}
