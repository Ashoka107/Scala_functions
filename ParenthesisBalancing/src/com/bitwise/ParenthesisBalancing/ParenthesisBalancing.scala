

package com.bitwise.ParenthesisBalancing

object ParenthesisBalancing {
	def main(args:Array[String]){
		print(balance("()".toList))
	}
	def balance(chars:List[Char]):Boolean={
			def isParenthesesBalanced(chars:List[Char],numberOfOpens:Int):Boolean={
					if(chars.isEmpty)
						numberOfOpens==0
						else if(chars.head=='(')
							isParenthesesBalanced(chars.tail,numberOfOpens+1)
							else if(chars.head==')')
								isParenthesesBalanced(chars.tail,numberOfOpens-1)
								else 
									isParenthesesBalanced(chars.tail,numberOfOpens)
			}
			isParenthesesBalanced(chars,0);
	}
}