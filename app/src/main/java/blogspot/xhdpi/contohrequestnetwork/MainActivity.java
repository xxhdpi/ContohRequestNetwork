package blogspot.xhdpi.contohrequestnetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements AmbilDataTask.Callback {

  private static final String TAG = "main";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    new AmbilDataTask(this).execute("https://httpbin.org/get");
  }

  @Override public void sendResult(String result) {
    Log.d(TAG, "sendResult: " + result);
  }
}
