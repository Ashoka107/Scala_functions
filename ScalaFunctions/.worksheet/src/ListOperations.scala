object ListOperations {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(103); 
  val lion=new listOfString(List("ab.has","avir.at","asah.ya","si.ya","av.ni"));System.out.println("""lion  : listOfString = """ + $show(lion ));$skip(62); 
  val fruits="apples"::("banana"::("pears"::("litchy"::Nil)));System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(27); 
   val combo=lion ::fruits;System.out.println("""combo  : List[Object] = """ + $show(combo ));$skip(33); 
     val sort=lion.isort(fruits);System.out.println("""sort  : List[String] = """ + $show(sort ));$skip(95); 
     val sort2=lion.isortByPatternMatching(List("ab.has","avir.at","asah.ya","si.ya","av.ni"));System.out.println("""sort2  : List[String] = """ + $show(sort2 ));$skip(35); 
     val oper=new Someoperations();System.out.println("""oper  : Someoperations = """ + $show(oper ));$skip(30); 
     val flatten=oper.flatten;System.out.println("""flatten  : List[String] = """ + $show(flatten ));$skip(28); 
     val concat=oper.concat;System.out.println("""concat  : List[Int] = """ + $show(concat ))}
}

class listOfString(list:List[String]){
list.foreach { x => if(x.startsWith("a"))println(x) }
list.foreach { x => if(x.contains("ya"))println(x) }
list.foreach{x =>println( 1+x)}
list.foreach { x => println(x.replace(".","")) }


//Sorting List
def isort(list:List[String]):List[String]=
if(list.isEmpty)Nil
else insert(list.head,isort(list.tail))

def insert(x:String,li:List[String]):List[String]=
if(li.isEmpty||x<=li.head)x::li
else li.head :: insert(x,li.tail)


//Sorting List By Pattern Matching
def isortByPatternMatching(list:List[String]):List[String]= list match{
case List()=> List()
case x::xs1=>insertByPatternMatching(x,isortByPatternMatching(xs1))}

def insertByPatternMatching(x:String,li:List[String]):List[String]=li match{
case List() =>List(x)
case y::ys =>if(x<=y)x::li
              else y:: insertByPatternMatching(x,ys)
}
}

class Someoperations{

val list=List(List("a","b"),List("c","d"),List("e","f"))
//Flatten operation:It results single List from List of Lists
val flatten=list.flatten

//Concat:It results single List from multiple Lists
val concat=List.concat(List(1,2,3),List(4,5,6))

//Mapping:The map2 method is similar to map, but it takes two lists as arguments together with a function that maps two element values to a result.
// The function gets applied to corresponding elements of the two lists, and a list is formed from the results:
// val map=List.map2(List(10,20),List(2,4,6))(_*_)
 
 //Adding Elements to the List
 //you can't add elements to a Scala List; it's an immutable data structure, like a Java String.
 //Prepending elements to Scala Lists
//One thing you can do when working with a Scala List is to create a new List from an existing List.
 val names=List("Aksh")
 val names2="Akhi"::names
 //Use a ListBuffer when you want a "List" you can modify
import scala.collection.mutable.ListBuffer
var fruits = new ListBuffer[String]()
fruits += "Apple"
fruits += "Banana"
fruits += "Orange"
val fruitsList = fruits.toList
//You can delete from listBuffer also
fruits -="Orange"
//We cant delete from Scala List(immutable),but we can filter out
val fruitsList2=fruitsList.filter(_.startsWith("O"))

//Sorting
val a = List(10, 5, 8, 1, 7).sorted
println(List("banana", "pear", "apple").sortWith(sortByLength))

def sortByLength(s1:String,s2:String) ={
//println("comparing %s & %s".format(s1,s2))
s1.length > s2.length

}
//Filter method with List
val filtered=a.filter(_<8)
}
