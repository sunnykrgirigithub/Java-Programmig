 class fibonacci {
    public static void main(String args[]){
        int n1=0;
        int n2=1;
        int n3,count=15;
        System.out.println("fibonacci no is: ");
        for( int i=2; i<=count; i++)
        {
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }

    }
}
