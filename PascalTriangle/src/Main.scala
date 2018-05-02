

object Main {
  def pascal(column:Int,row:Int):Int= {
    if(column==0 || column==row)
      1
    else 
      pascal(column,row-1)+pascal(column-1,row-1)
      
  }
  def main(args:Array[String]){
    println(pascal(0,2));
    println(pascal(1,2))
    println(pascal(2,4))
  }
}