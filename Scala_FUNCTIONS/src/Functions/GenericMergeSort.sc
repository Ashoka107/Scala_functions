package Functions

object GenericMergeSort {
 def mSort[T](xs:List[T])(lt:(T,T)=>Boolean):List[T]={
    val n=xs.length/2
    if(n==0)xs
    else {
      def merge(xs:List[T],ys:List[T]):List[T]=(xs,ys) match{
        case (Nil,ys)=> ys
        case (xs,Nil)=> xs
        case (x::xs1,y::ys1)=>if(lt(x,y))x::merge(xs1,ys)
        else y::merge(xs,ys1)
      }
      val (fst,snd)=xs splitAt(n)
      merge(mSort(fst)(lt),mSort(snd)(lt))
    }
  }                                               //> mSort: [T](xs: List[T])(lt: (T, T) => Boolean)List[T]
  Console println mSort(List(3,4,7,2,6,1,5))((x:Int,y:Int)=> x<y)
                                                  //> List(1, 2, 3, 4, 5, 6, 7)
   Console println mSort(List("a","b","d","a","f","k","c"))((x:String,y:String)=> x.compareTo(y)<0)
                                                  //> List(a, a, b, c, d, f, k)
}
