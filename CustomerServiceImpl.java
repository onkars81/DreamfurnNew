package com.emusicstore.service.impl;


import com.emusicstore.dao.CustomerDao;
import com.emusicstore.model.Customer;
import com.emusicstore.service.CustomerService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;
    @Autowired
    SessionFactory sessionfactory;
    @Transactional
    public void addCustomer(Customer customer){
    	
    	Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		tx.begin();
		customerDao.addCustomer(customer);
		tx.commit();
    	
    	 	
        
    }
    @Transactional
    public Customer getCustomerById(int customerId){
    
    	Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		tx.begin();
		Customer customer=customerDao.getCustomerById(customerId);
    	tx.commit();
		return customer;
    
    
    }
    @Transactional
    public List<Customer> getAllCustomers(){
    
    	Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		tx.begin();
		List <Customer> customer=customerDao.getAllCustomers();
		tx.commit();
    	return customer;
    
    
    }
    @Transactional
    public Customer getCustomerByUsername (String username){
        
    	Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		tx.begin();
		Customer customer=customerDao.getCustomerByUsername(username);
		tx.commit();
    
    
    	return customer; 
        
    }


} // The End of Class;
