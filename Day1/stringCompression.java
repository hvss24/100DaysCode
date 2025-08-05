public class stringCompression{
    public static String compressedstring(String str){
        //create a new StringBuilder 
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            int count = 1;
            //checks for number of repeating alphabet
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                count++;
                i++;
            }
            //if count>1
            if(count>1){
                sb.append((str.charAt(i)));
                sb.append(count);
            }//else case
            else{
                sb.append(str.charAt(i));
            }
        }
        //return string
        return sb.toString();
    }    
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(compressedstring(str));
    }
}