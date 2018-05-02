

object CurryingFun {
  def main(args: Array[String]){
    println(curry("Samrat")(" Ashok"))
  }
  def curry(str1:String)(str2:String) =str1+str2
}