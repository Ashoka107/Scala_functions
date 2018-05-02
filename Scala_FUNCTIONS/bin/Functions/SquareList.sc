package Functions

object SquareList {
  def squareList(list:List[Int]):List[Int]=list match{
  case Nil=>Nil
  case x::xs =>x*x::squareList(xs)
 }                                                //> squareList: (list: List[Int])List[Int]
  //OR
def squareList2(list:List[Int]):List[Int]={
list map(x=>x*x)
}                                                 //> squareList2: (list: List[Int])List[Int]
def posNums(list:List[Int]):List[Int]=list match{
case Nil=>Nil
case x::xs=>if(x>0)x::posNums(xs) else posNums(xs)
}                                                 //> posNums: (list: List[Int])List[Int]
def pack[T](list:List[T]):List[List[T]]=list match{
case Nil=>Nil
case x::xs=>val (head,rest)=list span(y=>x==y)
 head :: pack(rest)
}                                                 //> pack: [T](list: List[T])List[List[T]]
def encode[T](list:List[T]):List[(T,Int)]={
pack(list)map(xs=>(xs.head,xs.length))
}                                                 //> encode: [T](list: List[T])List[(T, Int)]
val nums=List(3,6,2,3,4,-3)                       //> nums  : List[Int] = List(3, 6, 2, 3, 4, -3)
squareList(nums)                                  //> res0: List[Int] = List(9, 36, 4, 9, 16, 9)
squareList2(nums)                                 //> res1: List[Int] = List(9, 36, 4, 9, 16, 9)
posNums(nums)                                     //> res2: List[Int] = List(3, 6, 2, 3, 4)
nums.filter(x=>x>0)                               //> res3: List[Int] = List(3, 6, 2, 3, 4)
nums.filterNot { x => x>0 }                       //> res4: List[Int] = List(-3)
nums.partition(x=>x>0)                            //> res5: (List[Int], List[Int]) = (List(3, 6, 2, 3, 4),List(-3))
nums.takeWhile(x=>x>0)                            //> res6: List[Int] = List(3, 6, 2, 3, 4)
nums.dropWhile(x=>x>0)                            //> res7: List[Int] = List(-3)
nums.span(x=>x>0)                                 //> res8: (List[Int], List[Int]) = (List(3, 6, 2, 3, 4),List(-3))
val str=List("a","a","a","b","c","c","d","d","d","a")
                                                  //> str  : List[String] = List(a, a, a, b, c, c, d, d, d, a)
pack(str)                                         //> res9: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(d, 
                                                  //| d, d), List(a))
encode(str)                                       //> res10: List[(String, Int)] = List((a,3), (b,1), (c,2), (d,3), (a,1))

}