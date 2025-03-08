# 2章 Javaの基本
- オーバーロード：名前が同じで引数が異なるメソッドを用意
- シグネチャ：メソッドの名前と引数を合わせたもの

- format
```
// formatted関数の引数の値が、%sに入る
jshell> "test%s".formatted(12+3)
$20 ==> "test15"

// formatted関数の引数の数に限りはない
jshell> "test%sと%s".formatted(12+3,13)
$21 ==> "test15と13"

// %s=文字列、%d=数値
jshell> "test%dと%d".formatted(12+3,13)
$22 ==> "test15と13"

// %,dでカンマが入る
jshell> "test%,dと%,d".formatted(1000,1003)
$23 ==> "test1,000と1,003"
```


- staticメソッドとインスタンスメソッド
  - staticメソッド：クラス名.メソッド
  - インスタンスメソッド：値.メソッド