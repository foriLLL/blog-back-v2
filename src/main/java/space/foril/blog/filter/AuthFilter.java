package space.foril.blog.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.HandlerInterceptor;
import space.foril.blog.entity.ResBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class AuthFilter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Boolean isLogin = (Boolean) request.getSession().getAttribute("isLogin");
        if (isLogin != null && isLogin) {
            // 验证成功
            return true;
        } else {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

            PrintWriter writer = response.getWriter();
            ResBody<Boolean> resBody = new ResBody<>(false, false, "未登录");
            ObjectMapper mapper = new ObjectMapper();

            writer.write(mapper.writeValueAsString(resBody));
            writer.flush();
            writer.close();

            return false;
        }
    }
}
