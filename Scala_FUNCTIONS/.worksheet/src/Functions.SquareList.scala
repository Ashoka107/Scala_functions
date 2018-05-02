package Functions

object SquareList {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(147); 
  def squareList(list:List[Int]):List[Int]=list match{
  case Nil=>Nil
  case x::xs =>x*x::squareList(xs)
 };System.out.println("""squareList: (list: List[Int])List[Int]""");$skip(70); 
  //OR
def squareList2(list:List[Int]):List[Int]={
list map(x=>x*x)
};System.out.println("""squareList2: (list: List[Int])List[Int]""");$skip(117); 
def posNums(list:List[Int]):List[Int]=list match{
case Nil=>Nil
case x::xs=>if(x>0)x::posNums(xs) else posNums(xs)
};System.out.println("""posNums: (list: List[Int])List[Int]""");$skip(135); 
def pack[T](list:List[T]):List[List[T]]=list match{
case Nil=>Nil
case x::xs=>val (head,rest)=list span(y=>x==y)
 head :: pack(rest)
};System.out.println("""pack: [T](list: List[T])List[List[T]]""");$skip(85); 
def encode[T](list:List[T]):List[(T,Int)]={
pack(list)map(xs=>(xs.head,xs.length))
};System.out.println("""encode: [T](list: List[T])List[(T, Int)]""");$skip(28); 
val nums=List(3,6,2,3,4,-3);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(17); val res$0 = 
squareList(nums);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(18); val res$1 = 
squareList2(nums);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(14); val res$2 = 
posNums(nums);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(20); val res$3 = 
nums.filter(x=>x>0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(28); val res$4 = 
nums.filterNot { x => x>0 };System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(23); val res$5 = 
nums.partition(x=>x>0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(23); val res$6 = 
nums.takeWhile(x=>x>0);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(23); val res$7 = 
nums.dropWhile(x=>x>0);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(18); val res$8 = 
nums.span(x=>x>0);System.out.println("""res8: (List[Int], List[Int]) = """ + $show(res$8));$skip(54); 
val str=List("a","a","a","b","c","c","d","d","d","a");System.out.println("""str  : List[String] = """ + $show(str ));$skip(10); val res$9 = 
pack(str);System.out.println("""res9: List[List[String]] = """ + $show(res$9));$skip(12); val res$10 = 
encode(str);System.out.println("""res10: List[(String, Int)] = """ + $show(res$10))}

}
