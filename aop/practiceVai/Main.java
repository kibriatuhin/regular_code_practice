package aop.practiceVai;

import aop.practiceVai.factory.ProxyFactory;
import aop.practiceVai.service.AuthService;
import aop.practiceVai.service.ProductService;
import aop.practiceVai.service.ProductServiceImpl;
import aop.practiceVai.service.ProxyProductService;
import designPattern.proxyPractice.advice.BeforeAdvice;

public class Main {
    public static void main(String[] args) {
        AuthService.setAuthType("admin");
        String product = "laptop :{name : 'HP' , model: 'G-450'}";
        ProxyFactory proxyFactory = new ProxyFactory(new ProductServiceImpl());
        proxyFactory.addBeforeAdvice(new BeforeAdvice() {
            @Override
            public void invokBefore() {

                if (!AuthService.getAuthType().equals("admin")){
                    throw new RuntimeException("sorry you dont have any permission");
                }

            }
        });

        proxyFactory.addAfterAdcive(()->{
            System.out.println("after save afterAdvice call");
        });
        ProductService productService = (ProductService) proxyFactory.getProxy();
        productService.saveProduct(product);
        System.out.println(productService.getProductById(1));

    }
}
