

def dateString = '20121230-14:06:01'


/**
 *  switch����ʹ�â�
 *  
 *       ��switch����У�ʹ��������ʽ
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
	 	 println "��������"
		 break	 
}