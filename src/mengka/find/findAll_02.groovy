


/**
 *  findAll ,���ط����������б�
 *
 * @author mengka.hyy
 *
 */

def values = ['����':21,'��˹':24,'����':23].findAll(){
	kk -> kk.value>21
}

values.each {
	println "< $it.key , $it.value >"
}