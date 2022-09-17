package aop.practiceVai2.service;

import aop.practiceVai2.advice.AfterAdvice;
import aop.practiceVai2.advice.BeforeAdvice;
import aop.practiceVai2.factory.ProxyFactory2;

import java.util.ArrayList;
import java.util.List;

public class ProxyProductService2 implements ProductService2  {
    private ProductService2 targetObject;
    private List<AfterAdvice> afterAdvices ;
    private List<BeforeAdvice> beforeAdvices ;


    public ProxyProductService2(ProxyFactory2 proxyFactory2) {
        this.targetObject = proxyFactory2.getTargetObject();
        this.afterAdvices = proxyFactory2.getAfterAdvices();
        this.beforeAdvices = proxyFactory2.getBeforeAdvices();
    }


    @Override
    public String getProductById(int id) {
        return targetObject.getProductById(id);
    }

    @Override
    public void saveProduct(String product) {

        beforeAdvices.forEach(BeforeAdvice::invokeBefore);
        targetObject.saveProduct(product);
        afterAdvices.forEach(AfterAdvice::invokeAfter);
    }
}
