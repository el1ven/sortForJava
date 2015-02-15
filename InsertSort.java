public class Test3 {
    public static void insertSort(int[] data){
        for(int i = 1; i < data.length; i++){//第一个元素默认排序所以需要n-1次循环即可
            for(int j = i; j > 0; j--){//从下标为1的元素开始选择
                if(data[j] < data[j-1]){//每次都选出小的插在前面，大的只要放在有序序列之后就可以,也是通过交换
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] data = new int[]{4,2,1,6,3,6,0,-5,1,1};
        insertSort(data);
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        
    }
}
