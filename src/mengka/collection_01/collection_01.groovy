

def aaCloections=["aa","bb","cc"]

for(i=0;i<aaCloections.size();i++){
	println aaCloections[i]
}	


println "\n******aaCloections添加新的元素********\n"

//方法一：
aaCloections.add(1);
//方法二：
aaCloections<<"mengka"


for(i=0;i<aaCloections.size();i++){
	println aaCloections[i]
}

println "正数第5个："+aaCloections[5]

println "\n******aaCloections支持负索引********\n"

for(i=0;i<aaCloections.size();i++){
	println "倒数第${i}个："+aaCloections[0-i]
}

println "倒数第5个："+aaCloections[-5]

