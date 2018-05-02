package com.bitwise.MergeSort

object msort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(393); 
  def msort1(xs:List[Int]):List[Int]={
  val n=xs.length/2
  if(n==0)xs
  else{
  def merge(xs:List[Int],ys:List[Int]):List[Int]=(xs,ys) match{
    case (Nil,ys)=>ys
    case (xs,Nil)=>xs
    case (x :: xs1,y :: ys1)=> if(x<y)x :: merge(xs1,ys)
    else y :: merge(xs,ys1)
  }
  val (fst,snd)=xs splitAt(n)
  merge(msort1(fst),msort1(snd))
  }
  };System.out.println("""msort1: (xs: List[Int])List[Int]""");$skip(65); 
  val list=List(2,4,3,1,6,9,5,9,7,67,768,6,7,6,5,4566,8,7,6,6,5);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(16); val res$0 = 
   msort1(list);System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
