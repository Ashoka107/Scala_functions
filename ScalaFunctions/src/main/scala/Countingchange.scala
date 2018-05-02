

object Countingchange {
	def main(args:Array[String]){
		print(countChange(4,List(1,3)))
	}
	def countChange(money: Int, coins: List[Int]){
		def count(money: Int, coins: List[Int]) {
			println("money="+money+" coins="+coins)
			if(money == 0)
				println(1)
				else if(money < 0)
					println("money less than zero"+0)
					else if(coins.isEmpty && money>=1 )
						println("coins is empty")
						else{
							println("1st call ")
							println(count(money,coins.tail)+"at frst coins="+coins)
							println("2nd call ")
							println(coins+" "+coins.isEmpty)
							count(money - coins.head, coins)
						}
		}
		println("Hello")
		count(money, coins.sorted)
	}
}
