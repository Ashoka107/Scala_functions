package Functions
import scala.collection.immutable.TreeSet
import scala.collection.mutable
object InitializingCollections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(157); 
  val people=Set ("Joe","Jenny");System.out.println("""people  : scala.collection.immutable.Set[String] = """ + $show(people ));$skip(55); 
  //people +="Bob"
  
  var peoples=Set("Jack","Jhon");System.out.println("""peoples  : scala.collection.immutable.Set[String] = """ + $show(peoples ));$skip(19); 
  peoples+="Jimmy";$skip(10); val res$0 = 
  peoples;System.out.println("""res0: scala.collection.immutable.Set[String] = """ + $show(res$0));$skip(18); 
  peoples-="Jack";$skip(10); val res$1 = 
  peoples;System.out.println("""res1: scala.collection.immutable.Set[String] = """ + $show(res$1));$skip(31); 
  
  val stuff=mutable.Set(42);System.out.println("""stuff  : scala.collection.mutable.Set[Int] = """ + $show(stuff ));$skip(49); 
 //stuff+="str"
 val stuff1=mutable.Set[Any](42);System.out.println("""stuff1  : scala.collection.mutable.Set[Any] = """ + $show(stuff1 ));$skip(15); val res$2 = 
 stuff1+="hey";System.out.println("""res2: Functions.InitializingCollections.stuff1.type = """ + $show(res$2));$skip(8); val res$3 = 
 stuff1;System.out.println("""res3: scala.collection.mutable.Set[Any] = """ + $show(res$3));$skip(44); 
 
 val map=Map("hi"->1,"dear"->2,"Rose"->3);System.out.println("""map  : scala.collection.immutable.Map[String,Int] = """ + $show(map ));$skip(18); val res$4 = 
 map+("there"->2);System.out.println("""res4: scala.collection.immutable.Map[String,Int] = """ + $show(res$4));$skip(35); val res$5 = 
 map++List("How"->3,"R"->4,"U"->5);System.out.println("""res5: scala.collection.immutable.Map[String,Int] = """ + $show(res$5));$skip(5); val res$6 = 
 map;System.out.println("""res6: scala.collection.immutable.Map[String,Int] = """ + $show(res$6));$skip(12); val res$7 = 
 
 map.keys;System.out.println("""res7: Iterable[String] = """ + $show(res$7));$skip(12); val res$8 = 
 map.values;System.out.println("""res8: Iterable[Int] = """ + $show(res$8));$skip(12); val res$9 = 
 map.keySet;System.out.println("""res9: scala.collection.immutable.Set[String] = """ + $show(res$9));$skip(50); 
 
 val colours=List("Blue","Red","Black","Green");System.out.println("""colours  : List[String] = """ + $show(colours ));$skip(41); 
 val map1= TreeSet[String]() ++(colours);System.out.println("""map1  : scala.collection.immutable.TreeSet[String] = """ + $show(map1 ))}
}
