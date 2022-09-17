package aop.practiceVai2;

import aop.practiceVai2.factory.ProxyFactory2;
import aop.practiceVai2.service.AuthService2;
import aop.practiceVai2.service.ProductService2;
import aop.practiceVai2.service.ProductServiceImp2;
import aop.practiceVai2.service.ProxyProductService2;

public class Main {
    public static void main(String[] args) {
        AuthService2.setAuthType("user");
        String product = "habi jabi";

        ProxyFactory2 proxyFactory2 =new ProxyFactory2(new ProductServiceImp2());

        proxyFactory2.addBeforAdvice(()->{if (!AuthService2.getAuthType().equals("admin")){throw new RuntimeException("Sorry you are not able to permission..");}});

        ProductService2 productService2 = (ProductService2) proxyFactory2.getProxy();
        productService2.saveProduct(product);
        System.out.println(productService2.getProductById(1));

    }
}
