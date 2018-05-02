package com.bitwise.week2Assignment

object FunSet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(269); 
 def  main(args:Array[String]){
		println(contains(singletonSet(2),2))
		println(union(Set(2,1),Set(2)))
		println(intersect(singletonSet(4),singletonSet(5)))
		println(difference(singletonSet(6),singletonSet(7)))
	}
	type Set=Int => Boolean;System.out.println("""main: (args: Array[String])Unit""");$skip(80); 
			def singletonSet(num:Int):Set={num2:Int=>num==num2};System.out.println("""singletonSet: (num: Int)com.bitwise.week2Assignment.FunSet.Set""");$skip(67); 
	def contains(singletonset:Set,num:Int):Boolean= singletonset(num);System.out.println("""contains: (singletonset: com.bitwise.week2Assignment.FunSet.Set, num: Int)Boolean""");$skip(73); 

	def union(s:Set,t:Set):Set={num:Int=>contains(s,num)||contains(t,num)};System.out.println("""union: (s: com.bitwise.week2Assignment.FunSet.Set, t: com.bitwise.week2Assignment.FunSet.Set)com.bitwise.week2Assignment.FunSet.Set""");$skip(77); 

	def intersect(s:Set,t:Set):Set={num:Int=>contains(s,num)&&contains(t,num)};System.out.println("""intersect: (s: com.bitwise.week2Assignment.FunSet.Set, t: com.bitwise.week2Assignment.FunSet.Set)com.bitwise.week2Assignment.FunSet.Set""");$skip(80); 

	def difference(s:Set,t:Set):Set={num:Int=>contains(s,num)&& !contains(t,num)};System.out.println("""difference: (s: com.bitwise.week2Assignment.FunSet.Set, t: com.bitwise.week2Assignment.FunSet.Set)com.bitwise.week2Assignment.FunSet.Set""");$skip(82); 

	def filer(s:Set,p:Int=>Boolean):Set={num:Int=>contains(s,num)&&contains(p,num)};System.out.println("""filer: (s: com.bitwise.week2Assignment.FunSet.Set, p: Int => Boolean)com.bitwise.week2Assignment.FunSet.Set""")}
 
}
