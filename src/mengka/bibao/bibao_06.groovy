

/**
 *  例1： 闭包作为返回值
 * 
 * @param kk
 * @return
 */
def mengka(kk){
	return {x -> return kk*x}
}

def baicai = mengka(2)

println "${baicai(4)}"



/**
 * 
 *  例2： 闭包作为返回值
 * 
 */

def bbmengka = {
	x -> return {kk -> return x*kk}
}

def qingcai = bbmengka(3)

println "${qingcai(5)}"

