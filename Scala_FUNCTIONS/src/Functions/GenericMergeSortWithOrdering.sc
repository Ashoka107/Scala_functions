package Functions

object GenericMergeSortWithOrdering {
 def mSort[T](xs:List[T])(ord:Ordering[T]):List[T]={
    val n=xs.length/2
    if(n==0)xs
    else {
      def merge(xs:List[T],ys:List[T]):List[T]=(xs,ys) match{
        case (Nil,ys)=> ys
        case (xs,Nil)=> xs
        case (x::xs1,y::ys1)=>if(ord.lt(x,y))x::merge(xs1,ys)
        else y::merge(xs,ys1)
      }
      val (fst,snd)=xs splitAt(n)
      merge(mSort(fst)(ord),mSort(snd)(ord))
    }
  }                                               //> mSort: [T](xs: List[T])(ord: Ordering[T])List[T]
  Console println mSort(List(3,4,7,2,6,1,5))(Ordering.Int)
                                                  //> List(1, 2, 3, 4, 5, 6, 7)
   Console println mSort(List("a","b","d","a","f","k","c"))(Ordering.String)
                                                  //> List(a, a, b, c, d, f, k)
}

//GenericMergeSortWithOrderingWithImplicit
object GenericMergeSortWithOrderingWithImplicit {
 def mSort[T](xs:List[T])(implicit ord:Ordering[T]):List[T]={
    val n=xs.length/2
    if(n==0)xs
    else {
      def merge(xs:List[T],ys:List[T]):List[T]=(xs,ys) match{
        case (Nil,ys)=> ys
        case (xs,Nil)=> xs
        case (x::xs1,y::ys1)=>if(ord.lt(x,y))x::merge(xs1,ys)
        else y::merge(xs,ys1)
      }
      val (fst,snd)=xs splitAt(n)
      merge(mSort(fst),mSort(snd))
    }
  }
  Console println mSort(List(3,4,7,2,6,1,5))
   Console println mSort(List("a","b","d","a","f","k","c"))
}