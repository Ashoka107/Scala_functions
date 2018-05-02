object CurrentDateTime {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  println("Welcome to the Scala worksheet");$skip(73); 
  
  def time{
val time=Calendar.getInstance().getTime()
println(time)
};System.out.println("""time: => Unit""")}
}
