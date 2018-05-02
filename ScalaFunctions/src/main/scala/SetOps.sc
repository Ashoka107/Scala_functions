import scala.collection.mutable

object SetOps {
  val mutSet=mutable.Set(1,2,3)                   //> mutSet  : scala.collection.mutable.Set[Int] = Set(1, 2, 3)
  
  val text="See Spot run. Run, Spot. Run!"        //> text  : String = See Spot run. Run, Spot. Run!
  val wordsArray=text.split("[ !,.]+")            //> wordsArray  : Array[String] = Array(See, Spot, run, Run, Spot, Run)
  val words=mutable.Set.empty[String]             //> words  : scala.collection.mutable.Set[String] = Set()
  for(word<- wordsArray){
  words +=word.toLowerCase
  }
  println(words)                                  //> Set(see, run, spot)
}