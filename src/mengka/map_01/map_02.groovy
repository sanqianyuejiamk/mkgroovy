
def map=['name':'张三','age':14]

map.put('weight2',24222)

println "\n*****遍历方法一：****\n"

map.each{println it}


println "\n*****遍历方法二：****\n"

map.each{println "["+it.getKey()+","+it.getValue()+"]"}

println "\n*****遍历方法三：****\n"

map.each({
	key,value->println "["+key+","+value+"]"
	})