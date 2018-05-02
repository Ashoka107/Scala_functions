object PatternMatching {
 case class Person(firstName: String, lastName: String)
   case class Dog(name: String)

    // trigger the constant patterns
    println(patterns(0))                          //> zero
    println(patterns(true))                       //> true
    println(patterns("hello"))                    //> You said Hello
    println(patterns(Nil))                        //> an Empty Set

    // trigger the sequence patterns
    println(patterns(List(0,1,2)))                //> List of three element sequence with 0 start element 
    println(patterns(List(1,2)))                  //> a List Beggining with 1,ahving any no. of elements
    println(patterns(List(1,2,3)))                //> a List Beggining with 1,ahving any no. of elements
    println(patterns(Vector(1,2,3)))              //> unknown

    // trigger the tuple patterns
    println(patterns((1,2)))         // two element tuple
                                                  //> got 1,2
    println(patterns((1,2,3)))       // three element tuple
                                                  //> got 1,2 and 3

    // trigger the constructor patterns
    println(patterns(Person("Melissa", "Alexander")))
                                                  //> found an Alexander,first name as Melissa
    println(patterns(Dog("Suka")))                //> Found a dog name Suka

    // trigger the typed patterns
    println(patterns("Hello, world"))             //> U gave me a string Hello, world
    println(patterns(42))                         //> U gave me a Int 42
    println(patterns(42F))                        //> U gave me a float 42.0
    println(patterns(Array(1,2,3)))               //> u gave me a Array of Int [I@1dc03ce
    println(patterns(Array("coffee", "apple pie")))
                                                  //> an Array of String [Ljava.lang.String;@f8360d
    println(patterns(Dog("Fido")))                //> dog: Fido
    println(patterns(List("apple", "banana")))    //> thanks for the list: List(apple, banana)
    println(patterns(Map(1->"Al", 2->"Alexander")))
                                                  //> This is a map: Map(1 -> Al, 2 -> Alexander)

    // trigger the wildcard pattern
    println(patterns("33d"))                      //> U gave me a string 33d

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
  
  
  }                                               //> patterns: (obj: Any)String
}