package designPattern.proxyPractice.factory;

import designPattern.proxyPractice.advice.AfterAdvice;
import designPattern.proxyPractice.advice.BeforeAdvice;
import designPattern.proxyPractice.service.ProductService;
import designPattern.proxyPractice.service.ProxyProductService;

import java.util.ArrayList;
import java.util.List;

public class ProxyFactory {
    private ProductService targetObject;
    private List<BeforeAdvice> beforeAdvices = new ArrayList<>();

    public List<BeforeAdvice> getBeforeAdvices() {
        return beforeAdvices;
    }

    public void setBeforeAdvices(List<BeforeAdvice> beforeAdvices) {
        this.beforeAdvices = beforeAdvices;
    }

    public List<AfterAdvice> getAfterAdvices() {
        return afterAdvices;
    }

    public void setAfterAdvices(List<AfterAdvice> afterAdvices) {
        this.afterAdvices = afterAdvices;
    }

    private List<AfterAdvice> afterAdvices = new ArrayList<>();

    public ProxyFactory(ProductService targetObject) {
        this.targetObject = targetObject;
    }

    public void addAfterAdvice(AfterAdvice afterAdvice){
      this.afterAdvices.add(afterAdvice);
    }
    public void addBeforeAdvice(BeforeAdvice beforeAdvice){
        this.beforeAdvices.add(beforeAdvice);
    }

    public ProductService getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(ProductService targetObject) {
        this.targetObject = targetObject;
    }
    public ProductService getProxy(){
        return new ProxyProductService(this);
    }
}
