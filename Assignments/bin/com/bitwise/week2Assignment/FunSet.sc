package com.bitwise.week2Assignment

object FunSet {
 def  main(args:Array[String]){
		println(contains(singletonSet(2),2))
		println(union(Set(2,1),Set(2)))
		println(intersect(singletonSet(4),singletonSet(5)))
		println(difference(singletonSet(6),singletonSet(7)))
	}                                         //> main: (args: Array[String])Unit
	type Set=Int => Boolean
			def singletonSet(num:Int):Set={num2:Int=>num==num2}
                                                  //> singletonSet: (num: Int)com.bitwise.week2Assignment.FunSet.Set
	def contains(singletonset:Set,num:Int):Boolean= singletonset(num)
                                                  //> contains: (singletonset: com.bitwise.week2Assignment.FunSet.Set, num: Int)Bo
                                                  //| olean

	def union(s:Set,t:Set):Set={num:Int=>contains(s,num)||contains(t,num)}
                                                  //> union: (s: com.bitwise.week2Assignment.FunSet.Set, t: com.bitwise.week2Assig
                                                  //| nment.FunSet.Set)com.bitwise.week2Assignment.FunSet.Set

	def intersect(s:Set,t:Set):Set={num:Int=>contains(s,num)&&contains(t,num)}
                                                  //> intersect: (s: com.bitwise.week2Assignment.FunSet.Set, t: com.bitwise.week2A
                                                  //| ssignment.FunSet.Set)com.bitwise.week2Assignment.FunSet.Set

	def difference(s:Set,t:Set):Set={num:Int=>contains(s,num)&& !contains(t,num)}
                                                  //> difference: (s: com.bitwise.week2Assignment.FunSet.Set, t: com.bitwise.week2
                                                  //| Assignment.FunSet.Set)com.bitwise.week2Assignment.FunSet.Set

	def filer(s:Set,p:Int=>Boolean):Set={num:Int=>contains(s,num)&&contains(p,num)}
                                                  //> filer: (s: com.bitwise.week2Assignment.FunSet.Set, p: Int => Boolean)com.bit
                                                  //| wise.week2Assignment.FunSet.Set
 
}