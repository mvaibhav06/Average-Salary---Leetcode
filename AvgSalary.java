public class AvgSalary {
    public static double getAvgSalary(int[] salary){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for (int i=0; i<salary.length; i++){
            sum += salary[i];
            if (salary[i] > max){
                max = salary[i];
            }
            if (salary[i] < min){
                min = salary[i];
            }
        }

        return (sum-max-min)/(salary.length-2);
    }
    public static void main(String[] args) {
        int[] nums = {4000,3000,1000,2000};
        System.out.println(getAvgSalary(nums));
    }
}
