object StackAbstractClass {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
val x = new EmptyStack[Int];System.out.println("""x  : EmptyStack[Int] = """ + $show(x ));$skip(26); 
val y = x.push(1).push(2);System.out.println("""y  : Stack[Int] = """ + $show(y ));$skip(19); 
println(y.pop.top);$skip(16); 
val c=y.push(3);System.out.println("""c  : Stack[Int] = """ + $show(c ));$skip(19); 
println(c.pop.top);$skip(19); 
println(c.pop.top)}
}

abstract class Stack[A]{
def push(x:A):Stack[A]=new NonEmptyStack[A](x,this)
def isEmpty:Boolean
def top:A
def pop:Stack[A]
}
class NonEmptyStack[A](elem:A,rest:Stack[A]) extends Stack[A]{
def isEmpty=false
def top=elem
def pop=rest
}

class EmptyStack[A]() extends Stack[A]{
def isEmpty=true
def top=error("EmptyStack.push")
def pop=error("EmptyStack.pop")
}
