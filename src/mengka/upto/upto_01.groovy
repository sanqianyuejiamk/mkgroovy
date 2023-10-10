
/**
 *  upto循环递增的使用
 * 
 * @author mengka.hyy
 *
 */

def aa = 1

print "1+"

2.upto(10) {
	kk -> aa += kk
	if(kk<10){
		print "$kk+"
	}else{
		print "$kk = "
	}
}

println "$aa"





