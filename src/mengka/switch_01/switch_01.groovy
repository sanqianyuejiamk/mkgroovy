

println "请输入整数："

Scanner scanner=new Scanner(System.in);
def aaInput=scanner.nextInt();

/**
 *  switch语句的使用①
 *             
 */
switch(aaInput){
	case 0..59:
	    println "不及格"
		break
	case 60..79:
	    println	"良好"
		break
    case 80..100:
	    println	"优秀"
		break
	default:
	    break
}