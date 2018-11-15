package cn.tjmj.serviceshopping.Dto;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2018-01-02 15:11
 */

public class OrderTj implements Serializable {

    private int orderNum;

    private int monthOrderNum;

    private int allPayment;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getMonthOrderNum() {
        return monthOrderNum;
    }

    public void setMonthOrderNum(int monthOrderNum) {
        this.monthOrderNum = monthOrderNum;
    }

    public int getAllPayment() {
        return allPayment;
    }

    public void setAllPayment(int allPayment) {
        this.allPayment = allPayment;
    }
}
