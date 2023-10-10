package mengka.json_02


import groovy.json.JsonOutput

/**
 *  object×ª±ä³Éjson´®
 * 
 * @author mengka.hyy
 *
 */
class object2json_02 {

	static main(args) {
		def tags=[:]
		tags.baicai="111"
		tags.qingcai="222"
		String aa = JsonOutput.toJson(tags)
		
		println(aa)
	}

}
