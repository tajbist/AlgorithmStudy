package com;

/**
 * Created by Oops on 11/12/2016.
 */
public class MergeTwoArray
{
    public static void main(String arg[]){
        int[] arr1={12,332,55,75,94};
        int[] arr2={22,44,65,82,33};
        int[] result=merge(arr1,arr2);
        for (int re:result){
            System.out.println(re);
        }
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int ind = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length)
        {
            if(arr1[i]<arr2[j]){
                result[ind++]=arr1[i];
                i++;
            }
            else {
                result[ind++]=arr2[j];

                j++;
            }
        }
        while (i<arr1.length){
            result[ind++]=arr1[i++];
        }
        while (j<arr2.length){
            result[ind++]=arr1[j++];
        }

        return result;
    }
}
