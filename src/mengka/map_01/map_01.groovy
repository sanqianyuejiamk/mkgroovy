
def map=['name':'张三','age':14]


//添加

//方法一
map=map+['weight1':25111]

//方法二
map.put('weight2',24222)

//方法三
map.weight3=23333


println "\n****打印map中的数据****\n"

println map.weight1

println map['weight3']

println "法三："+map.get('weight3')
