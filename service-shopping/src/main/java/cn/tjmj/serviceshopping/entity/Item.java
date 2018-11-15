package cn.tjmj.serviceshopping.entity;

import java.math.BigDecimal;

/**
 * 商品
 * @author wl
 *
 */
public class Item {
	
	private int id;
	
	private int cid;
	
	private String itemName;
	
	private String itemImage;
	
	private Long itemNum;
	
	private BigDecimal itemPrice;
	
	private String createDate;
	
	private String name;

	private String itemIntroduce;

	private String itemIntroduceImage;

    public String getItemIntroduce() {
        return itemIntroduce;
    }

    public void setItemIntroduce(String itemIntroduce) {
        this.itemIntroduce = itemIntroduce;
    }

    public String getItemIntroduceImage() {
        return itemIntroduceImage;
    }

    public void setItemIntroduceImage(String itemIntroduceImage) {
        this.itemIntroduceImage = itemIntroduceImage;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemImage() {
		return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public Long getItemNum() {
		return itemNum;
	}

	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}

	public BigDecimal getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	

}
