import java.math.BigDecimal
import java.lang.String

import org.codehaus.groovy.classgen.ReturnAdder;

def kk="222.33"

//println isBlank(kk)
//
//println isNumeric(kk)

println getMyPrice(kk)

/**
* 检查字符串是否是空白：<code>null</code>、空字符串<code>""</code>或只有空白字符。
* <pre>
* StringUtil.isBlank(null)      = true
* StringUtil.isBlank("")        = true
* StringUtil.isBlank(" ")       = true
* StringUtil.isBlank("bob")     = false
* StringUtil.isBlank("  bob  ") = false
* </pre>
*
* @param str 要检查的字符串
*
* @return 如果为空白, 则返回<code>true</code>
*/
def isBlank(String str) {
   int length;

   if ((str == null) || ((length = str.length()) == 0)) {
	   return true;
   }

   for (int i = 0; i < length; i++) {
	   if (!Character.isWhitespace(str.charAt(i))) {
		   return false;
	   }
   }

   return true;
}


def isNumeric(String str) {
	if (str == null) {
		return false;
	}
	int sz = str.length();
	for (int i = 0; i < sz; i++) {
		if (Character.isDigit(str.charAt(i)) == false) {
			return false;
		}
	}
	return true;
}

/**
 * 得到规范的价格格式：
 *          "40.11"
 */
def getMyPrice(def price){
	 if(price!=null&&price+""!=""&&isNumeric(price)){
			double kk=price as double
			int kkyuan=kk/1
			int kkxiaoshu=(kk*100)/1%100
			//当为0时变为“00”
			if(kkxiaoshu==0){
				String tempkbb='00'
				return kkyuan+"."+tempkbb
			}else{
				if(kkxiaoshu<10){
					return kkyuan+".0"+kkxiaoshu
				}else{
					return kkyuan+"."+kkxiaoshu
				}
			}
		
	}
}

