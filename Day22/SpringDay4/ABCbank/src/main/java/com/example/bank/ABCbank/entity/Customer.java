//package com.example.bank.ABCbank;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpServletRequest;
//
////@Controller
//public class Customer {
//
//    @RequestMapping("/")
//    public String homepage(){
//        return "home";
//    }
//
//    @RequestMapping("/login")
//    public String loginPage(Model model){
//        model.getAttribute("log");
//        return "login";
//    }
//
//    @RequestMapping("/view")
//    public String viewDetails(Model model,HttpServletRequest req){
//        String username=req.getParameter("username");
//        int password=Integer.parseInt(req.getParameter("password"));
//        return "view";
//    }
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
