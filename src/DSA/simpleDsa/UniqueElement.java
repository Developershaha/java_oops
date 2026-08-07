package DSA.simpleDsa;

public class UniqueElement {

    public static int uniqueElement(int arr[]){

        int i=0;

        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;// because  we want length of unique array
    }
    public static void main(String[] args) {
        int array[]={1,1,2,3,3,3,4,4,5};
        int uniqueLength=uniqueElement(array);
                // iterate unique array --- here
        System.out.println(uniqueLength);

        for(int i=0;i<uniqueLength;i++){
            System.out.println(array[i]);
        }


    }
}
