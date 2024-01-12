public class recursiverepeatedelem {
    public static int[] rptindx(int[] arry,int x,int[] arry1,int key,int x2){
        if(x==arry.length){
            return arry1;
        }
        if(arry[x]==key){
            arry1[x2]=x;
            x2++;
            return rptindx(arry, x+1, arry1, key, x2);
        }else{
            return rptindx(arry, x+1, arry1, key, x2);
        }
    }
    
    public static void main(String[] args){
        int[] arry={3,2,4,4,3,2,2,3,4};
        int[] arry1=new int[arry.length];
        //3->0,4,7
        //2->1,5,6
        //4->3,4,8
        int[] ans=rptindx(arry,0,arry1,3,0);
        for(int i=0;i<ans.length-6;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
