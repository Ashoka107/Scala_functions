package Functions
import scala.collection.immutable.TreeSet
import scala.collection.mutable
object InitializingCollections {
  val people=Set ("Joe","Jenny")                  //> people  : scala.collection.immutable.Set[String] = Set(Joe, Jenny)
  //people +="Bob"
  
  var peoples=Set("Jack","Jhon")                  //> peoples  : scala.collection.immutable.Set[String] = Set(Jack, Jhon)
  peoples+="Jimmy"
  peoples                                         //> res0: scala.collection.immutable.Set[String] = Set(Jack, Jhon, Jimmy)
  peoples-="Jack"
  peoples                                         //> res1: scala.collection.immutable.Set[String] = Set(Jhon, Jimmy)
  
  val stuff=mutable.Set(42)                       //> stuff  : scala.collection.mutable.Set[Int] = Set(42)
 //stuff+="str"
 val stuff1=mutable.Set[Any](42)                  //> stuff1  : scala.collection.mutable.Set[Any] = Set(42)
 stuff1+="hey"                                    //> res2: Functions.InitializingCollections.stuff1.type = Set(hey, 42)
 stuff1                                           //> res3: scala.collection.mutable.Set[Any] = Set(hey, 42)
 
 val map=Map("hi"->1,"dear"->2,"Rose"->3)         //> map  : scala.collection.immutable.Map[String,Int] = Map(hi -> 1, dear -> 2, 
                                                  //| Rose -> 3)
 map+("there"->2)                                 //> res4: scala.collection.immutable.Map[String,Int] = Map(hi -> 1, dear -> 2, R
                                                  //| ose -> 3, there -> 2)
 map++List("How"->3,"R"->4,"U"->5)                //> res5: scala.collection.immutable.Map[String,Int] = Map(How -> 3, U -> 5, Ros
                                                  //| e -> 3, hi -> 1, R -> 4, dear -> 2)
 map                                              //> res6: scala.collection.immutable.Map[String,Int] = Map(hi -> 1, dear -> 2, R
                                                  //| ose -> 3)
 
 map.keys                                         //> res7: Iterable[String] = Set(hi, dear, Rose)
 map.values                                       //> res8: Iterable[Int] = MapLike(1, 2, 3)
 map.keySet                                       //> res9: scala.collection.immutable.Set[String] = Set(hi, dear, Rose)
 
 val colours=List("Blue","Red","Black","Green")   //> colours  : List[String] = List(Blue, Red, Black, Green)
 val map1= TreeSet[String]() ++(colours)          //> map1  : scala.collection.immutable.TreeSet[String] = TreeSet(Black, Blue, Gr
                                                  //| een, Red)
}