import java.util.Scanner;
 
class revstr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
 
        String originalStr = scanner.nextLine();
        scanner.close();
 
        String words[] = originalStr.split("\\s");
        String reversedString = "";
 
        //Reverse each word's position
        for (int i = words.length - 3; i >= 0; i--) { 
            
               reversedString = reversedString+words[i] ; 
        } 
    	System.out.print(reversedString.trim());
        String result2="";
        for(int k=words.length-2;k <= words.length-1;k++)
       {
          result2=result2+(" "+words[k]);
        }
        
 
         System.out.print(result2+".");
        
    }
}