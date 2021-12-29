package com.example.bank.ABCbank.controller;


import com.example.bank.ABCbank.entity.Customer;
import com.example.bank.ABCbank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BankController {

    @Autowired
    private CustomerService service;

    @RequestMapping("/")
    public String homepage(){
        return "home";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }


//    @RequestMapping("/view")
//    public String viewDetails(Model model,HttpServletRequest req){
//        Map<String, ArrayList<String>> userDetails=new HashMap<>();
//        ArrayList<String> details1=new ArrayList<>(List.of("Neethu Pauly","ABC109884740","abc@123","Ernakulam"));
//        ArrayList<String> details2=new ArrayList<>(List.of("Nithin Pauly","ABC109239040","abc@124","Thrissur"));
//        String username=req.getParameter("username");
//        String password=req.getParameter("password");
//        userDetails.put("Neethu",details1);
//        userDetails.put("Nithin",details2);
//
//        ArrayList<String> details=new ArrayList<>();
//        if(userDetails.containsKey(username)){
//            for(Map.Entry <String,ArrayList<String>>value:userDetails.entrySet()){
//                details=value.getValue();
//                model.addAttribute("customerName",details.get(0));
//                model.addAttribute("accountNumber",details.get(1));
//                model.addAttribute("branch",details.get(3));
//
//            }
//        }
//        return "view";
//    }


    @RequestMapping("/register")

    public String register(){
        return "register";
    }

    @PostMapping("/view")

    public String details(HttpServletRequest request,Model model) {
        Long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
        String customerName = request.getParameter("customerName");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String branch = request.getParameter("branch");
        Long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));

        model.addAttribute("accountNumber", accountNumber);
        model.addAttribute("customerName", customerName);
        model.addAttribute("username", userName);
        model.addAttribute("branch", branch);
        model.addAttribute("phoneNumber", phoneNumber);
        Customer customer1=new Customer(accountNumber,customerName,userName,password,branch,phoneNumber);
        service.save(customer1);

        return "view";
    }

}















