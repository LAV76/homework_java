public class task1 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = "";

        for (int i = 0; i < jewels.length(); i++) {
            int count = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                    stones = stones.substring(0, j) + stones.substring(j + 1);
                    j--;
                }
            }
            result += jewels.charAt(i) + "" + count;
        }
        System.out.println(result);
    }
}