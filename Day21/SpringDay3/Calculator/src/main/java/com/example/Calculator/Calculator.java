package com.example.Calculator;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Value("${operandOne}")
    public double operandOne;
    @Value("${operandTwo}")
    public double operandTwo;



    public double add() {
        return this.operandOne + this.operandTwo;
    }

    public double subtract() {
        return this.operandOne - this.operandTwo;
    }

    public double multiply() {
        return this.operandOne * this.operandTwo;
    }

    public double divide() {
        return this.operandOne / this.operandTwo;
    }
}






//        public double getOperandOne() {
//            return this.operandOne;
//        }
//
//        public double getOperandTwo() {
//            return this.operandTwo;
//        }
//
//        public void setOperandOne(double operandOne) {
//            this.operandOne = operandOne;
//        }
//
//        public void setOperandTwo(double operandTwo) {
//            this.operandTwo = operandTwo;
//        }
