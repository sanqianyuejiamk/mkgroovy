
def map=['name':'����','age':14]

map.put('weight2',24222)

println "\n*****��������һ��****\n"

map.each{println it}


println "\n*****������������****\n"

map.each{println "["+it.getKey()+","+it.getValue()+"]"}

println "\n*****������������****\n"

map.each({
	key,value->println "["+key+","+value+"]"
	})