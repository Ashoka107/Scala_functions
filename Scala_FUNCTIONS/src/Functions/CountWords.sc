package Functions
import scala.collection.mutable

object CountWords {
  def countWords(text:String):mutable.Map[String,Int] = {
  val counts = mutable.Map.empty[String, Int]
  for(rawWords <- text.split("[ !,.]+")){
  val word=rawWords.toLowerCase
  val oldCount=
  if(counts.contains(word)) counts(word)
  else 0
  counts +=(word ->(oldCount+1))
  }
  counts
  }                                               //> countWords: (text: String)scala.collection.mutable.Map[String,Int]
  countWords("See Spot run! Run, Spot. Run!")     //> res0: scala.collection.mutable.Map[String,Int] = Map(spot -> 2, see -> 1, ru
                                                  //| n -> 3)
}