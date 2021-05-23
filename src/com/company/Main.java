package com.company;

public class Main {
    static int binarySearch_first_occurrence(int arr[], int first, int last, int key)
    {
        int mid = (first + last)/2;
        int result = -1;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                result = mid;
                last = mid - 1;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return result;

    }


    static int binarySearch_second_occurrence(int arr[], int first, int last, int key)
    {
        int mid = (first + last)/2;
        int result = -1;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            } else if ( arr[mid] == key ) {
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return result;
    }



    static int binarySearch_third_occurrence(int arr[], int first, int last, int key)
    {
        int mid = (first + last)/2;
        int result = -1;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                result = mid;
                first = mid + 1;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return result;
    }

    static int sum_of_two(int arr[], int result){
        int length = arr.length;
        boolean f = false;
        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++){
                if (arr[i] + arr[j] == result){
                    System.out.println(arr[i] + " " + arr[j]);
                    f = true;
                    return 1;
                }
            }
        }
        if (f == false){
            System.out.println("There are no elements sum of which is " + result );
        }
        return -1;
    }

    static int sum_of_three(int arr[], int result){
        int length = arr.length;
        boolean f = false;
        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++){
                for (int q = j + 1; q < length; q++) {
                    if (arr[i] + arr[j] + arr[q] == result){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[q]);
                        f = true;
                        return 1;
                    }
                }
            }
        }
        if (f == false){
            System.out.println("There are no elements sum of which is " + result );
        }
        return -1;
    }

    public static void main(String[] args) {
	// 1 3 5 5 7 8 8 8 9 11 12 12 15
        //to find index of second occurrence
        int arr[] = {1,3, 5, 5, 7, 8, 8, 8, 9, 11, 12, 12, 15};
        int n = arr.length;
        int key = 8;
        int first_occurrence = binarySearch_first_occurrence(arr, 0, n - 1, key);
        int second_occurrence = binarySearch_second_occurrence(arr, 0, n - 1, key);
        int third_occurrence = binarySearch_third_occurrence(arr, 0, n - 1, key);
        System.out.println("index of first occurrence = " + first_occurrence);
        System.out.println("index of second occurrence = " + second_occurrence);
        System.out.println("index of third occurrence = " + third_occurrence);


        System.out.println("elements with sum of 23: ");
        int result_1 = sum_of_two(arr, 23);
        System.out.println("elements with sum of 35: ");
        int result_2 = sum_of_three(arr, 35);
    }

}
