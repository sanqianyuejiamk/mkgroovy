
/**
 *  findʹ�ã����ؼ����У����������ĵ�һ��ֵ
 *
 * @author mengka.hyy
 *
 */

def value = ['����':21,'��˹':24,'����':23].find(){
	kk -> kk.value>21
}

println "< ${value.key} , ${value.value} >"