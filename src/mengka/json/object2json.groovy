package mengka.json

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper


/**
 *  ��������json��
 * 
 * @author mengka.hyy
 *
 */
class object2json {

	static main(args){
		
		def feedDO = new FeedDO()
		
		feedDO.id=21
		feedDO.name='mengka'
		feedDO.data.put("aa","��test")
		feedDO.data.put("bb","test...BBB")
		
		
		def json = new JsonBuilder(feedDO)
		println(json)
		
	}
	
}
