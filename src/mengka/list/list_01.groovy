package mengka.list

class list_01 {

	static main(args) {
	
		/**
		 *  groovy里面，list的表示
		 */
		def aaList = []
		
		aaList.add('aaa')
		aaList.add('bbb')
		aaList.add('ccc')
	
		for(def temp:aaList){
			println "$temp"
		}	
	}

}
