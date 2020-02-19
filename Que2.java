package JAVA2;
public class Que2 {
    public static void main(String[] args) {

        String s="vinodkumarsingh";
        char ch[]=s.toCharArray();
        char temp;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(ch[i]<ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }

        }

        String sortarr=String.valueOf(ch);
        System.out.println(sortarr);
    }

}