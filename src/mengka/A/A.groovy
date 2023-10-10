package mengka.A

class A {

	static main(args) {
	
		def pp1 = new Student()
		
		pp1.name="张三"
		
		pp1.age=111
		
		//默认带有get方法
		println pp1.getName()
	
		
		//默认带有构造方法
		def pp2=new Student(['name':'李四','age':24])
		
		println pp2
	}

}
