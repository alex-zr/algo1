package Mariia.NtoK;

public class nTOk {
    public static void main(String[] args) {
        new nTOk().numbers(12,7);
    }

    public void numbers(int n, int k){
        System.out.println(n);
        if(n==k){
            return;
        }
        numbers(n<k?(n+1):(n-1),k);
    }
}