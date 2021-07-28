package refactor.exemplos.introduce_parameter_object;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.ServletContext;

public class GetHeadersFromRequestRefactor {

    public void interceptor(RequestContext context){
        ServletContext servletContext = context.getWebApplicationContext().getServletContext();

        ImmutableMap<String, String> atributesFromContext = ImmutableMap.<String, String>builder()
                .put("token", servletContext.getAttribute("token").toString())
                .put("key", servletContext.getAttribute("key").toString())
                .put("user", servletContext.getAttribute("user").toString())
                .put("code", servletContext.getAttribute("code").toString())
                .build();

        fazAlgumaCoisa(atributesFromContext);
    }

    private void fazAlgumaCoisa(ImmutableMap<String, String> atributesFromContext) {
    }
}

