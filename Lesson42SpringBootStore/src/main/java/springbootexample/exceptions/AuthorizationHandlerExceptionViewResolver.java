package springbootexample.exceptions;

import static springbootexample.model.PagesPathEnum.ERROR_PAGE;
import static springbootexample.model.RequestParamsEnum.ERROR_PARAM;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.ui.ModelMap;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class AuthorizationHandlerExceptionViewResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if (handler instanceof HandlerMethod) {
            ErrorView errorView = ((HandlerMethod) handler).getMethodAnnotation(ErrorView.class);
            if (errorView != null) {
                String viewName = errorView.value();
                ModelMap modelMap = new ModelMap();
                modelMap.addAttribute(ERROR_PARAM.getValue(), ex.getMessage());

                ModelAndView model = new ModelAndView(viewName);
                model.setViewName(ERROR_PAGE.getPath());
                model.addAllObjects(modelMap);

                return model;
            }
        }

        //returning null for default processing
        return null;
    }
}
