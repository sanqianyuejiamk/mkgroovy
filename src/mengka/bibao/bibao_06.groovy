

/**
 *  ��1�� �հ���Ϊ����ֵ
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
 *  ��2�� �հ���Ϊ����ֵ
 * 
 */

def bbmengka = {
	x -> return {kk -> return x*kk}
}

def qingcai = bbmengka(3)

println "${qingcai(5)}"

