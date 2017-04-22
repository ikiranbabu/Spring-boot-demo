package com.luv2code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luv2code.config.entity.Customer;
import com.luv2code.dao.CustomerDAO;

@Controller
public class CustomerController {

    
    private CustomerDAO customerDAO;



    @Autowired
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @RequestMapping("/")
    public String listCustomers(Model model){
System.out.println("ROOT Page");
        List<Customer> customers = customerDAO.findAll();
        System.out.println("ROOT Page"+customers.size());

        model.addAttribute("customers", customers);
        return "home";

    }

    @ResponseBody
    @RequestMapping(value = "/test")
    public List<Customer> test(){
        List<Customer> customers = customerDAO.findAll();
        return customers;
    }

}
