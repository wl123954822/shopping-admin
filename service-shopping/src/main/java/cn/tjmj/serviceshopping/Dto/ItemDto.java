package cn.tjmj.serviceshopping.Dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-28 17:14
 */

public class ItemDto implements Serializable{

    private int cartId;

    private int itemId;

    private String itemName;

    private BigDecimal itemPrice;

    private String itemImage;

    private int orderId;

    private long quantity;

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "cartId=" + cartId +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemImage='" + itemImage + '\'' +
                ", orderId=" + orderId +
                ", quantity=" + quantity +
                '}';
    }
}
