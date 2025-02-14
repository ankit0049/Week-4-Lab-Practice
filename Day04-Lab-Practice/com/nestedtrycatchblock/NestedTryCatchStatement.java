package com.nestedtrycatchblock;
// Create a class for the nested exception handling.
public class NestedTryCatchStatement {
    //method of division of array element other wise it will have a nested exception block
    public static int divisionOfArray(int[] arr, int divisor, int index){
        try{
            int value = arr[index];
            try{
                if(divisor<=0){
                    throw new ArithmeticException("Arithematic exception : Can't possible division with 0");
                }
               return value / divisor;
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }catch(ArrayIndexOutOfBoundsException e){
          throw new ArrayIndexOutOfBoundsException("Index not accessible");
        }
        return -1;
    }

    //Main method to control the flow of code.
    public static void main(String[] args){
        int[] arr = new int[]{78,0,5,7};

        //run successfully
        System.out.println(NestedTryCatchStatement.divisionOfArray(arr,10,3));

        //throw arithematic exception
        System.out.println(NestedTryCatchStatement.divisionOfArray(arr,0,1));

        //throw index out of bound exception
        System.out.println(NestedTryCatchStatement.divisionOfArray(arr,10,10));
    }
}
