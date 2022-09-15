package designPattern.proxyPractice.service;

import designPattern.proxyPractice.advice.AfterAdvice;
import designPattern.proxyPractice.advice.BeforeAdvice;
import designPattern.proxyPractice.advice.OverAllAdvice;
import designPattern.proxyPractice.factory.ProxyFactory;

import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AuthService.setUserType("admin");
        String product = "laptop {name : 'HP' , model : 'G-450'}";

        OverAllAdvice overAllAdvice = new OverAllAdvice(new ProductServiceImpl());
        Class<?>[] impl =  {ProductService.class, Serializable.class};
       ProductService productService = (ProductService) Proxy.newProxyInstance(ProductService.class.getClassLoader(),impl,overAllAdvice);
       productService.saveProduct(product);
        System.out.println(productService.getProductById(1));
    }
}

/*  AuthService.setUserType("admin");
        String product = "laptop {name : 'HP' , model : 'G-450'}";
        ProxyFactory proxyFactory = new ProxyFactory(new ProductServiceImpl());
        proxyFactory.addBeforeAdvice(new BeforeAdvice() {
            @Override
            public void invokBefore() {
                if (!AuthService.getUserType().equals("admin")){
                    throw  new RuntimeException("Sorry you dont have any permission to save the product ");
                }

            }
        });
      // ekhon time execution dekhbo method ar -
        proxyFactory.addBeforeAdvice(new BeforeAdvice() {
            @Override
            public void invokBefore() {
                System.out.println("Method execution start time : " + LocalDateTime.now());
            }
        });

        // erpor amra after advice dei
        proxyFactory.addAfterAdvice(new AfterAdvice() {
            @Override
            public void invokeAfter() {
                System.out.println("Mehod executuin end time :: " + LocalDateTime.now());
            }
        });
        ProductService productService =  proxyFactory.getProxy();
        productService.saveProduct(product);
        System.out.println(productService.getProductById(1));*/

