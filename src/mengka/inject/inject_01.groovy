

/**
 *  inject,上一次的结果，会作为下一个的参数，传给闭包 
 *   
 *                              (((1*2)*3)*4)*5 = 120
 * 
 */
def aa = [2,3,4,5].inject(1) {
	kk,temp -> kk*temp
}

println "$aa"

