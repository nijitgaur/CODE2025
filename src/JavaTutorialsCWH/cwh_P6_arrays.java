package JavaTutorialsCWH;

public class cwh_P6_arrays {
    public static void main(String[] args) {
        //Q1
//        float[] num1 = {25.4f,45.6f,43.5f,56.5f,24.8f};
//        float sum = 0;
//        for (float v : num1) {
//            sum += v;
//        }
//        System.out.println(sum);



        //Q2
//        int[] arr = {25,76,87,45,76,89};
//        int target = 87;
//        boolean found = false;
//       for(int num : arr){
//           if(num == target){
//               found = true;
//               break;
//           }
//       }
//       if(found){
//           System.out.println("element is present");
//       }else{
//           System.out.println("element is not present");
//       }

        //Q3
//        int[] marks = {78,98,87,98,88,67,78,79,76,98,89};
//        int sum = 0;
//        for(int num : marks){
//            sum += num;
//        }
//        float average = (float) sum /marks.length;
//        System.out.println(average);


        //Q4
//         int[][] arr1 = {{100,200,200},{100,200,300}};
//         int[][] arr2 = {{100,200,200},{100,200,300}};
//         int[][] res = new int[2][3];
//         for(int i = 0;i<arr1.length;i++){
//             for(int j= 0;j<arr1[0].length;j++){
//                res[i][j] = arr1[i][j]+ arr2[i][j];
//             }
//         }
//        for (int[] re : res) {
//            for (int j = 0; j < res[0].length; j++) {
//                System.out.print(re[j] + " ");
//            }
//            System.out.println(); // Newline for next row
//        }


        //Q5
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        for(int i = arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }

        //q6
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        int largest = arr[0];
//        int n = arr.length;
//        for (int j : arr) {
//            if (j > largest) {
//                largest = j;
//            }
//        }
//        System.out.println(largest);


        //q7
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        int smallest = arr[0];
//        int n = arr.length;
//        for (int j : arr) {
//            if (j < smallest) {
//                smallest = j;
//            }
//        }
//        System.out.println(smallest);


        //Q8
        int[] arr = {1,2,3,5,6,7,8,9};
        boolean issorted =true;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted =false;
                break;
            }
        }
        if(issorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }




    }
}
