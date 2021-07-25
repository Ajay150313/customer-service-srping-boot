package com.dajay.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/customer")
    public String getCustomer() {
        return "Ajay";
    }

    @GetMapping("/")
    public String test() {
        return "test_user";
    }

    @GetMapping("/data/{id}")
    public String insuranceDetails(@PathVariable("id") Integer id) {

        if (id == 101) {
            //Boolean data = restTemplate.getForObject("http://localhost:8081/api/insurance/101", Boolean.class);

            //System.out.println(data);
            return "Hello Ajay" ;
                    //", your insurance"+extracted(data);
        }
        else if(id ==102){
            //Boolean data = restTemplate.getForObject("http://localhost:8081/api/insurance/101", Boolean.class);

            //System.out.println(data);
            return "Hello Kranthi" ;
            //", your insurance"+extracted(data);
        }
        return "Sorry no user found with ID : " + id;


    }

    private String extracted(Boolean data) {
        if(data ==true){
           return  "found";
        }
       return "not found from Insurance Service";
    }
}
