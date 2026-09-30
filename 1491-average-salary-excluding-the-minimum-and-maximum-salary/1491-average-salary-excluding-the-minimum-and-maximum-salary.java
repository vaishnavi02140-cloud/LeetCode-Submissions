class Solution {
    public double average(int[] salary) {
        double sum = 0;
        for(int i: salary){
            sum += i;
        }
        double size = salary.length;
        double avg = (sum - min(salary) - max(salary))/(size-2);
        return avg;
    }
    public int max(int[] salary){
        int max = salary[0];
        for(int i=0; i<salary.length; i++){
            if(max < salary[i]){
                max = salary[i];
            }
        }
        return max;
    }
    public int min(int[] salary){
        int min = salary[0];
        for(int i=0; i<salary.length; i++){
            if(min > salary[i]){
                min = salary[i];
            }
        }
        return min;
    }
}