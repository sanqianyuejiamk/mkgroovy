package mengka.json_02


import groovy.json.JsonOutput

/**
 *  objectת���json��
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
