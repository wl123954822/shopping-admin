package cn.tjmj.serviceadmin.Vo;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-20 14:05
 */

public class ResultVo<T> {

    /** 状态**/
    private String status;

    /**提示信息**/
    private String msg;

    /**具体内容 **/
    private T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
