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
			 println "��ĩAAA"
			 break
			 
			 case Day.MONDAY..Day.FRIDAY:
			 println "������	bbb"
			 break
			 
			 default:
			 println "������Ч��Χ"
		}
	}
}