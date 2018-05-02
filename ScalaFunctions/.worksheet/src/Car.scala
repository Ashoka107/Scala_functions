object Car  {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(41); 
  val car=new Car(2016,277);System.out.println("""car  : Car = """ + $show(car ));$skip(71); 
  val compu=new Computation(List(1,2,3,4,5),selector =(x :Int) => x*x);System.out.println("""compu  : Computation = """ + $show(compu ));$skip(73); 
  val compu2=new Computation(List(1,2,3,4,5),selector =(x :Int) => x %2);System.out.println("""compu2  : Computation = """ + $show(compu2 ));$skip(84); 
  val compu3=new Computation(List(1,2,3,4,5),selector =(x :Int) => if(x>3)x else 0);System.out.println("""compu3  : Computation = """ + $show(compu3 ))}
}
class Car(val year:Int,var miles:Int){
  println(year+" "+miles)
}

class Computation(list:List[Int],selector :Int=>Int){
list.foreach { x => println(selector(x)) }
}
