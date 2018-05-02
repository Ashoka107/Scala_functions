object TupplesOps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(277); 
// here is a method that finds the longest word in a collection and also returns its index:
def longestWord(words:Array[String])={
var word=words(0)
var idx=0
for(i<-1 until words.length)
if(words(i).length > word.length){
word=words(i)
idx=i
}
(word,idx)
};System.out.println("""longestWord: (words: Array[String])(String, Int)""");$skip(58); 
val longest=longestWord("The quick brown fox".split(" "));System.out.println("""longest  : (String, Int) = """ + $show(longest ));$skip(11); val res$0 = 
longest._1;System.out.println("""res0: String = """ + $show(res$0));$skip(11); val res$1 = 
longest._2;System.out.println("""res1: Int = """ + $show(res$1))}
}
