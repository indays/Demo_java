package hot100;

public class 小覆盖子串 {

    public String solution(String s, String t) {

        if (s == "" || t == "" || s.length() < t.length()) {

            return "";
        }

        char[] tChar = t.toCharArray();

        int[] need = new int[128];

        for (int i = 0; i < tChar.length; i++) {

            need[tChar[i]]++;
        }


        int l=0;
        int r=0;
        int size =Integer.MAX_VALUE;
        int start =0;
        int count = tChar.length;

        while (r < s.length()) {

            char c = s.charAt(r);
            if (need[c] > 0) {

                count--;
            }

            need[c]--;

            if (count == 0) {


                // 向左移动L ，使其符合最新逻辑
                while(l<r && need[s.charAt(l)]<0){
                    l++;
                    need[s.charAt(l)]--;
                }

                if (r - l + 1 < size) {

                    size =r-l+1;

                    start=l;

                }
                need[s.charAt(l)]++;
                l++;
                count--;



            }

            r++;



        }

        return size > s.length() ? "" : s.substring(start, start + size);






    }
}
