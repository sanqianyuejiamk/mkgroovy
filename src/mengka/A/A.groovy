package mengka.A

class A {

	static main(args) {
	
		def pp1 = new Student()
		
		pp1.name="����"
		
		pp1.age=111
		
		//Ĭ�ϴ���get����
		println pp1.getName()
	
		
		//Ĭ�ϴ��й��췽��
		def pp2=new Student(['name':'����','age':24])
		
		println pp2
	}

}
