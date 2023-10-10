

/**
 * every,集合的所有元素，都要满足条件才行
 *  
 * @author mengka.hyy
 *
 */

def aa = [12,13,14,21].every(){
	kk -> kk>11
}

println "$aa"