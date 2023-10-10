
 	def urls1=["www.taobao.com","www.taobao.com"]
	  def urls2=["www.taobao.com","www.taobao.com"]
	  def urls3=["www.taobao.com","www.taobao.com"]
	  def urls4=["www.taobao.com","www.taobao.com"]
	  def urls5=["www.taobao.com","www.taobao.com"]

	  def httpURLs=[urls1,urls2,urls3,urls4,urls5]
	  
	  for(i=0;i<httpURLs.size();i++){
		  for(int j=0;j<2;j++){
			  def aaHttpPic=httpURLs[i].get(j)
			  httpURLs[i][j] = getHttpPic(aaHttpPic)
			  println httpURLs[i][j]
		  }
	  }
	  
	  /**
	  * 对href链接的处理
	  */
	 def getHttpPic(def tempUrl){
		 if(null!=tempUrl){
			 if(tempUrl.contains("http://")){
				 return tempUrl
			 }else{
				 def aatempUrl="http://"+tempUrl
				 return aatempUrl
			 }
		 }
	 }