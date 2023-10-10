

/**
 *   参数个数可变的函数
 *  
 * @author mengka
 *
 */
class groovy_02 {

	static main(args) {

    
		println sum(11,1,3)
		
		println sum(11,4)
		
		println sum(15)
	}

	static int sum(int... kk){
		def count=0

		for(i in kk){
			count+=i
		}

		return count
	}
}
