package mengka.zhengze


/**
 *   
 *   taobao��ͼƬ��URL�У����Ϻ�׺"_450x10000.jpg"<br>
 *   ����ͼƬ����ʾ�Ĵ�С,��width��height��Ӱ����������ܣ�����һ�㲻������ô��
 * 
 */
class zhengze_02 {

	static main(args){
		
		String pic1 = "http://img02.taobaocdn.com/bao/uploaded/i2/12792019239972555/T1D8cUXhXXXXXXXXXX_!!0-item_pic.jpg"
		
		def aaPic = getTBPic(pic1)
		println(aaPic)
		
		
		String pic2 = "taobaocdn.com"
		
		def bbPic = getTBPic(pic2)
		println(bbPic)
	}
	
	static def getTBPic(def pic){
		if(pic==null){
			return ""
		}
		if(pic ==~ /.*\.taobaocdn.*/){
			return pic+"_450x10000.jpg"
		}
		return pic
	}
	
}
