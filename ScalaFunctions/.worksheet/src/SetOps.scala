import scala.collection.mutable

object SetOps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  val mutSet=mutable.Set(1,2,3);System.out.println("""mutSet  : scala.collection.mutable.Set[Int] = """ + $show(mutSet ));$skip(46); 
  
  val text="See Spot run. Run, Spot. Run!";System.out.println("""text  : String = """ + $show(text ));$skip(39); 
  val wordsArray=text.split("[! ,.]+");System.out.println("""wordsArray  : Array[String] = """ + $show(wordsArray ));$skip(38); 
  val words=mutable.Set.empty[String];System.out.println("""words  : scala.collection.mutable.Set[String] = """ + $show(words ));$skip(53); 
  for(word<- wordsArray){
  words +=word.toLowerCase
  };$skip(21); 
  println(words)}
}
