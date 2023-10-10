

/**
 *  collect，遍历整个集合，对每个元素都生效
 * 
 * @author mengka.hyy
 *
 */

def aa = [1,2,3,4,5].collect{
	kk -> return kk*kk
}

println "$aa"

