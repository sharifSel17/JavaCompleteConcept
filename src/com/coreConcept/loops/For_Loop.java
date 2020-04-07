package com.coreConcept.loops;

public class For_Loop {

    public static void main(String[] args) {
        //first step: initialization happen one and only once time, that means initialization part of for loop only execute once
        //second step: condition in for loop is evaluated on each iteration[repeatedly],
        // if the condition is true then the statement gets executed or if false the statement not get execute,
        // and the control transfer to the next statement.
        //third step: after every execution of for loop's body, the increment or decrement part of loop executes.
        //fourth step: after third step the control flow jump to second step and condition is re-evaluated.
        for (int i=10;i>1;i--){
            System.out.println("the value i is :"+i);
        }

        //using for loop iterate an array
        //i start from 1 also array index start with 1
        //iteration start from given value [i=1 or whatever define i value] and then look for array list like [0=2]]
        int arr[] = {2,4,5,6};
        for (int i=1;i<arr.length;i++){
            //if we want count array length just print i
            System.out.println("array length is :"+arr[i]);
        }

        //enhanced iteration is useful when we want iterate array/collection
        int arr2[] = {2,4,5,6};
        //this is the syntax enhanced for loop
        for (int num:arr2){
            //i have declared num as a int in the enhanced loop
            System.out.println("array list is :"+num);
        }

        //enhanced iteration is useful when we want iterate array/collection
        String arrString[] = {"a","b","c","d"};
        //this is the syntax enhanced for loop
        for (String num2:arrString){
            //i have declared num as a int in the enhanced loop
            System.out.println("array list is :"+num2);
        }
    }


}
