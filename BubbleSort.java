public class Test3 {
    public static void BubbleSort(int[] data){//每次排序归位一个最大的值
        for(int i = data.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(data[j] > data[j+1]){//选出最大的进行交换位置
                    int temp = data[j+1];  
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] data = new int[]{4,2,1,6,3,6,0,-5,1,1};
        BubbleSort(data);
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
}