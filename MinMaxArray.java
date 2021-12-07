class MinMaxArray{
public static void main(String[] args){
int arr[]={2,3,4,5,6,76,7,4};

int min = arr[0];
int max = arr[0];

for(int i=0; i<arr.length; i++){

if(arr[i]<min){
min = arr[i];
}
if(arr[i]>max){
max = arr[i];
}
}
System.out.println("Minimum "+ min);
System.out.println("Miximum "+ max);
}

}