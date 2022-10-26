
package com.mycompany.problemssolving;


public class BinarySearch {
    

    
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int midValue = l + (r - l)/2;
  
            
            if (arr[midValue] == x)
               return midValue;
  
      
            if (arr[midValue] > x)
               return binarySearch(arr, l, midValue-1, x);
  
          
            return binarySearch(arr, midValue+1, r, x);
        }
  
        
        return -1;
    }
  
 
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int array[] = {2,5,7,18,40};
        int n = array.length;
        int x = 10;
        int result = ob.binarySearch(array,0,n-1,x);
        if (result == -1)
            System.out.println("Element is not avalible");
        else
            System.out.println("Element is availble at index " +
                                                 result);
    }
}