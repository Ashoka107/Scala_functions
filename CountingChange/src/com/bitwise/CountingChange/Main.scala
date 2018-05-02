package com.bitwise.CountingChange

object Main {
	def main(args:Array[String]){
		print(countChange(4,List(1,2)))
	}
	def countChange(money: Int, coins: List[Int]):Int={
			def count(money: Int, coins: List[Int]): Int = {
					if(money == 0) 
						1
						else if(money < 0) 
							0
							else if(coins.isEmpty && money>=1 )
								0
								else{
									count(money,coins.tail) + count(money - coins.head, coins)
									}
			}
			count(money, coins.sorted)
	}
}