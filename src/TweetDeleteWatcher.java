import twitter4j.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TweetDeleteWatcher {
    public static void main(String[] args) throws TwitterException {
        TwitterStream twitterStream = TwitterStreamFactory.getSingleton();

        twitterStream.addListener(new UserStreamAdapter() {
            public void onException(Exception ex) {
                ex.printStackTrace();
            }

            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
                System.out.println(String.format("つい消しを見た！ (%s)", new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒SSSミリ秒").format(new Date())));
            }
        });

        //twitterStream.user()にはしないこと！(倫理的な問題が発生する)
        twitterStream.sample();
    }
}
