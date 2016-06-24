package com.emusicstore.service.impl;



import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import com.emusicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Transactional
    public Product getProductById(int productId){
        return productDao.getProductById(productId);
    }
    
    @Transactional
    public List<Product> getProductList(){
        return productDao.getProductList();
    }
    
    @Transactional
    public void addProduct(Product product){
        productDao.addProduct(product);
    }
    
    @Transactional
    public void editProduct(Product product){
        productDao.editProduct(product);
    }
    
    @Transactional
    public void deleteProduct(Product product){
        productDao.deleteProduct(product);
    }


} // The End of Class;
