


/**
 *  inject,��һ�εĽ��������Ϊ��һ���Ĳ����������հ���
 *
 *                             ��ʵ�־�����̣����������һ���հ�
 *                             
 */

def aaList = [2,3,4,5]

def mengka = {
	kk,temp -> kk*temp
}


def aa = aaList.inject(1,mengka)

println "$aa"