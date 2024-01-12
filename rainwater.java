public class rainwater {
    public static int large(int[] array){
        int big=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>big){
                big=i;
            }
        }
        return big;
    }
    public static int distance(int a,int b){
        return (a>b)?a-b-1:b-a-1;
    }
    public static int watertrap(int[] array){
        int l=array.length;
        int start=0;
        int end=l-1;
        int greatest=large(array);
        int area=0;
        while(array[start]<array[start+1]){
            start+=1;
        }
        while(array[end]<array[end-1]){
            end-=1;
        }
        //GOT THE START AND END, THE ONES BETWEEN WHICH THE WATER CAN BE TRAPPED
        int scndmaxleft=start;
        for(int i=greatest;i>0;i--){
            if(array[i]>array[start]){
                scndmaxleft=i;
            }
        }//FOUND THE SECOND GREATEST ELEMENT BETWEEN GREATEST AND START
        int sumofbwelem=0;
        for(int i=scndmaxleft+1;i<greatest;i++){
            sumofbwelem+=array[i];
        }
        int temparea=distance(greatest, scndmaxleft)*array[scndmaxleft]-sumofbwelem;
        area+=temparea;
        sumofbwelem=0;
        //GOT THE AREA OF WATER BETWEEN THE GREATEST AND SECOND GREATEST
        int scndmaxleft2=start;
        for(int i=scndmaxleft;i>0;i--){
            if(array[i]>array[start]){
                scndmaxleft2=i;
            }
        }
        for(int i=scndmaxleft2+1;i<scndmaxleft;i++){
            sumofbwelem+=array[i];
        }
        temparea=distance(scndmaxleft2, scndmaxleft)*scndmaxleft2-sumofbwelem;
        area+=temparea;
        sumofbwelem=0;

        int scndmaxright=end;
        for(int i=greatest+1;i<end;i++){
            if(array[i]>array[end]){
                scndmaxright=i;
            }
        }
        for(int i=scndmaxright;i>greatest;i--){
            sumofbwelem+=array[i];
        }
        temparea=distance(scndmaxright, greatest)*scndmaxright-sumofbwelem;
        area+=temparea;
        int scndmaxright2=end;
        for(int i=scndmaxright+1;i<end;i++){
            if(array[i]>array[end]){
                scndmaxright2=i;
            }
        }
        sumofbwelem=0;
        for(int i=scndmaxright2;i>scndmaxright;i--){
            sumofbwelem+=array[i];
        }
        temparea=distance(scndmaxright2, scndmaxright)*scndmaxright2-sumofbwelem;
        area+=temparea;
        return area;       
}       
    public static void main(String[] args){
        int[] array={5,3,0,2,7,3,4};
        int area=watertrap(array);
        System.out.println(area);
    }
}
