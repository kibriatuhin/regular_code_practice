package designPattern.proxyPractice.advice;

import designPattern.proxyPractice.service.AuthService;
import designPattern.proxyPractice.service.ProductService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OverAllAdvice implements InvocationHandler {
    private ProductService targetObject;

    public OverAllAdvice(ProductService targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long l = System.currentTimeMillis();
        if (method.getName().equals("saveProduct"))// ekhane saveProduct holo pointcut okey ?
        {
            if (!AuthService.getUserType().equals("admin")){
                throw  new RuntimeException("Sorry you dont have any permission to save the product ");
            }
            targetObject.saveProduct((String) args[0]);
        } else if (method.getName().equals("getProductById")) {
            return targetObject.getProductById((Integer)args[0]);
        }
        System.out.println(" execution time : "+ (System.currentTimeMillis()-l) + " ");
        return null;
    }
}
