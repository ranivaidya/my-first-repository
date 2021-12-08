public class DuplicateElement{
public static void main(String []args){
int[] arr ={8,4,5,6,8,6,60,45,5,3,7};
for (int i=0; i<arr.length; i++){
for(int j=i+1; j<arr.length; j++){
if(arr[i]==arr[j])
System.out.print(" "+arr[j]);
}
}
}
}
