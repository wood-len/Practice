import java.util.Arrays;

public class JavaPractice {
    public static void main(String[] args) {
        System.out.println(ascending("1112"));
        System.out.println(Arrays.deepToString(squarePatch(1)));
    }
    
    private static int[][] squarePatch(int sp){
        int[][] square = new int[sp][sp];
        for(int i = 0; i < sp; i++){
            for(int j = 0; j< sp; j++){
                square[i][j] = sp;
            }
        }
        return square;
    }

    private static boolean ascending(String nums){
        char[] chs = nums.toCharArray();
        int next = -1;
        boolean ascend = true;
        int size = 0;

        while(size < chs.length/2){
            for(int j = size; j<chs.length; j++){
                String p = "";
                int k = j;
                while(p.length() < size+1){
                    if(k < chs.length){
                        p = p.concat(Character.toString(chs[k]));
                        k++;
                    }
                }
                int poss = Integer.parseInt(p);
                if(next == -1 || next == poss){
                    ascend = true;
                    next = poss+1;
                    String temp = Integer.toString(next);
                    size = temp.length()-1;
                    if(j+size+1 >= chs.length){
                        break;
                    }
                }
                else{
                    ascend = false;
                    int last = next -1;
                    size = Integer.toString(last).length();
                    break;
                }
            }
            if(ascend){
                return true;
            }
            next = -1;
        }

        return ascend;
    }
}