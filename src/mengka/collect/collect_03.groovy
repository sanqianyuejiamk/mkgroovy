


/**
 *   �Զ���ķ���
 * 
 * @param clos �������հ���Ϊ����
 * @param aaList
 * @return
 */
def mengka(clos,aaList){
	return aaList.collect(clos)
}


//��1��
def doubles = {kk -> 2*kk}

println "${mengka(doubles,[1,2,3,4])}"


//��2��
def triples = {kk -> 3*kk}

println "${mengka(triples,[1,2,3,4])}"


//��3��
def isBaicai = {kk -> (kk%2==0)}

println "${mengka(isBaicai,[1,2,3,4])}"


