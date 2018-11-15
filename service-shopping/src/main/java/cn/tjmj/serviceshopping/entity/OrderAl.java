package cn.tjmj.serviceshopping.entity;

import java.math.BigDecimal;

public class OrderAl {

    private int orderAId ;

    private int orderId;

    private String orderNumber;

    private int areaId;

    private BigDecimal payment;

    private String content;

    private String createDate;

    private int status;//0全部，1待付款，2待收货，3待评价，4待退货

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getOrderAId() {
        return orderAId;
    }

    public void setOrderAId(int orderAId) {
        this.orderAId = orderAId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
