import java.util.*;
class selectionSort{

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ "");
        }
        System.out.println();
    }

public static void main(String[] args) {

    int arr[]={5,3,6,9,2};

for(int i=0;i<arr.length-1;i++){
    int smallestIndex=i;
    for(int j=i+1;j<arr.length;j++){
        if(arr[smallestIndex]>arr[j])
           smallestIndex=j;

    }
   int temp=arr[smallestIndex];
   arr[smallestIndex]=arr[i];
   arr[i]=temp;
   
}
printArray(arr);
    
}


}
