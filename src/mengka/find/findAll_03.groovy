

/**
 *  闭包作为方法的参数
 * 
 * @author mengka.hyy
 *
 */

def filter(aaList,aaBibao){
	return aaList.findAll(aaBibao)
}


def isEven = {kk -> return (kk%2==0)}
def isOdd = {kk -> return !isEven(kk)} 

def aaList = [11,13,14,15]


def aa  = filter(aaList, isEven)
println "$aa"


def bb = filter(aaList, isOdd)
println "$bb"

