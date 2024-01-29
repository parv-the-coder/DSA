public class P12 {
    public static void removeduplicate(String str, int i,StringBuilder sb, boolean map[]) {
        if (i==str.length()) {
            System.out.println(sb);
            return;
        }
        char current = str.charAt(i);
        if (map[current-'a']==true) {
            removeduplicate(str, i+1, sb,map);
        }
        else
        {
            map[current-'a']=true;
            removeduplicate(str, i+1, sb.append(current),map);
        }
    }

    public static void main(String[] args) {
        removeduplicate("ppaarrv", 0, new StringBuilder(""), new boolean[26]);
    }
}
