package cn.tjmj.serviceadmin.Enum;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-20 14:21
 */
public enum ResultEnum {
    PARAM_NULL(0,"入参为空"),
    SUCCESS(1,"成功"),
    ERROR(2,"失败"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
