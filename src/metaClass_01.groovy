


class metaClass_01 {

	static main(args) {
	
		def msg="testAAA"
		
		println msg.metaClass
		
//		String.metaClass.up={
//			delegate.toUpperCase()	
//		}
//		
//		println msg.up()	
		
		println "\n****�ж����ԡ������Ĵ���****\n"
		
		if(msg.metaClass.hasProperty(msg,"name")){
			println "msg������name"
		}else{
		    println "msgû������name"
		}
		
		if(msg.metaClass.respondsTo(msg,"mengka")){
			println "msg�з���mengka()"
		}else{
		    println "msgû�з���mengka()"
		}
		
	}
	
	static def mengka(){
		return "����mengka"
	}

}
