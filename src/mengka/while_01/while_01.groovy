package mengka.while_01

/**
 *  请输入整数,直到aaInput<=0的时候，将所有数相加求和
 * 
 * @author mengka.hyy
 *
 */
class while_01 {

	static main(args) {
	
		def sum = 0		
		
		println "请输入整数,aaInput<=0的时候表示结束："
		
		Scanner scanner=new Scanner(System.in);
		def aaInput=scanner.nextInt();
		
		while(aaInput>0){
			sum+=aaInput
			
			aaInput=scanner.nextInt();
		}
		
		
		println "sum = $sum"
		
	}

}
