package mengka.for_02


/**
 *  ������FeedDO��������ԣ�wenming
 * 
 * @author Administrator
 *
 */

def feedDO = new FeedDO()

feedDO.id=21
feedDO.name='mengka'
feedDO.data.put("aa","��test")
feedDO.data.put("bb","test...BBB")

def mengka=[:]
feedDO.properties.keySet().each(){
	println(it)
	if("data".equals(it)){
		feedDO.properties.data.keySet().each{ kk ->
			mengka.put(kk,feedDO.properties.data.get(kk))
		}
	}
}


println("data = "+mengka)
println("data['aa'] = "+mengka.get('aa'))
