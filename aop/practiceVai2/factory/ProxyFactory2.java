package aop.practiceVai2.factory;

import aop.practiceVai2.advice.AfterAdvice;
import aop.practiceVai2.advice.BeforeAdvice;
import aop.practiceVai2.service.ProductService2;
import aop.practiceVai2.service.ProxyProductService2;

import java.util.ArrayList;
import java.util.List;

public class ProxyFactory2 {
    private ProductService2 targetObject;
    private List<AfterAdvice> afterAdvices = new ArrayList<>();
    private List<BeforeAdvice> beforeAdvices = new ArrayList<>();

    public ProxyFactory2(ProductService2 targetObject) {
        this.targetObject = targetObject;
    }

    public void addAfterAdvice(AfterAdvice afterAdvice){
        this.afterAdvices.add(afterAdvice);
    }
    public void addBeforAdvice(BeforeAdvice beforeAdvice){
        this.beforeAdvices.add(beforeAdvice);
    }

    public ProductService2 getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(ProductService2 targetObject) {
        this.targetObject = targetObject;
    }

    public List<AfterAdvice> getAfterAdvices() {
        return afterAdvices;
    }

    public void setAfterAdvices(List<AfterAdvice> afterAdvices) {
        this.afterAdvices = afterAdvices;
    }

    public List<BeforeAdvice> getBeforeAdvices() {
        return beforeAdvices;
    }

    public void setBeforeAdvices(List<BeforeAdvice> beforeAdvices) {
        this.beforeAdvices = beforeAdvices;
    }
    public Object getProxy(){
        return new ProxyProductService2(this);
    }
}
