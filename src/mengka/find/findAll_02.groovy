


/**
 *  findAll ,返回符合条件的列表
 *
 * @author mengka.hyy
 *
 */

def values = ['张三':21,'李斯':24,'王五':23].findAll(){
	kk -> kk.value>21
}

values.each {
	println "< $it.key , $it.value >"
}