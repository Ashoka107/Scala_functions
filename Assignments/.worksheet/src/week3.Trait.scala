package week3

object Trait {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(162); 
 def nth[T](n:Int,li:List[T]):T={
 if(li.isEmpty)throw new IndexOutOfBoundsException
 else if(n==0)li.head
 else nth(n-1,li.tail)
 };System.out.println("""nth: [T](n: Int, li: week3.List[T])T""");$skip(54); 
 val list=new Cons(1,new Cons(2,new Cons(3,new Nil)));System.out.println("""list  : week3.Cons[Int] = """ + $show(list ));$skip(13); val res$0 = 
 nth(2,list);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
 nth(3,list);System.out.println("""res1: Int = """ + $show(res$1))}
}
