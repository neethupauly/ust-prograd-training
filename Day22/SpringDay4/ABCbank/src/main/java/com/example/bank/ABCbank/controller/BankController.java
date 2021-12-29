package com.example.bank.ABCbank;


import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BankController {


    @RequestMapping("/")
    public String homepage(){
        return "home";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/view")
    public String viewDetails(Model model,HttpServletRequest req){
        Map<String, ArrayList<String>> userDetails=new HashMap<>();
        ArrayList<String> details1=new ArrayList<>(List.of("Neethu Pauly","ABC109884740","abc@123","Ernakulam"));
        ArrayList<String> details2=new ArrayList<>(List.of("Nithin Pauly","ABC109239040","abc@124","Thrissur"));
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        userDetails.put("Neethu",details1);
        userDetails.put("Nithin",details2);

        ArrayList<String> details=new ArrayList<>();
        if(userDetails.containsKey(username)){
            for(Map.Entry <String,ArrayList<String>>value:userDetails.entrySet()){
                details=value.getValue();
                model.addAttribute("customerName",details.get(0));
                model.addAttribute("accountNumber",details.get(1));
                model.addAttribute("branch",details.get(3));

            }
        }
//        for (Map.Entry<String,Integer> m:map.entrySet()){
//            if (m.getValue()>50){
//                System.out.println(m.getKey()+ "->"+ m.getValue());
//                System.out.println("Secured A Grade in :"+ m.getKey());
//            }
//            else if (m.getValue()>=40 && m.getValue()<49){
//                System.out.println(m.getKey()+ "->"+ m.getValue());
//                System.out.println("Secured B Grade in :"+ m.getKey());
//            }
//            else if ((m.getValue()>=30 && m.getValue()<39)){
//                System.out.println(m.getKey()+ "->"+ m.getValue());
//                System.out.println("Secured C Grade in "+ m.getKey());
//            }
//            else {
//                System.out.println("Failed in :"+ m.getKey());
//            }

//        }



        return "view";
    }

}















