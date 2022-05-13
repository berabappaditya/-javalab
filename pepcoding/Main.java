    public class Main {
        public static boolean inRange(int i,int j,int n,int m) {
            if(i<0 || j<0||i>=n||j>=m) {
                return flase;
            }
            return true;
        }

    public static mazePath_01(int sr,int sc,int dr,int dc,int [][] dir,String [] dirN,String asf){
        if(sr==dr||sc==dc){
            System.out..println(asf);
            return 1;
        }
        int count=0;
        for(int i=0;i<dir.length;i++){
            int r=sr+dir[i][0];
            int c=sc+dir[i][1];
    }
 
    public static mazePath(){
        int n=3;
        int m=4;
        String [] dirN ={"H","V","D"};
        int[][] dir={{0,1},{1,0},{1,1}};


        int ans=mazePath_01();
        System.out.println(ans);


    }

    public static void main(String[] args) {
        mazePath();
    }
}