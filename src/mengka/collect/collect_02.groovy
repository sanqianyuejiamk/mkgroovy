

/**
 *  collect�������������ϣ���ÿ��Ԫ�ض���Ч
 *
 * @author mengka.hyy
 *
 */


def aaList = ['����':21,'��˹':24,'����':23]

def aa = aaList.collect(){
	kk -> ++kk.value
}

println "$aa"


def bbList = aaList.collect(){
	kk -> ++kk.value;return kk
}


println "$aaList"

println "$bbList"


