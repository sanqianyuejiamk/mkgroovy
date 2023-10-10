





def baicai(aaBibao){
	def aa = 'AAAAA'
	aaBibao.call('baicai')
}



/**
 * 方法一：
 * 
 *     在参数里面，定义闭包的内容
 *     
 */
baicai(){kk -> println "welcome11 $kk"}

baicai {kk -> println "welcome22 $kk"}



/**
 * 方法二：
 * 
 *     将闭包整个，作为一个参数传入方法
 * 
 */

def aa = 'hello '
def mengka = {kk -> println "$aa$kk"}
baicai mengka

