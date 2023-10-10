package mengka.json

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

/**
 *  groovy���棬��json�����һ��object�ķ���
 * 
 * @author mengka.hyy
 *
 */
class json2object {

	static main(args) {
	
		def obj = new JsonSlurper()
		
		def result = obj.parseText('{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}')
	   
		println(result.person.name)
		
		result.person.pets.each { kk ->
			println(kk)
		}
	}

}
