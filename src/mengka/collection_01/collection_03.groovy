

def aaCloections=["aa","bb","cc","dd"]

for(i=0;i<aaCloections.size();i++){
	println aaCloections[i]
}

println "\n******aaCloections集合之间的操作********\n"

aaCloections=aaCloections-aaCloections[0..2]

println aaCloections[0]

println aaCloections[-1]
