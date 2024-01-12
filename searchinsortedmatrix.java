public class searchinsortedmatrix {
    public static boolean search(int[][] arry,int key){
        int row=arry.length;
        int col=arry[0].length;
        int lft=0;
        int rht=col-1;
        while(lft<row&&rht>=0){
            int start=arry[lft][rht];
            if(start==key){
                System.out.println("Key found at "+lft+" "+rht+".");
                return true;
            }else if(start>key){
                rht--;
            }else{
                lft++;
            }
        }
        return false;
    }
    public static void main(String[] args){
    int[][] arry={{10,15,20,25},
            {27,29,30,32},
            {33,35,37,39},
            {40,45,48,50}};
            search(arry,40);
    }
}
