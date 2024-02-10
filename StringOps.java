public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Rectation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String s = "MMMM";
        char c = 'M';
        printArray(allIndexOf(s, c));
    }

    public static String capVowelsLowRest (String string) {
       String newS = "";
       for(int i = 0;i < string.length();i++){
        if (isLowerVowel(string.charAt(i))) {
          newS += (char)(string.charAt(i) - 32);  
        }else{
            if (!isLowerCase(string.charAt(i))) {
            newS += (char)(string.charAt(i) + 32);
            }else{
                newS += string.charAt(i);    
            }    
        }
       }

       return newS;
    }
    public static boolean isLowerCase(char c){ //check wether a char is lower case
        if ((c >= 65) && (c <= 90)) return false;  else return true;
    }
    public static boolean isLowerVowel(char c){ //checks wether a char is a lower case vowel
        switch (c) {
            case 'a':
                return true;
            case 'e':
            return true; 
            case 'i':
            return true;
            case 'o':
            return true;
            case 'u':
            return true;                 
        
            default:
                return false;
        }
    }
    public static String camelCase (String string) {
        String newS ="";
        int i = 0;
        if (noSpace(string)) {
            for(i = 0; i < string.length();i++){
                if (!isLowerCase(string.charAt(i))) newS += (char) (string.charAt(i) - 32);
              else newS += (char) string.charAt(i);
            }
        }else{
        if (string.charAt(i) == ' ') {
            while (string.charAt(i) == ' ') {
                newS = newS;
                i++;    
            }    
        }
        while (string.charAt(i) != ' ') {
            if (!isLowerCase(string.charAt(i))) {
            newS += (char) (string.charAt(i) + 32);
            }else{
                newS += (char) string.charAt(i);   
            }  
            i++;     
        }
        while(i < string.length()){
           if (string.charAt(i) == ' ') {
            newS = newS;
           } 
            else if (string.charAt(i - 1) == ' ') {
              if (isLowerCase(string.charAt(i))) newS += (char) (string.charAt(i) - 32);
              else newS += (char) string.charAt(i);    
            }else if ((string.charAt(i) == ' ')) newS = newS;         
            else{
             if (isLowerCase(string.charAt(i))) newS += (char) string.charAt(i);
             else newS += (char) (string.charAt(i) + 32);   
            }
            i++;
        }
    } 
            
        
        return newS;
    }
    public static boolean noSpace(String string){
    for(int i = 0;i < string.length();i++){
     if (string.charAt(i) == ' ') {
        return false;
     }   
    }
    return true;    
    }
    public static int[] allIndexOf (String string, char chr) {
        int length = 0;
        for(int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr) {
                length++;
            }
        }
        int [] arr = new int [length];
        int place = 0;
        for(int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr) {
                arr [place] = i;
                place++;
            }
            
        }

        return arr;
    }
    public static void printArray(int[] array){ //prints an array of ints
        System.out.print('{');
        for (int i = 0; i < array.length; i++){
        System.out.print(array[i]);
        char c = i != array.length - 1 ? ',' : '}';
        System.out.print(c);
         }
        System.out.println();
        }
}
