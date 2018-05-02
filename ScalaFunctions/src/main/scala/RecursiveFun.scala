
object RecursiveFun {
    def main(args :Array[String]){
    var i=Int;
    for(i<- 1 to 10){
      println("Factorial Of "+i+"="+factorial(i))
    }
  }
  def factorial(j:BigInt): BigInt={
    if(j<=1)
      1
    else
      j*factorial(j-1)
  }
}