public class continuestatement {
    public static void main(String[] args) {
        int x=10;
        while(x<15){
            x++;
            if(x==12){
                continue;
            }
            System.out.print(x);
            System.out.print(" ");
        }
    }
}
