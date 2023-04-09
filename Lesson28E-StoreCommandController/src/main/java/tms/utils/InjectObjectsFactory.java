package tms.utils;
import lombok.experimental.UtilityClass;
import tms.model.Inject;
import tms.repository.JdbcCartRepository;
import tms.repository.JdbcOrderRepository;
import tms.repository.JdbcProductRepository;
import tms.repository.JdbcUserRepository;
import tms.repository.impl.JdbcCartRepositoryImpl;
import tms.repository.impl.JdbcOrderRepositoryImpl;
import tms.repository.impl.JdbcProductRepositoryImpl;
import tms.repository.impl.JdbcUserRepositoryImpl;
import tms.service.CartService;
import tms.service.OrderService;
import tms.service.ProductService;
import tms.service.UserService;
import tms.service.impl.CartServiceImpl;
import tms.service.impl.OrderServiceImpl;
import tms.service.impl.ProductServiceImpl;
import tms.service.impl.UserServiceImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@UtilityClass
public class InjectObjectsFactory {

    private static final Map<Class<?>, Object> CLASS_OBJECT_MAP = new ConcurrentHashMap<>();

    public static void createAndInjectInstances(Object controller) throws Exception {
        for (Field field : controller.getClass().getDeclaredFields()) {
            Inject fieldInject = field.getAnnotation(Inject.class);
            if (fieldInject != null) {
                Object service = putInstanceToMapIfAbsent(field.getType());
                Method injectMethod = getInjectMethod(controller, field.getType());
                injectMethod.invoke(controller, service);
                createAndInjectInstances(service);
            }
        }
    }

    private static Method getInjectMethod(Object controller, Class<?> type) {
        for (Method declaredMethod : controller.getClass().getDeclaredMethods()) {
            boolean allMatch = Arrays.stream(declaredMethod.getParameterTypes())
                    .allMatch(methodParameterTypeClass -> methodParameterTypeClass == type
                            && declaredMethod.getReturnType() == Void.TYPE
                            && declaredMethod.getName().startsWith("set"));
            if (allMatch) {
                return declaredMethod;
            }
        }
        throw new IllegalArgumentException("Can not find method with param " + type);
    }

    private static <T> Object putInstanceToMapIfAbsent(Class<T> serviceClass) {
        Object value = CLASS_OBJECT_MAP.get(serviceClass);
        if (value == null) {
            value = createInstance(serviceClass);
            CLASS_OBJECT_MAP.put(serviceClass, value);
        }
        return value;
    }

    private static <T> Object createInstance(Class<T> serviceClass) {
        if (CartService.class == serviceClass) {
            return new CartServiceImpl();
        } else if (JdbcCartRepository.class == serviceClass) {
            return new JdbcCartRepositoryImpl();
        } else if (OrderService.class == serviceClass) {
            return new OrderServiceImpl();
        } else if (JdbcOrderRepository.class == serviceClass) {
            return new JdbcOrderRepositoryImpl();
        } else if (ProductService.class == serviceClass) {
            return new ProductServiceImpl();
        } else if (JdbcProductRepository.class == serviceClass) {
            return new JdbcProductRepositoryImpl();
        } else if (UserService.class == serviceClass) {
            return new UserServiceImpl();
        } else if (JdbcUserRepository.class == serviceClass) {
            return new JdbcUserRepositoryImpl();
        }
        throw new IllegalArgumentException("Can not create instance of class " + serviceClass);
    }
}