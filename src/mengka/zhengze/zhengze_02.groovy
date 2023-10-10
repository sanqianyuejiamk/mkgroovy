package mengka.zhengze


/**
 *   
 *   taobao的图片的URL中，加上后缀"_450x10000.jpg"<br>
 *   控制图片的显示的大小,加width和height会影响浏览器性能，所以一般不建议这么做
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
