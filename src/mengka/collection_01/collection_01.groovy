

def aaCloections=["aa","bb","cc"]

for(i=0;i<aaCloections.size();i++){
	println aaCloections[i]
}	


println "\n******aaCloections����µ�Ԫ��********\n"

//����һ��
aaCloections.add(1);
//��������
aaCloections<<"mengka"


for(i=0;i<aaCloections.size();i++){
	println aaCloections[i]
}

println "������5����"+aaCloections[5]

println "\n******aaCloections֧�ָ�����********\n"

for(i=0;i<aaCloections.size();i++){
	println "������${i}����"+aaCloections[0-i]
}

println "������5����"+aaCloections[-5]

