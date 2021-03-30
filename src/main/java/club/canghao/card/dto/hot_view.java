package club.canghao.card.dto;
import java.util.List;
import java.util.Map;

import club.canghao.card.model.hot;
import club.canghao.card.model.hot_like;
import club.canghao.card.model.hot_review;
public class hot_view extends hot{
	//热点查询模型
	@SuppressWarnings("rawtypes")
	private List<Map> imgs;
	private List<hot_review> reviews;
	private List<hot_like> likes;
	//setter and getter
	@SuppressWarnings("rawtypes")
	public List<Map> getImgs() {
		return imgs;
	}
	public void setImgs(@SuppressWarnings("rawtypes") List<Map> imgs) {
		this.imgs = imgs;
	}
	public List<hot_review> getReviews() {
		return reviews;
	}
	public void setReviews(List<hot_review> reviews) {
		this.reviews = reviews;
	}
	public List<hot_like> getLikes() {
		return likes;
	}
	public void setLikes(List<hot_like> likes) {
		this.likes = likes;
	}
	@Override
	public String toString() {
		return "hot_view [imgs=" + imgs + ", reviews=" + reviews + ", likes=" + likes + "]";
	}
}
