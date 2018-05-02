import scala.collection.mutable
object MapOperations {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(372); 
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
};System.out.println("""countWords: (text: String)scala.collection.mutable.Map[String,Int]""");$skip(44); val res$0 = 
countWords("See Spot run! Run, Spot. Run!");System.out.println("""res0: scala.collection.mutable.Map[String,Int] = """ + $show(res$0));$skip(58); 

//Common operations for maps
val map=Map("i"->1,"ii"->2);System.out.println("""map  : scala.collection.immutable.Map[String,Int] = """ + $show(map ));$skip(15); val res$1 = 
map+("iii"->3);System.out.println("""res1: scala.collection.immutable.Map[String,Int] = """ + $show(res$1));$skip(9); val res$2 = 
map-"ii";System.out.println("""res2: scala.collection.immutable.Map[String,Int] = """ + $show(res$2));$skip(28); val res$3 = 
map++List("iii"->3,"vi"->4);System.out.println("""res3: scala.collection.immutable.Map[String,Int] = """ + $show(res$3));$skip(20); val res$4 = 
map--List("i","ii");System.out.println("""res4: scala.collection.immutable.Map[String,Int] = """ + $show(res$4));$skip(9); val res$5 = 
map.size;System.out.println("""res5: Int = """ + $show(res$5));$skip(19); val res$6 = 
map.contains("ii");System.out.println("""res6: Boolean = """ + $show(res$6));$skip(10); val res$7 = 
map("ii");System.out.println("""res7: Int = """ + $show(res$7));$skip(9); val res$8 = 
map.keys;System.out.println("""res8: Iterable[String] = """ + $show(res$8));$skip(11); val res$9 = 
map.keySet;System.out.println("""res9: scala.collection.immutable.Set[String] = """ + $show(res$9));$skip(11); val res$10 = 
map.values;System.out.println("""res10: Iterable[Int] = """ + $show(res$10));$skip(41); 
val words=mutable.Map.empty [String,Int];System.out.println("""words  : scala.collection.mutable.Map[String,Int] = """ + $show(words ));$skip(27); val res$11 = 
words+=("one"->1,"two"->2);System.out.println("""res11: MapOperations.words.type = """ + $show(res$11));$skip(15); val res$12 = 
words-=("two");System.out.println("""res12: MapOperations.words.type = """ + $show(res$12));$skip(20); val res$13 = 
words+=("three"->3);System.out.println("""res13: MapOperations.words.type = """ + $show(res$13));$skip(43); val res$14 = 
words++=List("two"->2,"four"->4,"five"->5);System.out.println("""res14: MapOperations.words.type = """ + $show(res$14));$skip(28); val res$15 = 
words--=List("four","five")

//Sorted Map
import scala.collection.immutable.TreeMap;System.out.println("""res15: MapOperations.words.type = """ + $show(res$15));$skip(112); 

val triMap=TreeMap("c"->"Chiu","a"->"Aksh","b"->"Bal");System.out.println("""triMap  : scala.collection.immutable.TreeMap[String,String] = """ + $show(triMap ));$skip(7); val res$16 = 
triMap;System.out.println("""res16: scala.collection.immutable.TreeMap[String,String] = """ + $show(res$16));$skip(44); 
var triMapmut=TreeMap(1->'x',2->'y',3->'z');System.out.println("""triMapmut  : scala.collection.immutable.TreeMap[Int,Char] = """ + $show(triMapmut ));$skip(10); val res$17 = 
triMapmut;System.out.println("""res17: scala.collection.immutable.TreeMap[Int,Char] = """ + $show(res$17));$skip(100); 
 //Converting between mutable and immutable sets and maps
 var mapMut=mutable.Map.empty[Int,String];System.out.println("""mapMut  : scala.collection.mutable.Map[Int,String] = """ + $show(mapMut ));$skip(46); val res$18 = 
 mapMut++=List(1->"Ansh",2->"Abha",3->"Arav");System.out.println("""res18: scala.collection.mutable.Map[Int,String] = """ + $show(res$18));$skip(32); 
 val comboMap=Map.empty++mapMut;System.out.println("""comboMap  : scala.collection.immutable.Map[Int,String] = """ + $show(comboMap ));$skip(45); 
 val ImutToMut=mutable.Map.empty ++ comboMap;System.out.println("""ImutToMut  : scala.collection.mutable.Map[Int,String] = """ + $show(ImutToMut ))}
                                                  
}
