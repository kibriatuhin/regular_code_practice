package designPattern.proxyPractice.service;

import designPattern.proxyPractice.advice.AfterAdvice;
import designPattern.proxyPractice.advice.BeforeAdvice;
import designPattern.proxyPractice.factory.ProxyFactory;

import java.util.List;

public class ProxyProductService implements ProductService{
   private ProductService targetObject;
   private List<BeforeAdvice> beforeAdvices;
   private List<AfterAdvice> afterAdvices;

    public ProxyProductService(ProxyFactory targetObject) {
        this.targetObject = targetObject.getTargetObject();
        this.afterAdvices = targetObject.getAfterAdvices();
        this.beforeAdvices = targetObject.getBeforeAdvices();
    }

    @Override
    public String getProductById(int pid) {
        return targetObject.getProductById(pid);
    }

    @Override
    public void saveProduct(String product) {
        /*if (!AuthService.getUserType().equals("admin"))
            throw new RuntimeException("Sorry you dont have any permission to save the product ");*/
        beforeAdvices.forEach(BeforeAdvice::invokBefore);
        targetObject.saveProduct(product);
        afterAdvices.forEach(AfterAdvice::invokeAfter);
    }
}
