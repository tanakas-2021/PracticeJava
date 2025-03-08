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

# 4章 高度なプログラミング
- 検査例外と非検査例外
  - 検査例外：catchしてthrows句で誰かに押し付ける必要がある例外
  - 非検査例外：コード中で処理をする必要がない

- 例外の分類
  - 例外はすべてThrowableクラスに属する
    - Errorクラス：メモリ不足など各プログラムで対応が難しいもの
    - Exceptionクラス：各プログラムで対応
      - RuntimeExceptionクラス：try-catch不要
      - IOException
      - などなど

- try-with-resources : closeが必要な場合に必ずcloseしてくれる