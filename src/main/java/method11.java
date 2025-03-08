import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class method11 {
    record Student(String name, int englishScore, int mathScore){
        //インスタンスに属するメソッド
        public int maxScore() {
            return Math.max(englishScore(), mathScore());
        }
    }
    public static void main(String[] args){
        var kis = new Student("kis",60,80);
        //System.out.println(average(kis));
        int max = kis.maxScore();
        //System.out.println(max);
        //lambda2();
        //var str = lambda3("test");
        //System.out.println(str);
        var ans1 = lambda4("");
        //System.out.println(ans1);
        var ans2 = lambda4("ddd");
        //System.out.println(ans2);
        //lambda5();
        //method参照：ラムダ式で受け取った引数をメソッドにそのまま渡す
        //ラムダ：引数->何か.メソッド（引数）
        //method参照：何か::メソッド
        //IntStream.range(0,3).map(method11::twice).forEach(System.out::println);
        //System.out.println(twice(2));
        //MethodReference1();
        //int[] numbers = {10, 20, 30, 40, 50};
        //methodReference2(numbers);
        List<String> names = List.of("Alice", "Bob", "Charlie");
        //System.out.println(methodReference3(names));
        //System.out.println(methodReference4(names));
        var ans = "three times".repeat("abc".length());
        System.out.println(ans);
    }

    static boolean lambda4(String s) {
        return s.isEmpty();
    }

    //クラスに属するメソッド
    static int average(Student s){
        return (s.englishScore() + s.mathScore()) / 2;
    }

    static void lambda1(){
        //ラムダ式=名無しメソッド
        var data = List.of("yamamoto", "tanaka", "baba");
        var count1 = data.stream().filter(s -> s.contains("b")).count();
        System.out.println(count1);
    }
    static void lambda2(){
        //ラムダ式=名無しメソッド
        var strArray = new String[]{"yamamoto", "tanaka", "baba"};
        var count2 = Arrays.stream(strArray).filter(s -> s.contains("a")).count();
        System.out.println(count2);
    }
    static String lambda3(String s){
        return s.toUpperCase();
    }
    static void lambda5(){
        var nums = new int[]{2,5,3};
        //int型arrayからIntStreamを得るにはIntStream.ofメソッドを使用
        var total1 = IntStream.of(nums).sum();
        System.out.println(total1);
        //IntStream.stream(start,end)で範囲を指定したintStreamを作成
        var total2 = IntStream.range(0,9).sum();
        System.out.println(total2);
    }
    static int twice(int x){
        return x * 2;
    }
    static void methodReference1(){
        var ans = Stream.of("apple","grape").mapToInt(String::length).toArray();
        for (int num : ans){
            System.out.println(num);
        }
    }
    static void methodReference2(int[] numbers){
        var ans = IntStream.of(numbers).mapToObj("*"::repeat).toList();
        for ( String str : ans){
            System.out.println(str);
        }
    }
    static List<String> methodReference3(List<String> names){
        return names.stream().map("%sさん"::formatted).toList();
    }
    static List<String> methodReference4(List<String> names){
        return names.stream().map(String::toLowerCase).toList();
    }



}
