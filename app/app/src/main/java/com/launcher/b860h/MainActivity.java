package com.launcher.b860h;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("LAUNCHER B860H\n\nSelamat Datang");
        text.setTextSize(28);
        text.setGravity(Gravity.CENTER);

        setContentView(text);
    }
}
