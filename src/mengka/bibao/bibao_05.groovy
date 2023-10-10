


def mengka = {aaBibao,list->
	def result=[]
	for(temp in list){
		if(aaBibao(temp)){
			result<<temp
		}else{
			return result
		}
	}
}


def isEven = {kk -> return (kk%2==0)}
def isOdd = {kk -> return !isEven(kk)}


def aaList = [11,13,14,15]

/**
 *  11²»Âú×ã
 * 
 */
def aa = mengka.call(isEven,aaList)
println "$aa"


/**
 *  11¡¢13,14²»Âú×ã
 * 
 */
def bb = mengka.call(isOdd,aaList)
println "$bb"



