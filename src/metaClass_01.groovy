


class metaClass_01 {

	static main(args) {
	
		def msg="testAAA"
		
		println msg.metaClass
		
//		String.metaClass.up={
//			delegate.toUpperCase()	
//		}
//		
//		println msg.up()	
		
		println "\n****判断属性、方法的存在****\n"
		
		if(msg.metaClass.hasProperty(msg,"name")){
			println "msg有属性name"
		}else{
		    println "msg没有属性name"
		}
		
		if(msg.metaClass.respondsTo(msg,"mengka")){
			println "msg有方法mengka()"
		}else{
		    println "msg没有方法mengka()"
		}
		
	}
	
	static def mengka(){
		return "方法mengka"
	}

}
