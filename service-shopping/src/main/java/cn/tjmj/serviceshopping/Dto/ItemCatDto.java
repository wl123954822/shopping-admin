package cn.tjmj.serviceshopping.Dto;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-23 16:05
 */

public class ItemCatDto {

    private int id;

    private int childId;

    private String name;

    private int status;

    private int itemNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }
}
