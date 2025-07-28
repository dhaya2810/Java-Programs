import java.util.*;
class single_ele{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(singlenumber(arr));
  }
  static int singlenumber(int arr[]){
    int res=0;
    for(int num:arr){
      res^=num;
    }
    return res;
  }
}
