


def aa = 'baicai'

def mengka = {kk -> println "$kk$aa"}
mengka.call('hello ')

/**
 *  ��ǰ�涨���aaʹ�õ�ͬһ���洢��ַ��
 *                 ���Ահ����棬���õ�aa��ֵ�������µı����ֵ��qingcai��
 * 
 */
aa = 'qingcai'
mengka.call('hello ')


/**
 *  �����հ�������Ϊһ���������뷽��
 * 
 */
baicai(mengka)

def baicai(aaBibao){
	/**
	 *  def aa������������ڴ��ַ��������Ӱ��հ���aa��ֵ��mengka()�հ�����ȡ����Ȼ���ϵ�ֵ
	 * 
	 */
	def aa = 'daxigua'
	aaBibao.call('��ã�')
}


