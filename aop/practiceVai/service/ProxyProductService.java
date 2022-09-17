package aop.practiceVai.service;

import aop.practiceVai.factory.ProxyFactory;
import designPattern.proxyPractice.advice.AfterAdvice;
import designPattern.proxyPractice.advice.BeforeAdvice;

import java.util.List;

public class ProxyProductService implements ProductService {
    private ProductService targetObject;
    private List<BeforeAdvice> beforeAdvices;
    private List<AfterAdvice> afterAdvices;

    public ProxyProductService(ProxyFactory targetObject) {
        this.targetObject = targetObject.getTargetObject();
        this.beforeAdvices = targetObject.getBeforeAdvices();
        this.afterAdvices = targetObject.getAfterAdvices();
    }

    @Override
    public String getProductById(int id) {
        return targetObject.getProductById(id);
    }

    @Override
    public void saveProduct(String product) {
        beforeAdvices.forEach(BeforeAdvice::invokBefore);
        targetObject.saveProduct(product);
        afterAdvices.forEach(AfterAdvice::invokeAfter);
    }
}
