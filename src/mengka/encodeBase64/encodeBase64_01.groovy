package mengka.encodeBase64

class encodeBase64_01 {

	static main(args) {
	
		String aaString = "´ótest"
		
		String encodeStr = encodeBase64(aaString)
		
		println "$encodeStr"
	}

	def encodeBase64(String str) {
		return str.bytes.encodeBase64().toString()
	}
	
}
