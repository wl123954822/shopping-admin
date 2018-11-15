package cn.tjmj.serviceshopping.Dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-27 10:38
 */

public class OrderAlDto implements Serializable{

    private int orderAId ;

    private int orderId;

    private String orderNumber;

    private int areaId;

    private BigDecimal payment;

    private String content;

    private String createDate;

    private int status;//0全部，1待付款，2待收货，3待评价，4待退货

    private String statusName;

    private int userId;

    private BigDecimal postage;

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

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }
}
