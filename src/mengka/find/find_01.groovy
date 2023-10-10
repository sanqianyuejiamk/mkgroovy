
/**
 *  find使用，返回集合中，符合条件的第一个值
 * 
 * @author mengka.hyy
 *
 */

def value = [1,23,6,7].find(){
	kk -> kk>6
}

println "$value"