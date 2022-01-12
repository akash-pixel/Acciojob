import java.util.*;

public class IntegerToWords {

    public static String numberToWord( int num, int i){
        if(num==0) return "";
        
        // for number from 1 to 19
        String[] ones = {"One", "Two", "Three", "Four", "Five", "Six", "Seven",
                         "Eight", "Nine", "Ten", "Elven", "Twelve", "Thirteen",
                         "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eightteen",
                         "Nineteen"
                        }; 
        
        // for 20 ,30, ..., 90 
        String[] tens = {"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy",
                            "Eighty", "Ninety"
                        };
        String[] zeros = { " Hundred ", " Thousand ", " Lakh ", " Crore "};
        
       String rs = "";
                        
        if( num<=19 ){
            rs = rs + ones[num-1];
        }
        else{
                int m = num%10;
                num /= 10;
                rs = tens[num-2] ;
                
                if(m>0){
                    rs = rs+" "+ ones[m-1];
                }  
        }

        if( i>=2){
            rs  = rs + zeros[i-2 ];
        }

        return rs;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextInt();
        sc.close();

        String str = "";

        for(int i=1; n>0; i++){
            
            // when "i" will be at 100th place 
            // it will get the digit at 100th place
            if(i==2){
                int m = (int)(n%10);
                n/=10;
                
                // if string is empty 'and' will not be added to the string 
                // i.e. at 100,200
                if(str.length()==0 ){
                    str = numberToWord( m, i) + str;
                }
                else{
                    str = numberToWord( m, i)+"and " + str;
                }
                
            }
            else{
                int m = (int)(n%100);
                n /=100;
                str = numberToWord( m, i) + str;
            }
        }
        
        if(str.charAt(str.length()-1) != ' '){
            str = str +" ";
        }


        System.out.println( str );
        return;
    }    
}
