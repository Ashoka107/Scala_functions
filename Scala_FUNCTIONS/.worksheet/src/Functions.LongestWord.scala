package Functions

object LongestWord {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(224); 
 def longestWord(words:Array[String])={
 var word=words(0)
 var indx=0
 for(i <- 1 until words.length){
 if(words(i).length > word.length){
 word=words(i)
 indx=i
 }
 }
 (word,indx)
 };System.out.println("""longestWord: (words: Array[String])(String, Int)""");$skip(70); 
val longest= longestWord("Get up, Show up, Don't Give up".split(" "));System.out.println("""longest  : (String, Int) = """ + $show(longest ));$skip(14); val res$0 = 
   longest._1;System.out.println("""res0: String = """ + $show(res$0));$skip(14); val res$1 = 
   longest._2;System.out.println("""res1: Int = """ + $show(res$1))}
}
