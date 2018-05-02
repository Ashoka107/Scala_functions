

object FunctionCallByVariableArgs {
  
  def main(args: Array[String]){
    printStrings("Hi","I am","Ashok")
   
  }
  def printStrings(args:String*){
    var i: Int =0;
    for(arg <-args){
      println("Arg Value ->"+i+" "+arg);
      i=i+1;
    }
    
  }
}