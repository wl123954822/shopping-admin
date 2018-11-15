package cn.tjmj.serviceadmin.util;

import cn.tjmj.serviceadmin.Enum.ResultEnum;
import cn.tjmj.serviceadmin.Vo.ResultVo;

/**
 * http请求返回
 *
 * @author wanglei
 * @create 2017-12-20 14:08
 */

public class ResultUtil {

    public static ResultVo success(Object object,String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setMsg(msg);
        resultVo.setStatus("success");
        resultVo.setData(object);

        return resultVo;
    }

    public static ResultVo success(String msg){
        return success(null,msg);
    }

    public static ResultVo error(String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setStatus("error");
        resultVo.setMsg(msg);

        return resultVo;
    }

}
