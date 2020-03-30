package com.project.coupondeals;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.signup.controllers.CustomerController;
import com.project.signup.models.Customer;
import com.project.signup.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CouponDealsApplicationTests {

    @Autowired
	private CustomerController cc;
   
    @MockBean
    private CustomerRepository cr;

    
    @Test
    public void getCustomerTest() {
    	when(cr.findAll()).thenReturn((List<Customer>) Stream.of(new Customer("1234","ak@gmail.com",776092245, "Krishna")).collect(Collectors.toList()));
    	assertEquals(1, cc.getAllCustomers().size());
    	System.out.println(cc.getAllCustomers().size());
    }
//    @Test
//    public void postCustomerTest() {
//    	when(cr.findAll()).thenReturn((List<Customer>) Stream.of(new Customer("1234","ak@gmail.com",776092245, "Krishna")).collect(Collectors.toList()));
//    	assertEquals(1, cc.postCustomer(null).size());
//    	System.out.println(cc.getAllCustomers().size());
//    }
}





