package normalDsa;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// rever an arry
public class reverArray {
//    public static void main(String[] args) {
//        int arr[]={2,4,6,8,10}; // initialise array -- declare and assigned
//        for(int element :arr){
//            System.out.println(element);
//        };
//        int reverseArray[]=new int[arr.length];
//
//        for(int i=0;i<arr.length;i++){
//            reverseArray[i]=arr[arr.length-i-1];
//        };
//
//        System.out.println("Reverse array ......");
//        for(int element :reverseArray){
//            System.out.println(element);
//        };
//    }

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
// rever an arry
//    class Main {Main
        public static void main(String[] args) {
// int arr[]={2,4,6,8,10}; // initialise array -- declare and assigned
// for(int element :arr){
//     System.out.println(element);
// };
// int reverseArray[]=new int[arr.length];

// for(int i=0;i<arr.length;i++){
//     reverseArray[i]=arr[arr.length-i-1];
// };

// System.out.println("Reverse array ......");
// for(int element :reverseArray){
//     System.out.println(element);
// };
            int arr[]={2,4,6,8,10}; // initialise array -- declare and
            int start =0;
            int end=arr.length-1;


            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
            System.out.println("rever array");

            for (int ele:arr){
                System.out.println(ele);
            }

        }
        public static void swap(int[] arr,int first,int last){
            int temperary =arr[first]; // 2
            arr[first]=arr[last]; // 10
            arr[last]=temperary; // 2
        }

//    }
}


