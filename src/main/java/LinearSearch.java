public class LinearSearch {
 void arraySearch(int arr[],int key){
  for(int i=0;i<arr.length;i++) {
   if (key == arr[i]) {
    System.out.println(i);
    break;
   }
   if(i==arr.length-1){
    System.out.println("not found");
   }
  }
 }
 public static void main(String[]args){
  int arr[]={90,89,56,25,27,1};
  LinearSearch as=new LinearSearch();
  as.arraySearch(arr,25);

 }
}
