

/**
 *  inject,��һ�εĽ��������Ϊ��һ���Ĳ����������հ� 
 *   
 *                              (((1*2)*3)*4)*5 = 120
 * 
 */
def aa = [2,3,4,5].inject(1) {
	kk,temp -> kk*temp
}

println "$aa"

