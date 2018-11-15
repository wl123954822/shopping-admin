package cn.tjmj.serviceshopping.entity;

import java.math.BigDecimal;

/**
 * 购物车主表
 * @author wl
 *
 */
public class Cart {
	
	private int cartId;
	
	private int userId;
	
	private int cartState;//0未生成订单，1已经生成订单
	
	private String createDate;
	
	private int itemId;
	
	private String itemName;
	
	private BigDecimal itemPrice;
	
	private long quantity;
	
	private BigDecimal total;


	public BigDecimal getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCartState() {
		return cartState;
	}

	public void setCartState(int cartState) {
		this.cartState = cartState;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", cartState=" + cartState +
                ", createDate='" + createDate + '\'' +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
