
def kk="testBBB������"

for(i=0;i<5;i++){
	println "${i}:${kk}"
}

print "\n****groovy�е�GString****\n\n"

def mengka(kk,bb=3){
   for(i in 0..<bb){
	   println "${i}:${kk}"
   }
}

mengka(kk,1)

print "\n**** bbû�и�ֵ��ʱ��Ĭ����3 ****\n"

mengka(kk)
