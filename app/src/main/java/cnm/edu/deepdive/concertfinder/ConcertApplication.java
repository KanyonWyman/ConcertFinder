package cnm.edu.deepdive.concertfinder;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class ConcertApplication extends Application {

  private static ConcertApplication instance = null;

  @Override
  public void onCreate() {
    super.onCreate();
    instance = this;
   Stetho.initializeWithDefaults(this);
  }

  public static ConcertApplication getInstance() {
    return instance;
  }

}