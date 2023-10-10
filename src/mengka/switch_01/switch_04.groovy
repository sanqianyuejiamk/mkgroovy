package mengka.switch_01

/**
 * 枚举类型enum的使用
 * 
 * @author mengka
 *
 */
class switch_04 {

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
