public class HW0 {
    public static void drawTriangle(int N) {
        for(int i = 1;i <= N;i = i+1){
            String str = "*";
            System.out.println(str.repeat(i));
        }
    }

    public static int max(int[] m) {
        int maximun = m[0];
        for(int i=1; i<m.length;i++){
            if(m[i] > maximun){
                maximun = m[i];
            }
        }
        return maximun;
    }

    public static void main(String[] args){
        //drawTriangle(10);
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
        System.out.println(max(numbers));
    }
}
