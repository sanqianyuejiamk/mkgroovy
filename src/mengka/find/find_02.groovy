
/**
 *  find使用，返回集合中，符合条件的第一个值
 *
 * @author mengka.hyy
 *
 */

def value = ['张三':21,'李斯':24,'王五':23].find(){
	kk -> kk.value>21
}

println "< ${value.key} , ${value.value} >"