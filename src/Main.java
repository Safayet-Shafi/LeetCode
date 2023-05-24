import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Palindrome obj=new Palindrome();
//        System.out.println(obj.check(-121));
        RemoveElement obj1=new RemoveElement();
//        System.out.println(obj1.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
        RemoveDuplicateElement obj2=new RemoveDuplicateElement();

        ToSum obj3=new ToSum();
        int[] target1 =obj3.twoSum(new int[]{2,7,11,15},9);
        System.out.println(target1.length);

        for(int i=0;i<target1.length;i++){

                System.out.print(target1[i]+" ");


        }

        int arr[] ={3,2,2,3};
        Arrays.sort(arr);
        int[]result=obj2.removeElement(arr);
        for(int i=0;i<result.length;i++){
            if(result[i]!=0){
                //System.out.print(result[i]+" ");
            }
        }
//        System.out.print(Arrays.toString(result));
    }
}