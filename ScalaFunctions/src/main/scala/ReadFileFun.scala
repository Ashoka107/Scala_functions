
import scala.io.Source
  
object ReadFileFun {
  def processFile(filename: String, width: Int) {
        val source = Source.fromFile(filename)
        for (line <- source.getLines) 
          processLine(filename, width, line)
      }
  
      private def processLine(filename: String,
          width: Int, line: String) {
  
        if (line.length > width)
          println(filename +": "+ line.trim)
      }
      def main(args:Array[String]){
        processFile("Lines.txt",12);
      }

}