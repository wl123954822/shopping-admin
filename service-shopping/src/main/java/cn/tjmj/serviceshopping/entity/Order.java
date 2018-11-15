package cn.tjmj.serviceshopping.entity;

import java.math.BigDecimal;

/**
 * 订单
 * 
 * @author wl
 *
 */
public class Order {
	//主表
	private int orderId;
	
	private int userId;

	private int areaId;//收获的地区id

	private BigDecimal payment;//支付总额
	
	private String createDate;
	
	private int status;// 0待付款，1待发货，2已发货，3已完成
	
	private BigDecimal postage;// 邮费
	
	private String content;// 卖家留言

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public BigDecimal getPayment() {
		return payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public BigDecimal getPostage() {
		return postage;
	}

	public void setPostage(BigDecimal postage) {
		this.postage = postage;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
