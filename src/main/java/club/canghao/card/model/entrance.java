package club.canghao.card.model;

public class entrance {
	//ÃÅ½û¼ÇÂ¼
	private String stuNumber;
	private String entranceTime;
	private String entranceSite;
	//setter and getter
	public String getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	public String getEntranceTime() {
		return entranceTime;
	}
	public void setEntranceTime(String entranceTime) {
		this.entranceTime = entranceTime;
	}
	public String getEntranceSite() {
		return entranceSite;
	}
	public void setEntranceSite(String entranceSite) {
		this.entranceSite = entranceSite;
	}
	@Override
	public String toString() {
		return "entrance [stuNumber=" + stuNumber + ", entranceTime=" + entranceTime + ", entranceSite=" + entranceSite
				+ "]";
	}
}
