

/** * forѭ��03�� */
for(aa in [11,12,14,15]){   println "$aa"}
print "\n****groovy�е�forѭ������****\n\n"/** * forѭ��04�� *         ѭ������ӳ�� */def baicai = ['aa':11,'bb':22,'cc':33]def sum=0println  "$baicai"for(aaBaicai in baicai){   sum+=aaBaicai.value}println "sum = $sum"