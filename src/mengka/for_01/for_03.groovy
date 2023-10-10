

/** * for循环03： */
for(aa in [11,12,14,15]){   println "$aa"}
print "\n****groovy中的for循环处理****\n\n"/** * for循环04： *         循环处理映射 */def baicai = ['aa':11,'bb':22,'cc':33]def sum=0println  "$baicai"for(aaBaicai in baicai){   sum+=aaBaicai.value}println "sum = $sum"