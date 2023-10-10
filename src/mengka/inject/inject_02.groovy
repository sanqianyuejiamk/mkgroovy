


/**
 *  inject,上一次的结果，会作为下一个的参数，传给闭包：
 *
 *                             将实现具体过程，抽出来，成一个闭包
 *                             
 */

def aaList = [2,3,4,5]

def mengka = {
	kk,temp -> kk*temp
}


def aa = aaList.inject(1,mengka)

println "$aa"