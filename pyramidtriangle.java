public class pyramidtriangle {
    public static void main(String args[]){
        int i, j,k=0, row = 5;
        for(i=1;i<=row;i++){
            for(j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(k= i-1;k<=i;k++){
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}
