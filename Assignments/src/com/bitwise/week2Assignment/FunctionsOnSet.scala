

package com.bitwise.week2Assignment
object FunctionsOnSet {
	def  main(args:Array[String]){
		println(contains(singletonSet(2),3))
		println("Its Union")
		val firstUnion = union(singletonSet(1), singletonSet(2)) 
		val secondUnion = union(firstUnion, singletonSet(3)) 
		val finalUnionSet = union(secondUnion, singletonSet(4)) 
		printSet(firstUnion) 

		println("Its Intersect")
		val firstIntersect = intersect(singletonSet(4), singletonSet(4)) 
		val secondIntersect = intersect(firstIntersect, singletonSet(4)) 
		val finalIntersect = intersect(secondIntersect, singletonSet(4)) 
		printSet(firstIntersect)

		println("Its Difference")
		val firstDiff = difference(singletonSet(1), singletonSet(1)) 
		val secondDifft = difference(firstDiff, singletonSet(3)) 
		val finalDiffSet = difference(secondDifft, singletonSet(3)) 
		printSet(finalDiffSet)

		println("Its Filter")
		val firstFilter = filter(singletonSet(1), singletonSet(1)) 
		val finalFilter =filter(firstFilter, singletonSet(3)) 
		printSet(firstFilter)
	}
	type Set=Int => Boolean
	def singletonSet(num:Int):Set={num2:Int=>num==num2}
	def contains(singletonset:Set,num:Int)=singletonset(num)
	def union(s:Set,t:Set):Set={num:Int=>contains(s,num)||contains(t,num)}

	def intersect(s:Set,t:Set):Set={num:Int=>contains(s,num)&&contains(t,num)}

	def difference(s:Set,t:Set):Set={num:Int=>contains(s,num)&& !contains(t,num)}

	def filter(s:Set,p:Int=>Boolean):Set={num:Int=>contains(s,num)&&contains(p,num)}



	val bound = 1000 
			def forall(s: Set, p: Int => Boolean): Boolean = { 
					def iter(a: Int): Boolean = { 
							if (a == bound) true 
							else if (s(a) && !p(a)) false 
							else iter(a+1) 
					} 
					iter(-bound) 
			} 
			def exists(s: Set, p: Int => Boolean): Boolean = { 
					def iter(a: Int): Boolean = { 
							if (a == bound) false 
							else if (s(a) && p(a)) true 
							else iter(a+1) 
					} 
					iter(-bound) 
			} 
			def map(s: Set, f: Int => Int): Set = i => exists(s, j => i == f(j)) 

					def toString(s: Set): String = { 
					val xs = for (i <- -bound to bound if contains(s, i)) yield i 
							xs.mkString("{", ",", "}") 
			} 
			def printSet(s: Set) { 
				println(toString(s)) 
			} 
} 
