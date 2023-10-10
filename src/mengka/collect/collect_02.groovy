

/**
 *  collect，遍历整个集合，对每个元素都生效
 *
 * @author mengka.hyy
 *
 */


def aaList = ['张三':21,'李斯':24,'王五':23]

def aa = aaList.collect(){
	kk -> ++kk.value
}

println "$aa"


def bbList = aaList.collect(){
	kk -> ++kk.value;return kk
}


println "$aaList"

println "$bbList"


