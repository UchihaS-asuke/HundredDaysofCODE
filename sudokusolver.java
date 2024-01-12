public class sudokusolver {
    public static void prntsudoku(int[][] sudoku){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int[][] sudoku,int i,int j,int k){
        //row
        for(int j2=0;j2<9;j2++){
            if(sudoku[i][j2]==k){
                return false;
            }
        }
        //column
        for(int i2=0;i2<9;i2++){
            if(sudoku[i2][j]==k){
                return false;
            }
        }
        //grid
        int cnum=0;
        int rnum=0;
        if(i<3){
            rnum=0;
        }else if(i<6){
            rnum=1;
        }else{
            rnum=2;
        }
        if(j<3){
            cnum=0;
        }else if(j<3){
            cnum=1;
        }else{
            cnum=2;
        }
        int gridno=0;
        if(rnum==0){
            if(cnum==0){
                gridno=1;
            }else if(cnum==1){
                gridno=2;
            }else{
                gridno=3;
            }
        }

        if(rnum==1){
            if(cnum==0){
                gridno=4;
            }else if(cnum==1){
                gridno=5;
            }else{
                gridno=6;
            }
        }

        if(rnum==2){
            if(cnum==0){
                gridno=7;
            }else if(cnum==1){
                gridno=8;
            }else{
                gridno=9;
            }
        }

        if(gridno==1){
            for(int i2=0;i2<3;i2++){
                for(int j2=0;j2<3;j2++){
                    if(sudoku[i2][j2]==k){
                        return false;
                    }
                }
            }
        }

        if(gridno==2){
            for(int j2=0;j2<3;j2++){
                for(int i2=3;i2<6;i2++){
                    if(sudoku[i2][j2]==k){
                        return false;
                    }
                }
            }
        }

        if(gridno==3){
            for(int j2=0;j2<3;j2++){
                for(int i2=6;i2<9;i2++){
                    if(sudoku[i2][j2]==k){
                        return false;
                    }
                }
            }
        }

        if(gridno==4){
            for(int i2=0;i2<3;i2++){
                for(int j2=3;j2<6;j2++){
                    if(sudoku[i2][j2]==k){
                        return false;
                    }
                }
            }
        }

        if(gridno==5){
            for(int i2=3;i2<6;i2++){
                for(int j2=3;j2<6;j2++){
                    if(sudoku[i2][j2]==k){
                        return false;
                    }
                }
            }
        }

        if(gridno==6){
            for(int i2=6;i2<9;i2++){
                for(int j2=3;j2<6;j2++){
                    if(sudoku[i2][j2]==k){
                        return false;
                    }
                }
            }
        }

        if(gridno==7){
            for(int i2=0;i2<3;i2++){
                for(int j2=6;j2<9;j2++){
                    if(sudoku[i2][j2]==k){
                        return false;
                    }
                }
            }
        }

        if(gridno==8){
            for(int i2=3;i2<6;i2++){
                for(int j2=6;j2<9;j2++){
                    if(sudoku[i2][j2]==k){
                        return false;
                    }
                }
            }
        }

        if(gridno==9){
            for(int i2=6;i2<9;i2++){
                for(int j2=6;j2<9;j2++){
                    if(sudoku[i2][j2]==k){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void solver(int[][] sudoku){

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                for(int k=1;k<10;k++){
                    if(isSafe(sudoku,i,j,k)){
                        sudoku[i][j]=k;
                    }
                }
            }
        }
        prntsudoku(sudoku);
    }
    public static void main(String[] args){
        int[][] sudoku=new int[9][9];
        sudoku[1][0]=4;
        sudoku[3][0]=1;
        sudoku[5][0]=9;
        sudoku[8][0]=8;
        sudoku[1][1]=9;
        sudoku[3][1]=8;
        sudoku[5][1]=6;
        sudoku[6][1]=3;
        sudoku[7][1]=4;
        sudoku[8][1]=2;
        sudoku[0][2]=8;
        sudoku[2][2]=3;
        sudoku[3][2]=5;
        sudoku[7][2]=9;
        sudoku[8][2]=7;
        sudoku[1][3]=1;
        sudoku[5][3]=4;
        sudoku[1][4]=5;
        sudoku[3][4]=6;
        sudoku[4][4]=2;
        sudoku[6][4]=7;
        sudoku[7][4]=3;
        sudoku[1][5]=7;
        sudoku[2][5]=4;
        sudoku[5][5]=5;
        sudoku[6][5]=2;
        sudoku[8][5]=9;
        sudoku[2][6]=1;
        sudoku[5][6]=3;
        sudoku[2][7]=9;
        sudoku[3][7]=2;
        sudoku[4][7]=6;
        sudoku[7][7]=5;
        sudoku[8][7]=1;
        sudoku[1][8]=2;
        sudoku[6][8]=4;
        sudoku[7][8]=7;
        sudoku[8][8]=3;
        solver(sudoku);
    }
}
