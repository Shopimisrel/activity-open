package activity.apk.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.ManageApplications"));
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}