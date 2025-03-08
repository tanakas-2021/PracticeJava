import java.util.List;

public class Hello {
    public static void main(String[] args) {
        forLoop();

    }
    public static void forLoop() {
        var strs = List.of("apple", "banana");

        // 基本for
        for (int i = 0; i < strs.size() ; i++) {
            System.out.println(strs.get(i));
        }

        // 拡張for_List
        for (String str : strs) {
            System.out.println(str);
        }

        // 拡張for_array
        var nums = new int[]{2,3,5,7};
        for (int num : nums) {
            System.out.println(num);

        }

    }
}


