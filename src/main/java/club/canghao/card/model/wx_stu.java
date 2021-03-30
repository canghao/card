package club.canghao.card.model;

public class wx_stu {
	//微信用户和学生信息的绑定
	private String openId;
	private String stuNumber;
	//setter and getter
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	@Override
	public String toString() {
		return "wx_stu [openId=" + openId + ", stuNumber=" + stuNumber + "]";
	}
}
