package Functions

object LongestWord {
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
 }                                                //> longestWord: (words: Array[String])(String, Int)
val longest= longestWord("Get up, Show up, Don't Give up".split(" "))
                                                  //> longest  : (String, Int) = (Don't,4)
   longest._1                                     //> res0: String = Don't
   longest._2                                     //> res1: Int = 4
}