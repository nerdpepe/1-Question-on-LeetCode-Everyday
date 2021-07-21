public class Addition {

    static int doAddition(int num) {
        if (num == 1)
            return num;
        return num + doAddition(num - 1);
    }

    public static void main(String[] args) {
        int ans = doAddition(10);
        System.out.println(ans);
    }
}
