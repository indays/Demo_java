package 最长公共前缀;


public class Solution01 {


    public String longestCommonPrefix(String[] strs) {

        if(strs.length <= 0){
            return "";
        }

        String restr =strs[0];

        for(String str:strs){

            restr=mixStr(str, restr);

        }

        return restr;

    }

    public String mixStr(String text1,String text2){

        int aa=text1.length();

        int bb=text2.length();

        int len =aa>bb?bb:aa;

        if(len==0){
            return "";
        }
        for (int i = 0; i < len; i++) {

            if(text1.charAt(i)!=text2.charAt(i)){
                return text1.substring(0,i);
            }
        }
        return text1.substring(0,len);
    }
}
