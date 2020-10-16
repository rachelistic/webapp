public class Morning1016{
    public static void main(String[] args) {
        //System.out.println("java sample");
        
        int[][] reAry = new int[5][5];
        int cnt = 1; 
       
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++){
                reAry[i][j] = cnt++;
            
            }
        } 
        //값을 출력 
        for(int j=0; j<5; j++) {
            for(int i=0; i<5; i++){
               System.out.printf("%3d", reAry[i][j]); 
            }
            System.out.println();
        } 

    }
}