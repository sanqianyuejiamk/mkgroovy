


def aa = 'baicai'

def mengka = {kk -> println "$kk$aa"}
mengka.call('hello ')

/**
 *  和前面定义的aa使用的同一个存储地址，
 *                 所以闭包里面，调用的aa的值会是最新的保存的值‘qingcai’
 * 
 */
aa = 'qingcai'
mengka.call('hello ')


/**
 *  整个闭包可以作为一个参数传入方法
 * 
 */
baicai(mengka)

def baicai(aaBibao){
	/**
	 *  def aa，重新申请的内存地址，并不会影响闭包的aa的值，mengka()闭包里面取的依然是老的值
	 * 
	 */
	def aa = 'daxigua'
	aaBibao.call('你好！')
}


