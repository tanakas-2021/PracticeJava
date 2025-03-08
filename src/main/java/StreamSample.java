import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample {
    public static void main(String[] args) {
        var data = List.of("yamamoto", "tanaka", "baba");

        //for文で条件に合う値のみ新Listに入れる
        var result1 = new ArrayList<String>();
        for (String s : data) {
            if (s.length() >= 5) {
                result1.add(s);
            }
        }
        //System.out.println(result1);

        //ListやArrayなど値の集合に対する処理を使い回す仕組みをStreamと呼ぶ
        //List型はstream()でstream型に変換後、stream型に用意されているメソッドを使用できる
        var result2 = (int) data.stream().filter(s->s.length() >= 5).count();
        //System.out.println(result2);
        var names =  List.of("yamamoto", "kis", "sugiyama");
        //System.out.println(names.stream());

        //arrayからstream型にするためにArrays.streamやStream.ofを使う
        var strarray = new String [] {"test","hello", "eworld"};
        // System.out.println(Arrays.stream(strarray).toList());
        //System.out.println(Arrays.stream(strarray).allMatch(s-> s.contains("e")));
        // System.out.println(Stream.of(strarray).anyMatch(s -> s.contains("e")));

        //終端処理はStreamで用意されているメソッド以外に、Collectorsクラスにまとまっている。
        //Collectorsクラスで用意されているメソッドはCollectメソッドを介して使う
        //System.out.println(names.stream().collect(Collectors.joining()));

        //names.forEach(System.out::println);


    }
}
