package gzu.pojo;

/**
 * 订单评论好评表对应实体类
 */
import java.util.Date;

public class OrderComment {
	private String id;
	private String orderId;
	/**
	 * 评论内容
	 */
	private String comment;
	/**
	 * 好评分数
	 */
	private int goodScore;
	/**
	 * 提交时间
	 */
	private Date time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getGoodScore() {
		return goodScore;
	}

	public void setGoodScore(int goodScore) {
		this.goodScore = goodScore;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "OrderComment [id=" + id + ", orderId=" + orderId + ", comment="
				+ comment + ", goodScore=" + goodScore + ", time=" + time + "]";
	}

}
