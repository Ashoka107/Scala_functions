object ListReadFun {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(41); 
val list=List(1,2,3);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(26); val res$0 = 
  println(""+nth(1,list));System.out.println("""res0: <error> = """ + $show(res$0))}
}
object nth{
def nth(n:Int,xs:List[Int]): Int =
if(xs.isEmpty) throw new IndexOutOfBoundsException
else if (n==0)xs.head
else nth(n-1,xs.tail)
}
