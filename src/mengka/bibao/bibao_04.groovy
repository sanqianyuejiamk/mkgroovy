





def baicai(aaBibao){
	def aa = 'AAAAA'
	aaBibao.call('baicai')
}



/**
 * ����һ��
 * 
 *     �ڲ������棬����հ�������
 *     
 */
baicai(){kk -> println "welcome11 $kk"}

baicai {kk -> println "welcome22 $kk"}



/**
 * ��������
 * 
 *     ���հ���������Ϊһ���������뷽��
 * 
 */

def aa = 'hello '
def mengka = {kk -> println "$aa$kk"}
baicai mengka

