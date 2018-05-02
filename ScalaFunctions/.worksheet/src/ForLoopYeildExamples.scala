object ForLoopYeildExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(52); 
val obj=new Examples();System.out.println("""obj  : Examples = """ + $show(obj ));$skip(20); 
println(obj.vector);$skip(21); 
println(obj.vector2);$skip(36); 
println(obj.al.head+""+obj.al.tail)}
}
class Examples(){
val vector= for(i<-1 to 5)yield i
val vector2=for (i<-1 to 7)yield i*2
val a = Array(1, 2, 3, 4, 5)
val al=for (i <-a) yield i%2
}
