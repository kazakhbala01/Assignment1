# Project Title

Brief description of your project.

## Project Description

## Usage

public static int FindMin(int[] arr,int n){//solution was made by recursion method Last In First Out
        int min;
        if(n==1){
            return arr[0];//If n equals to 1, returns last element of array, recursion ends
        }
        else{
            min=FindMin(arr,n-1);//recurse next function with n-1
        }
        return Math.min(arr[n-1],min);//Compare 2 numbers and returns minimum of them
    }
}
