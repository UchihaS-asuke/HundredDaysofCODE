public class wordpalindromecheck {
   
        public static StringBuilder sntncrevs(String abc){
            int l=abc.length();
            StringBuilder cba=new StringBuilder(abc);
            for(int i=0;i<=l/2;i++){
                char temp=cba.charAt(i);
                cba.setCharAt(i, cba.charAt(l-i-1));
                cba.setCharAt(l-i-1, temp);
            }
            return cba;
        }

    public static void main(String[] args){
        String name="tigit";
        String revnam=sntncrevs(name).toString();
        
        if(name.compareTo(revnam)==0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}

