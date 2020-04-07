package com.coreConcept.switchCase;

public class Switch_Case {

    public static void main(String[] args) {
        int num = 20;
        switch (num+20){
            //the variable or value or expression which is provided in the switch parentheses and is evaluated,
            // then based on the result the corresponding block is executed if there is no case match with the condition,
            // then default case would execute
            //that's why we used default case
            case 1 :
                System.out.println("case 1 value is :" +num);
            case 40 :
                System.out.println("case 2 value is :"+(num+20));
            default:
                System.out.println("default value is :"+num);
        }
    }

}
