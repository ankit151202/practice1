import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public int removeElement(int[] nums, int val) {
        List<Integer> arrays =new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(nums[i]!=val)
                arrays.add(nums[i]);  // return the remaining elements
        }
        for(int i=0; i< arrays.size(); i++){
            nums[i]=arrays.get(i); // to copy the list elements
        }
        return arrays.size();
}
    public static void main(String[] args) {
         Arraylist obj = new Arraylist();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int length = obj.removeElement(nums, val);

        System.out.println("New length: " + length);
        System.out.print("Modified array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
