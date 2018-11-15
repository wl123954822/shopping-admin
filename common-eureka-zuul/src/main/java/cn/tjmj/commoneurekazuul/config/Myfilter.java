package cn.tjmj.commoneurekazuul.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 过滤器
 *
 * @author wanglei
 * @create 2017-12-20 10:56
 */
@Component
public class Myfilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        //Object accessToken = request.

       // System.out.println(accessToken.toString());

       /* if (accessToken == null){
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);

            try {
                ctx.getResponse().getWriter().write("token 为空");
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }*/
        return null;
    }
}

/**
 *pre：路由之前
 *routing：路由之时
 *post： 路由之后
 *error：发送错误调用
 *filterOrder：过滤的顺序
 *shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
 *run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
 */
