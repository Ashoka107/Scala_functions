

/*object HigherOrderFun {
    def main(args: Array[String]) {
      println( apply( layout, 10) )
   }
   def apply(f: Int => String, v: Int) = f(11)
   def layout[A](x: A) = "[" + x.toString() + "]"
}
*/
object HigherOrderFun extends App{
  def sum(f:Int=>Int,a:Int,b:Int):Int={
    def loop(a:Int,acc:Int):Int=
      if(a>b)acc
      else loop(a+1,f(a)+acc)
      loop(a,0)
    }
  println(sum(x=>x*x,3,5))
}