object ForLoopYeildExamples {
val obj=new Examples()                            //> obj  : Examples = Examples@1adae5d
println(obj.vector)                               //> Vector(1, 2, 3, 4, 5)
println(obj.vector2)                              //> Vector(2, 4, 6, 8, 10, 12, 14)
println(obj.al.head+""+obj.al.tail)               //> 1[I@108b2d7
}
class Examples(){
val vector= for(i<-1 to 5)yield i
val vector2=for (i<-1 to 7)yield i*2
val a = Array(1, 2, 3, 4, 5)
val al=for (i <-a) yield i%2
}