package mengka.enum_01

class enum_01 {
	
	static enum Day{
		SUNDAY,MONDAY,TUESDAY,
		WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
	
	static main(args) {
	
		def d1=Day.SATURDAY
		
		switch(d1){
			
			case [Day.SATURDAY,Day.SUNDAY]:
			 println "周末AAA"
			 break
			 
			 case Day.MONDAY..Day.FRIDAY:
			 println "工作日	bbb"
			 break
			 
			 default:
			 println "日期无效范围"
		}
	}
}
