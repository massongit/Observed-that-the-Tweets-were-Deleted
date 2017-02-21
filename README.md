# つい消しを見た
世界のどこかでツイートが削除されたときに、それを表示するプログラムです。

# 使用ライブラリ
* [Twitter4J](http://twitter4j.org/ja/index.html)

# 動作環境
* Java SE Development Kit 8

# ディレクトリ構成
* `lib/`<br>使用するライブラリのjarファイルが格納されています。
* `res/`<br>Twitter4Jの設定ファイル (`twitter4j.properties`) が格納されています。
* `src/`<br>プログラム本体 (`TweetDeleteWacher.java`) が格納されています。

#使用方法
1. 以下を取得します。
    * クライアントの情報
      * Consumer Key (API Key)
      * Consumer Secret (API Secret)
    * 自分のアカウントの情報
      * Access Token
      * Access Token Secret
1. `res/twitter4j.properties`に前の手順で取得した各情報を記述します。
1. `lib`ディレクトリ内のjarファイルにクラスパスを通し、`src/TwitterDeleteWacher.java`をコンパイルします。
1. `res/twitter4j.properties`を`TwitterDeleteWacher.class`と同じディレクトリに配置します。
1. `TwitterDeleteWacher`クラスを実行します。
