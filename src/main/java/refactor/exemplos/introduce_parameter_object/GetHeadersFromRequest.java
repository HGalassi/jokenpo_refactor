package refactor.exemplos.introduce_parameter_object;

import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.ServletContext;

public class GetHeadersFromRequest {

    public void interceptor(RequestContext context){
        ServletContext servletContext = context.getWebApplicationContext().getServletContext();
        String token = servletContext.getAttribute("token").toString();
        String key = servletContext.getAttribute("key").toString();
        String user = servletContext.getAttribute("user").toString();
        String code = servletContext.getAttribute("code").toString();
        fazAlgumaCoisa(token,key,user,code);
    }

    private void fazAlgumaCoisa(String token, String key, String user, String code) {

    }
}
