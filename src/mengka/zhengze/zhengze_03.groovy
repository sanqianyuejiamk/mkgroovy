package mengka.zhengze

import java.util.regex.Pattern
import java.util.regex.Matcher


/**
 *  ��taobao����ƷURL�л�ȡ��ƷID
 * 
 * @author mengka.hyy
 *
 */
class zhengze_03 {

	static main(args) {
	
		String itemUrl = "http://item.taobao.com/item.htm?spm=a2106.m872.1000384.d13.jH3ETc&id=16016943437&scm=1029.newlist-0.1.1101&ppath=20000%3A10752"
		
		def itemId = getItemByItemURL(itemUrl)
		
		println(itemId)
		
	}
	
	
	/**
	 *  ��taobao����ƷURL�л�ȡ��ƷID
	 * 
	 * @param itemUrl
	 * @return
	 */
	static def getItemByItemURL(def itemUrl){
		if(itemUrl==null){
			return null
		}
		
		Pattern pattern = Pattern
				.compile("[&|?]id=([0-9]+)&?");
		Matcher matcher = pattern.matcher(itemUrl);
	
		if (matcher.find()) {
			String auctionId = matcher.group(1);
			return auctionId?:""
		}
	}

}
