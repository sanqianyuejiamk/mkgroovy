


/**
 *   自定义的方法
 * 
 * @param clos 将整个闭包作为参数
 * @param aaList
 * @return
 */
def mengka(clos,aaList){
	return aaList.collect(clos)
}


//例1：
def doubles = {kk -> 2*kk}

println "${mengka(doubles,[1,2,3,4])}"


//例2：
def triples = {kk -> 3*kk}

println "${mengka(triples,[1,2,3,4])}"


//例3：
def isBaicai = {kk -> (kk%2==0)}

println "${mengka(isBaicai,[1,2,3,4])}"


