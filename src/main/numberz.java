class Number {
    public static void main(String[] args) {

        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

        if (n1 >= n2) {
            System.out.println("First Level if");    
            if (n1 >= n3) {
                largestNumber = n1;
                if (n1 % 2 == 0){
                    sum = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12+n13+n14+n15+n16+n17+n18+n19+n20+n21+n22+n23+n24+n25;
                    System.out.println("n1 is even");    
                } else {
                    System.out.println("n1 is odd");
                }
                System.out.println("n1 post if");
                
            } else {
                largestNumber = n3;
                if (n3 % 2 == 0){
                    System.out.println("n3 is even");    
                } else {
                    System.out.println("n3 is odd");
                }
                System.out.println("n3 post else");
            }
            System.out.println("inner post if");
        } else {
            System.out.println("First Level else");    
            if (n2 >= n3) {
                largestNumber = n2;
                if (n2 % 2 == 0){
                    System.out.println("n2 is even");    
                } else {
                    System.out.println("n2 is odd");
                }
                System.out.println("n2 post if");
            } else {
                largestNumber = n3;
                if (n1 % 3 == 0){
                    System.out.println("n3 is even");    
                } else {
                    System.out.println("n3 is odd");
                }
                System.out.println("n3 post else");
            }
            System.out.println("inner post else");
        }

        System.out.println("Largest number is " + largestNumber);
    }
}
