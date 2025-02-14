package com.multiplecatchblock;
//NestedTryCatch --> This class is created to check nested try catch block.
public class MultipleCatchBlock {
    //Method to get the value of array at given index.
    public static void arrayCheckValue(int[] arr,int index){
        try{
           if(arr==null) throw new NullPointerException("NullPointerException Occurred because Array is empty");
           else{
               try{
                   System.out.println(arr[index]);
               }catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("ArrayOutOfBoundException Because Index is greater then size of array");
               }
           }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    //Main method to control the flow of code.
    public static void main(String[] args){
        int[] nums = new int[]{1,2,5,6,5,4,5,8};
        int[] nums2 = null;
        int index = 10;
        MultipleCatchBlock.arrayCheckValue(nums,index);
        MultipleCatchBlock.arrayCheckValue(nums2,index);
    }
}
