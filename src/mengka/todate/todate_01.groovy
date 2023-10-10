package mengka.todate

import java.text.SimpleDateFormat
import java.util.Date

/**
 *  日期的基本转化
 * 
 * @author mengka.hyy
 *
 */
class todate_01 {

	static main(args) {
		Date nowDate = new Date()
		
		//Date变成String
		def dateStr = toDate(nowDate)
		println(dateStr)
		
		//String变成Date
		def date = toDate(dateStr,"yyyy-MM-dd HH:mm")
		println(date)
	}
	
	/**
	 *  String变成Date
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
	 *  将Date转化成String
	 * 
	 * @param date
	 * @return
	 */
	static def toDate(def date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm")
		return format.format(date)
	}
}
