package aop.practiceVai.factory;

import aop.practiceVai.service.ProductService;
import aop.practiceVai.service.ProxyProductService;
import designPattern.proxyPractice.advice.AfterAdvice;
import designPattern.proxyPractice.advice.BeforeAdvice;

import java.util.ArrayList;
import java.util.List;

public class ProxyFactory {
    private ProductService targetObject;
    private List<BeforeAdvice> beforeAdvices = new ArrayList<>();
    private List<AfterAdvice> afterAdvices = new ArrayList<>();





    public ProxyFactory(ProductService targetObject) {
        this.targetObject = targetObject;
    }


    public void addAfterAdcive(AfterAdvice afterAdvice){
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
    public Object getProxy(){
        return new ProxyProductService(this);
    }
}
