public class Test3 {
    public static void quickSort(int[] data, int low, int high){
        if(low < high){
            int i = low;
            int j = high;
            int mid = data[i];//中间值标准
            while(i < j){//如果条件不成立就证明排序完毕可以不用在排了
                while(i < j && mid < data[j]){
                    j--;
                }
                if(i < j){
                    data[i] = data[j];//小的放在mid左边
                    i++;
                }
                while(i < j && data[i] < mid){
                    i++;
                }
                if(i < j){
                    data[j] = data[i];//大的放在mid右边
                    j--;
                }
                data[i] = mid;//把mid放在中间
                quickSort(data, low, i-1);
                quickSort(data, i+1, high);//分治法+递归调用
            }
        }
    }
    public static void main(String[] args){
        int[] data = new int[]{4,2,1,6,3,6,0,-5,1,1};
        quickSort(data, 0, data.length-1);
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        
    }
}
