import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       // System.out.println(scramble("sammoc", "commas"));
        //System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
       // System.out.println(solution(10));
        //snail(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
    }


        public static boolean scramble(String str1, String str2) {
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        char[] base = str2.toCharArray();
        char[] word = new char[str2.length()];
            for (int i = 0; i < word.length; i++) {
                word[i] = 9;
            }
            for (int i = 0; i < string1.length; i++) {
                for (int j = 0; j < string2.length; j++) {
                    if(string1[i] == string2[j] && word[j] == 9){

                        word[j] = string1[i];
                        string1[i] = '0';

                    }
                }
            }

            if(Arrays.equals(base, word)) {
                return true;
            } else {
                return false;
            }
            }

    public static int findIt(int[] a) {
        Arrays.sort(a);
        int num;
        int count = 0;
        if (a.length == 1) {
            return a[0];
        } else {
            for (int i = 0; i < a.length; i++) {
                num = a[i];
                for (int j = 1; j < a.length; j++) {
                    if (num == a[j-1]) {

                        if(a.length -1 == j){
                            return a[j];
                        }
                        count++;
                        if (num != a[j] && count % 2 != 0) {
                            return num;
                        }

                    }
                }
            }

        }
        return 9999;
    }

    public static int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }



    public static String SongDecoder (String song) {
            String songname = "";
            for (int i = 2; i < song.length(); i++) {
                if(song.charAt(0) != 'W'){
                    songname += song.charAt(0);
                }
                if(song.charAt(i) == 'B' && song.charAt(i-1) == 'U' && song.charAt(i-2) == 'W') {
                    break;
                } else {

                }
            }

            return songname;
        }

}
