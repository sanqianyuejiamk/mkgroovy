
/**
 *  any,������һ��Ԫ�أ������ж�����
 * 
 * @author mengka.hyy
 *
 */

def aa = [12,3,14,2].any(){
	kk -> kk>12
}

println "$aa"




def bb = ['����':21,'��˹':24,'����':23].any(){
	kk -> kk.value>30
}

println "$bb"