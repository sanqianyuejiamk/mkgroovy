
/**
 *  any,至少有一个元素，满足判断条件
 * 
 * @author mengka.hyy
 *
 */

def aa = [12,3,14,2].any(){
	kk -> kk>12
}

println "$aa"




def bb = ['张三':21,'李斯':24,'王五':23].any(){
	kk -> kk.value>30
}

println "$bb"