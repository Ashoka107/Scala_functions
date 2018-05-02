object Car  {
  val car=new Car(2016,277)                       //> 2016 277
                                                  //| car  : Car = Car@1684286
  val compu=new Computation(List(1,2,3,4,5),selector =(x :Int) => x*x)
                                                  //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
                                                  //| 25
                                                  //| compu  : Computation = Computation@108b2d7
  val compu2=new Computation(List(1,2,3,4,5),selector =(x :Int) => x %2)
                                                  //> 1
                                                  //| 0
                                                  //| 1
                                                  //| 0
                                                  //| 1
                                                  //| compu2  : Computation = Computation@154909b
  val compu3=new Computation(List(1,2,3,4,5),selector =(x :Int) => if(x>3)x else 0)
}
class Car(val year:Int,var miles:Int){
  println(year+" "+miles)
}

class Computation(list:List[Int],selector :Int=>Int){
list.foreach { x => println(selector(x)) }
}