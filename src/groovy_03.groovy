

/**
 * GROOVY中三目运算符的使用
 * 
 * @author mengka
 *
 */
class groovy_03 {

	static main(args) {
	
		def name
		
		String kk=name?name:"不能为空"
		
		println kk
		
		println "******简化后的方法******"
		
		name ="testAAA"
		
		String kk2=name?:"不能为空"
		
		println kk2
		
	}

}
