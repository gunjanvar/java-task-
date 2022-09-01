public class MobileModel {
	int eid,ePrice;
	String eName, eCompany, eModel;
	
	public MobileModel(int eid, int ePrice, String eName, String eCompany, String eModel) {
		this.eid = eid;
		this.ePrice = ePrice;
		this.eName = eName;
		this.eCompany = eCompany;
		this.eModel = eModel;
	}

	public int getePrice() {
		return ePrice;
	}

	public void setePrice(int ePrice) {
		this.ePrice = ePrice;
	}

	

}