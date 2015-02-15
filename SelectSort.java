public class Test3 {
    public static void selectSort(int[] data){
        for(int i = 0; i < data.length; i++){
            for(int j = i+1; j < data.length; j++){//需要选择n-1次
                if(data[i] > data[j]){//每次检测是否交换
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] data = new int[]{4,2,1,6,3,6,0,-5,1,1};
        selectSort(data);
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        
    }
}
