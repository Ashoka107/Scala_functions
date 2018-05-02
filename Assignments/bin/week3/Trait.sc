package week3

object Trait {
 def nth[T](n:Int,li:List[T]):T={
 if(li.isEmpty)throw new IndexOutOfBoundsException
 else if(n==0)li.head
 else nth(n-1,li.tail)
 }
 val list=new Cons(1,new Cons(2,new Cons(3,new Nil)))
 nth(2,list)
 nth(3,list)
}