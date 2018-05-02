object Hello_Workshit {
  //println("Welcome to the Scala worksheet")
  	def main(args:Array[String]){
		print(countChange(2,List(1,3)))
	}                                         //> main: (args: Array[String])Unit
	def countChange(money: Int, coins: List[Int]):Int={
			def count(money: Int, coins: List[Int]):Int= {
					if(money == 0)
						1
						else if(money < 0)
							0
							else if(coins.isEmpty && money>=1 )
								0
								else{
									println(count(money,coins.tail))
								  count(money - coins.head, coins)
									}
			}
			count(money, coins.sorted)
	}                                         //> countChange: (money: Int, coins: List[Int])Int
}