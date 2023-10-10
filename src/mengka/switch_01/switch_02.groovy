
println "请输入整数："

Scanner scanner=new Scanner(System.in);
def aaInput=scanner.nextInt();

/**
 *  switch语句的使用②
 *
 */
switch(aaInput){
	case [1,2,3,4,5]:
	      println "工作日"
		  break
	case [6,7]:
	     println "周末"
		 break
	default:
	     println "世界末日"
		 break
}
