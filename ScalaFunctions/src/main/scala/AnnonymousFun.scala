

object AnnonymousFun {
  def main (Args : Array[String]){
    println(num(3))
    println(fun(7,9))
    increase(3)
    val someNumbers = List(-11, -10, -5, 0, 5, 10)
println(someNumbers.filter((x: Int) =>x > 0))

  }
  var num=(n1:Int)=>n1*2
  var fun=(n1:Int,n2:Int)=>n1+n2
  var increase=(x:Int)=>{
    println("Ashok")
    println("is here")
    x+1
  }
}