package mengka.while_01

/**
 *  ����������,ֱ��aaInput<=0��ʱ�򣬽�������������
 * 
 * @author mengka.hyy
 *
 */
class while_01 {

	static main(args) {
	
		def sum = 0		
		
		println "����������,aaInput<=0��ʱ���ʾ������"
		
		Scanner scanner=new Scanner(System.in);
		def aaInput=scanner.nextInt();
		
		while(aaInput>0){
			sum+=aaInput
			
			aaInput=scanner.nextInt();
		}
		
		
		println "sum = $sum"
		
	}

}
