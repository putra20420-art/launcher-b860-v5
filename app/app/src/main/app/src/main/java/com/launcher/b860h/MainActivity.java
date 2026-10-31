package com.launcher.b860h;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40, 30, 40, 30);
        layout.setBackgroundColor(Color.rgb(15, 20, 35));

        TextView title = new TextView(this);
        title.setText("🇮🇩 LAUNCHER TIMNAS INDONESIA");
        title.setTextSize(30);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        String[] menu = {
            "📺 TV",
            "▶ YouTube",
            "⚽ TIMNAS INDONESIA",
            "🕌 JADWAL SHOLAT",
            "📱 SEMUA APLIKASI",
            "⚙ PENGATURAN"
        };

        for (String item : menu) {
            Button button = new Button(this);
            button.setText(item);
            button.setTextSize(20);
            layout.addView(button);
        }

        setContentView(layout);
    }
}
