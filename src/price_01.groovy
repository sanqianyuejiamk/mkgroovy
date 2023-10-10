import org.codehaus.groovy.classgen.ReturnAdder;


def price="100.02022"

//def price1=price/1
//
//def price2=(price*100)/1%100
//
//println price1
//
//println price2

double kk=price as double

int kaa=kk/1

int kbb=(kk*100)/1%100

println kaa

println kbb

println "getPrice1() = "+getPrice1(price)

println "getPrice2() = "+getPrice2(price)

println "getMyPrice() = "+getMyPrice(price)

/**
 * 得到规范的价格格式：
 *          "40.11"
 */
def getMyPrice(def price){
	if(null!=price){
		double kk=price as double
		int kkyuan=kk/1
		int kkxiaoshu=(kk*100)/1%100
		//当为0时变为“00”
		if(kkxiaoshu==0){
			String tempkbb='00'
			return kkyuan+"."+tempkbb
		}else{
		    if(kkxiaoshu<10){
				return kkyuan+".0"+kkxiaoshu
			}else{
				return kkyuan+"."+kkxiaoshu
			}
		}
	}
}

def getPrice1(def price){

	double kk=price as double

	int kaa=kk/1

	return kaa
}

//取价格的小数点后2位
def getPrice2(def price){

	double kk=price as double

	int kbb=(kk*100)/1%100

	if(kbb==0){
		String tempkbb='00'
		return tempkbb
	}

	return kbb
}