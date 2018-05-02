

package com.bitwise.MergeSort


class MergeSort {
//First Definition of Merge Sort
  def sort(xs:List[Int],ys:List[Int]):List[Int]= xs match{
    case Nil=> ys
    case x :: xs1 => ys match{
      case Nil => xs
      case y :: ys1 => if(x<y) x :: sort(xs1,ys)
        else y :: sort(xs,ys1)
    }
  }
}
//Merge Sort Faster Than Before
object mergeSort extends App{
  def msort(xs:List[Int]):List[Int]={
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
  merge(msort(fst),msort(snd))
  }
  }
  val list=List(2,4,3,1,6,9,5)
  println( msort(list))
}
  