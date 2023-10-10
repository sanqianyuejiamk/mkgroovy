package mengka.date_01

import java.text.SimpleDateFormat
import groovy.json.JsonOutput

class toDate_01 {

	static main(args) {
		
		/**
		 *  Date变成String
		 */
		String aa = toDate(new Date())
		println(aa)
		
		
		/**
		 *  String变成Date
		 */
		def aaDate = toDate(aa, "yyyy-MM-dd HH:mm:dd")
		def rs=[:]
		rs.name = "mengka"
		rs.time = aaDate
		
		println(JsonOutput.toJson(rs))
	}

	def static  toDate(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd")
		return format.format(date)
	}
	
	def static java.util.Date toDate(String sDate, String sFmt) {
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
}
