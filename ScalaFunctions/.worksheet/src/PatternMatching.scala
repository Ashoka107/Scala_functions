object PatternMatching {
 case class Person(firstName: String, lastName: String)
   case class Dog(name: String);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(175); 

    // trigger the constant patterns
    println(patterns(0));$skip(28); 
    println(patterns(true));$skip(31); 
    println(patterns("hello"));$skip(27); 
    println(patterns(Nil));$skip(73); 

    // trigger the sequence patterns
    println(patterns(List(0,1,2)));$skip(33); 
    println(patterns(List(1,2)));$skip(35); 
    println(patterns(List(1,2,3)));$skip(37); 
    println(patterns(Vector(1,2,3)));$skip(93); 

    // trigger the tuple patterns
    println(patterns((1,2)));$skip(60);          // two element tuple
    println(patterns((1,2,3)));$skip(95);        // three element tuple

    // trigger the constructor patterns
    println(patterns(Person("Melissa", "Alexander")));$skip(35); 
    println(patterns(Dog("Suka")));$skip(73); 

    // trigger the typed patterns
    println(patterns("Hello, world"));$skip(26); 
    println(patterns(42));$skip(27); 
    println(patterns(42F));$skip(36); 
    println(patterns(Array(1,2,3)));$skip(52); 
    println(patterns(Array("coffee", "apple pie")));$skip(35); 
    println(patterns(Dog("Fido")));$skip(47); 
    println(patterns(List("apple", "banana")));$skip(52); 
    println(patterns(Map(1->"Al", 2->"Alexander")));$skip(66); 

    // trigger the wildcard pattern
    println(patterns("33d"));$skip(1038); 

  def patterns(obj:Any):String=obj match{
//Constant pattern
  case 0=>"zero"
  case true=>"true"
  case "hello"=>"You said Hello"
  case Nil=>"an Empty Set"
  
  //Sequence Patterns
  case List(0,_,_)=>"List of three element sequence with 0 start element "
  case List(1,_*)=>"a List Beggining with 1,ahving any no. of elements"
  case Vector(0,_*)=>"a vector with 0 as start element,having any no.of element"
  
  //Tuples
  case (a,b)=>s"got $a,$b"
  case (a,b,c)=>s"got $a,$b and $c"
  
  //constructor Patterns
  case Person(first, "Alexander") =>s"found an Alexander,first name as $first"
  case Dog("Suka")=>"Found a dog name Suka"
  
  //typped Patterns
  case s:String=>s"U gave me a string $s"
  case i:Int=>s"U gave me a Int $i"
  case f:Float=>s"U gave me a float $f"
  case a:Array[Int]=>s"u gave me a Array of Int $a"
  case as:Array[String]=>s"an Array of String $as"
  case d:Dog =>s"dog: ${d.name}"
  case list:List[_]=>s"thanks for the list: $list"
  case m:Map[_,_]=>s"This is a map: $m"
  case _=>"unknown"
  
  
  };System.out.println("""patterns: (obj: Any)String""")}
}
