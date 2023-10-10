package mengka.todate

import java.text.SimpleDateFormat
import java.util.Date

/**
 *  ���ڵĻ���ת��
 * 
 * @author mengka.hyy
 *
 */
class todate_01 {

	static main(args) {
		Date nowDate = new Date()
		
		//Date���String
		def dateStr = toDate(nowDate)
		println(dateStr)
		
		//String���Date
		def date = toDate(dateStr,"yyyy-MM-dd HH:mm")
		println(date)
	}
	
	/**
	 *  String���Date
	 * 
	 * @param sDate
	 * @param sFmt
	 * @return
	 */
	static def  toDate(String sDate, String sFmt) {
		if (sDate == null || sFmt == null) {
			return null;
		}
		SimpleDateFormat sdfFrom = null;
		java.util.Date dt = null;
		try {
			sdfFrom = new SimpleDateFormat(sFmt);
			dt = sdfFrom.parse(sDate);
		} catch (Exception ex) {
			return null;
		} finally {
			sdfFrom = null;
		}
		return dt;
	}
	
	/**
	 *  ��Dateת����String
	 * 
	 * @param date
	 * @return
	 */
	static def toDate(def date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm")
		return format.format(date)
	}
}
