object StackAbstractClass {
val x = new EmptyStack[Int]                       //> x  : EmptyStack[Int] = EmptyStack@14f9431
val y = x.push(1).push(2)                         //> y  : Stack[Int] = NonEmptyStack@80ec60
println(y.pop.top)                                //> 1
val c=y.push(3)                                   //> c  : Stack[Int] = NonEmptyStack@13afe78
println(c.pop.top)                                //> 2
println(c.pop.top)                                //> 2
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