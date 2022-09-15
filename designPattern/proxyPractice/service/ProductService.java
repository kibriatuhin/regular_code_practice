package designPattern.proxyPractice.service;

public interface ProductService {
    String getProductById(int pid);
    void saveProduct(String product);
}
