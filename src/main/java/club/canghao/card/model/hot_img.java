package club.canghao.card.model;

import java.util.List;

public class hot_img {
	private int id;
	private int hotId;
	private List<String> imgUrl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHotId() {
		return hotId;
	}
	public void setHotId(int hotId) {
		this.hotId = hotId;
	}
	public List<String> getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(List<String> imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Override
	public String toString() {
		return "hot_img [id=" + id + ", hotId=" + hotId + ", imgUrl=" + imgUrl + "]";
	}
}
