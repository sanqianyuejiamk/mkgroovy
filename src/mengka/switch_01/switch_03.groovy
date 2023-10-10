

def dateString = '20121230-14:06:01'


/**
 *  switch语句的使用③
 *  
 *       在switch语句中，使用正则表达式
 *
 */
switch(dateString){
	case ~'[0-9]{8}-[0-9]{2}:[0-9]{2}:[0-9]{2}':
	     println " baicai"
		 break
	case ~'[0-9]{8}':
	     println " qingcai"
		 break
	default:
	 	 println "不是日期"
		 break	 
}