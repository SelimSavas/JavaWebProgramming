
public class firstTestBean {
	
	private firstTest firsttest = new firstTest();
	
	public void goster() {
		System.out.println(firsttest.getAd());
		System.out.println(firsttest.getSoyad());
		System.out.println(firsttest.getYas());
	}
		
	public firstTest getfirstTest() {
		return firsttest;
	}
	
	public void setfirstTest(firstTest firsttest) {
		this.firsttest = firsttest;
	}

}
