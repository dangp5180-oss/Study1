
public class TWOSUM {

    public static int[] twoSum(int []nums,int target){
        for(int i = 0 ;i <= nums.length-1;i++){

            for(int j = i + 1;j < nums.length;j++){

                System.out.println(nums[i]+nums[j]);
                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
           }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int []nums ={1,3,9,5,2,8};
        int target =7;
        int []result =twoSum(nums,target);
        System.out.println(result[0]+","+result[1]);
        }
    }
