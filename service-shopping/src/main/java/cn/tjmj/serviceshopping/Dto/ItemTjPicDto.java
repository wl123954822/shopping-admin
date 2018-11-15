package cn.tjmj.serviceshopping.Dto;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-22 15:18
 */

public class ItemTjPicDto implements Serializable {

    private int cartId;

    private int itemId;

    private long quantity;

    private int orderId;

    private String createDate;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
