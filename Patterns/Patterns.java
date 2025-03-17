public class Patterns {

    public static void hollowRect(int n){
        for(int i=0;i<n-1;i++){
            for(int k=0;k<n;k++){
                if(i==0||i==n-2||k==0||k==n-1){
                    System.out.print("*");
                }
                
            else{
                System.out.print(" ");
            }
            }System.out.println();

        }

    }

    public static void InvRotHalfPyrmd(int n){
        for(int i=1;i<=n;i++){
            for(int k=n;k>=1;k--){
                if(k<=i){
                    System.out.print("*");
                }
                
            else{
                System.out.print(" ");
            }
            }System.out.println();

        }

    }

    public static void inverted_half_pyrmd_with_nos(int n){
       
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i+1;k++){
               
                    System.out.print(k);
                
            }
            System.out.println();

        }

    }

    public static void floydTriangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
               
                    System.out.print(num+" ");
                    num++;
                
            }
            System.out.println();

        }

    }

    public static void zeroOneTriangle(int n){
        int num=0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
               if(num==0){
                System.err.print("1");
                num=1;
               
               }
               
              else{
                System.err.print("0");
                num=0;
               }
                
            }
            System.out.println();

        }

    }

    public static void butterfly(int n){
        
        for(int i=1;i<=n/2;i++){
            for(int k=1;k<=n;k++){
               
                    if(k<=i||k>n-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                
            }
            System.out.println();           

        }
        
        for(int i=n/2;i>=1;i--){
            for(int k=1;k<=n;k++){
               
                    if(k<=i||k>n-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                
            }
            System.out.println();
        }

    }

    public static void solidRhombus(int n){
        int sp1 = n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=n;k++){
                    
                    System.out.print("*");
                                                
            }
            System.out.println();

        }

    }
    public static void hollowRhombus(int n){
        int sp1 = n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=n;k++){
                    
                   if(i==1||i==n||k==1||k==n){
                    System.out.print("*");
                   }
                   else{
                    System.out.print(" ");
                   }
                                                
            }
            System.out.println();

        }

    }

    public static void diamond(int n){
        
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
               
                System.out.print("*");    
                
            }

            for(int k=1;k<=i-1;k++){
               
                System.out.print("*");    
                
            }

            // for(int j=1;j<=n-i;j++){
            //     System.out.print(" ");
            // }
            System.out.println();           

        }
        
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=i;k>=1;k--){
               
                System.out.print("*");    
                
            }

            for(int k=i-1;k>=1;k--){
               
                System.out.print("*");    
                
            }

            // for(int j=1;j<=n-i;j++){
            //     System.out.print(" ");
            // }
            System.out.println();           

        }

    }


    public static void main(String[] args) {
        diamond(4);
    }
    }
    

