package com.example.bank.ABCbank.controller;


import com.example.bank.ABCbank.entity.Customer;
import com.example.bank.ABCbank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class BankController {

    @Autowired
    private CustomerService service;
    public Long accNo;

//    @Autowired
//    private Customer customerObj;

    @RequestMapping("/home")
    public String homepage() {
        return "home";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }


    @RequestMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @PostMapping("/login")
    public String list(Model model, HttpServletRequest request) {
        Long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
        String password = request.getParameter("password");


        Customer customerData = service.findById(accountNumber);
//        customerData = service.findById(accountNumber);

//        if(password.equals(customerData.getPassword())){
        if (service.existsById(accountNumber)) {
            if (Objects.equals(password, customerData.getPassword())) {
                accNo = customerData.getAccountNumber();
                model.addAttribute("message", "Successfully logged In..!");
                model.addAttribute("customerName", customerData.getCustomerName());
                model.addAttribute("userName", customerData.getUserName());
                model.addAttribute("phoneNumber", customerData.getPhoneNumber());
                model.addAttribute("accountNumber", customerData.getAccountNumber());
                model.addAttribute("branch", customerData.getBranch());
                return "view";
            } else {
                model.addAttribute("error", "Invalid Password..!");
                return "login";
            }

        } else {
            model.addAttribute("error", "Invalid Credentials..!");
            return "login";
        }


    }

    @PostMapping("/register")
    public String registerCustomer(HttpServletRequest request, Model model) {
        Long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
        String customerName = request.getParameter("customerName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String branch = request.getParameter("branch");
        Long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));


        model.addAttribute("accountNumber", accountNumber);
        model.addAttribute("customerName", customerName);
        model.addAttribute("userName", userName);
        model.addAttribute("branch", branch);
        model.addAttribute("phoneNumber", phoneNumber);
        Customer customer1 = new Customer(accountNumber, customerName, userName, password, branch, phoneNumber);
        service.save(customer1);
        model.addAttribute("success", "Successfully Registered..!");

        return "login";

    }


    @PostMapping("/view")
    public String details(HttpServletRequest request, Model model) {
        Long accountNumber = Long.parseLong(request.getParameter("accountNumber"));
        String customerName = request.getParameter("customerName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String branch = request.getParameter("branch");
        Long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));


        model.addAttribute("accountNumber", accountNumber);
        model.addAttribute("customerName", customerName);
        model.addAttribute("userName", userName);
        model.addAttribute("branch", branch);
        model.addAttribute("phoneNumber", phoneNumber);
        Customer customer1 = new Customer(accountNumber, customerName, userName, password, branch, phoneNumber);
        service.save(customer1);

        return "view";
    }

    @RequestMapping("/editprofile")
    public String editProfile1() {

        return "editprofile";
    }

    @RequestMapping("/editprofile/{id}")
    public String editProfile(@PathVariable Long id, Model model) {
        model.addAttribute("customers", service.findById(id));
        return "editprofile";
    }

//    @RequestMapping("/fundTransfer")
//    public String fundTransferPath() {
//        return "fundTransfer";
//    }


    @RequestMapping("/fundTransfer")
    public String fundTransfer(Model model) {
//        Customer customer= service.findById(customerObj.getAccountNumber());
//        service.findById(customerObj.getAccountNumber());
        Customer customer = service.findById(accNo);
        model.addAttribute("accountNumber", customer.getAccountNumber());
        return "fundTransfer";
    }

    @PostMapping("/fundTransfer")
    public String transferFunds(HttpServletRequest request, Model model) {
        Long fromAccount = Long.parseLong(request.getParameter("accountNumber"));
        Long toAccount = Long.parseLong(request.getParameter("accountNumber2"));
        double amount = Double.parseDouble(request.getParameter("amount"));


        Customer customer1 = service.findById(fromAccount);
        Customer customer2 = service.findById(toAccount);
        try {

            if (amount <= 0) {
                throw new IllegalArgumentException("Amount cannot be zero or negative");
            }


            if (customer1.getBalance() > amount) {
                double customer1balance = customer1.getBalance() - amount;
                customer1.setBalance(customer1balance);
                double customer2balance = customer2.getBalance() + amount;
                customer2.setBalance(customer2balance);
                service.save(customer1);
                service.save(customer2);
                model.addAttribute("message", "Transaction successful");
//            model.addAttribute("balance",customer1.getBalance());
                return "fundTransfer";
            } else {
                model.addAttribute("message", "Insufficient balance");
                return "fundTransfer";
            }
        }
        catch (IllegalArgumentException ae){
            model.addAttribute("message","Transaction failed");

        }

        return "fundTransfer";
    }


    @RequestMapping("/balance")
    public String getAccountBalance(Model model) {
        Customer customer=service.findById(accNo);
        model.addAttribute("balance",customer.getBalance());
        return "balance";
    }
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













