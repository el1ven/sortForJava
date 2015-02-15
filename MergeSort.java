public class Test3 {
    public static void merge(int[] data, int start1, int end1, int start2, int end2){//2路合并函数,从小到大
        int i = start1;
        int j = start2;
        
        int k = 0;
        int[] temp = new int[end2-start1+1];//创建临时数组
        
        while(i <= end1 && j <= end2){//由小到大排列
            if(data[i] > data[j]){
                temp[k++] = data[j++];
            }else{
                temp[k++] = data[i++];
            }
        }
        
        //把剩下元素放到temp数组中
        while(i <= end1){
            temp[k++] = data[i++];
        }
        while(j <= end2){
            temp[k++] = data[j++];
        }
        
        //把temp元素复制给原数组data
        k = start1;
        for(int element:temp){
            data[k++] = element;
        }
        
    }
    public static void mergeSort(int[] data, int start, int end){//归并排序函数
        if(start < end){
            int mid = (start+end)/2;//取中点,二分法
            mergeSort(data, start, mid);
            mergeSort(data, mid+1, end);
            merge(data, start, mid, mid+1, end);
        }
    }
    public static void main(String[] args){
        int[] data = new int[]{4,2,1,6,3,6,0,-5,1,1};
        mergeSort(data, 0, data.length-1);
        for(int element: data){//foreach语法
            System.out.println(element);
        }
    }
}
