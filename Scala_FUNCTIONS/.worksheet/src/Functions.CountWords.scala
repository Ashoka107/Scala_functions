package Functions
import scala.collection.mutable

object CountWords {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(364); 
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
  };System.out.println("""countWords: (text: String)scala.collection.mutable.Map[String,Int]""");$skip(46); val res$0 = 
  countWords("See Spot run! Run, Spot. Run!");System.out.println("""res0: scala.collection.mutable.Map[String,Int] = """ + $show(res$0))}
}
