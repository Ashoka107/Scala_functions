import scala.collection.mutable
object MapOperations {
// here is a method that counts the number of times each word occurs in a string
def countWords(text:String)={
val counts=mutable.Map.empty[String,Int]
for (rawWord<-text.split("[ !,.]+")){
val word=rawWord.toLowerCase
val oldCount=
if(counts.contains(word))counts(word)
else 0
counts+=(word->(oldCount+1))
}
counts
}                                                 //> countWords: (text: String)scala.collection.mutable.Map[String,Int]
countWords("See Spot run! Run, Spot. Run!")       //> res0: scala.collection.mutable.Map[String,Int] = Map(spot -> 2, see -> 1, ru
                                                  //| n -> 3)

//Common operations for maps
val map=Map("i"->1,"ii"->2)                       //> map  : scala.collection.immutable.Map[String,Int] = Map(i -> 1, ii -> 2)
map+("iii"->3)                                    //> res1: scala.collection.immutable.Map[String,Int] = Map(i -> 1, ii -> 2, iii 
                                                  //| -> 3)
map-"ii"                                          //> res2: scala.collection.immutable.Map[String,Int] = Map(i -> 1)
map++List("iii"->3,"vi"->4)                       //> res3: scala.collection.immutable.Map[String,Int] = Map(i -> 1, ii -> 2, iii 
                                                  //| -> 3, vi -> 4)
map--List("i","ii")                               //> res4: scala.collection.immutable.Map[String,Int] = Map()
map.size                                          //> res5: Int = 2
map.contains("ii")                                //> res6: Boolean = true
map("ii")                                         //> res7: Int = 2
map.keys                                          //> res8: Iterable[String] = Set(i, ii)
map.keySet                                        //> res9: scala.collection.immutable.Set[String] = Set(i, ii)
map.values                                        //> res10: Iterable[Int] = MapLike(1, 2)
val words=mutable.Map.empty [String,Int]          //> words  : scala.collection.mutable.Map[String,Int] = Map()
words+=("one"->1,"two"->2)                        //> res11: MapOperations.words.type = Map(one -> 1, two -> 2)
words-=("two")                                    //> res12: MapOperations.words.type = Map(one -> 1)
words+=("three"->3)                               //> res13: MapOperations.words.type = Map(one -> 1, three -> 3)
words++=List("two"->2,"four"->4,"five"->5)        //> res14: MapOperations.words.type = Map(one -> 1, three -> 3, four -> 4, five 
                                                  //| -> 5, two -> 2)
words--=List("four","five")                       //> res15: MapOperations.words.type = Map(one -> 1, three -> 3, two -> 2)

//Sorted Map
import scala.collection.immutable.TreeMap

val triMap=TreeMap("c"->"Chiu","a"->"Aksh","b"->"Bal")
                                                  //> triMap  : scala.collection.immutable.TreeMap[String,String] = Map(a -> Aksh,
                                                  //|  b -> Bal, c -> Chiu)
triMap                                            //> res16: scala.collection.immutable.TreeMap[String,String] = Map(a -> Aksh, b 
                                                  //| -> Bal, c -> Chiu)
var triMapmut=TreeMap(1->'x',2->'y',3->'z')       //> triMapmut  : scala.collection.immutable.TreeMap[Int,Char] = Map(1 -> x, 2 ->
                                                  //|  y, 3 -> z)
triMapmut                                         //> res17: scala.collection.immutable.TreeMap[Int,Char] = Map(1 -> x, 2 -> y, 3 
                                                  //| -> z)
 //Converting between mutable and immutable sets and maps
 var mapMut=mutable.Map.empty[Int,String]         //> mapMut  : scala.collection.mutable.Map[Int,String] = Map()
 mapMut++=List(1->"Ansh",2->"Abha",3->"Arav")     //> res18: scala.collection.mutable.Map[Int,String] = Map(2 -> Abha, 1 -> Ansh,
                                                  //|  3 -> Arav)
 val comboMap=Map.empty++mapMut                   //> comboMap  : scala.collection.immutable.Map[Int,String] = Map(2 -> Abha, 1 -
                                                  //| > Ansh, 3 -> Arav)
 val ImutToMut=mutable.Map.empty ++ comboMap      //> ImutToMut  : scala.collection.mutable.Map[Int,String] = Map(2 -> Abha, 1 ->
                                                  //|  Ansh, 3 -> Arav)
                                                  
}