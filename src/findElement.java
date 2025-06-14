public class findElement {

        // Function to find the majority element
        public static int findMajorityElement(int[] nums) {
            int count = 0;
            int candidate = 0;

            // Step 1: Find candidate using Moore's Voting Algorithm
            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            // Step 2: Verify that candidate is actually the majority
            count = 0;
            for (int num : nums) {
                if (num == candidate) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                return candidate;
            } else {
                return -1; // No majority element found
            }
        }

        public static void main(String[] args) {
            int[] arr = {2, 2, 1, 1, 2, 2, 2};

            int result = findMajorityElement(arr);

            if (result != -1) {
                System.out.println("Majority element is: " + result);
            } else {
                System.out.println("No majority element found.");
            }
        }
}