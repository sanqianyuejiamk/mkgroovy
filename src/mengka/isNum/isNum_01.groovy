import java.math.BigDecimal
import java.lang.String

import org.codehaus.groovy.classgen.ReturnAdder;

def kk="222.33"

//println isBlank(kk)
//
//println isNumeric(kk)

println getMyPrice(kk)

/**
* ����ַ����Ƿ��ǿհף�<code>null</code>�����ַ���<code>""</code>��ֻ�пհ��ַ���
* <pre>
* StringUtil.isBlank(null)      = true
* StringUtil.isBlank("")        = true
* StringUtil.isBlank(" ")       = true
* StringUtil.isBlank("bob")     = false
* StringUtil.isBlank("  bob  ") = false
* </pre>
*
* @param str Ҫ�����ַ���
*
* @return ���Ϊ�հ�, �򷵻�<code>true</code>
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
 * �õ��淶�ļ۸��ʽ��
 *          "40.11"
 */
def getMyPrice(def price){
	 if(price!=null&&price+""!=""&&isNumeric(price)){
			double kk=price as double
			int kkyuan=kk/1
			int kkxiaoshu=(kk*100)/1%100
			//��Ϊ0ʱ��Ϊ��00��
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

