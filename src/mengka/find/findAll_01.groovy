

/**
 *  findAll ,���ط����������б�
 * 
 * @author mengka.hyy
 *
 */

def values=[1,2,3,5,7,8].findAll(){
	kk -> kk>5
}

values.each {
	println it
}