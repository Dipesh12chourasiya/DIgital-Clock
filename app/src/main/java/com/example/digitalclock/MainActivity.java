package com.example.digitalclock;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextClock;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextClock textClock, ampmid, textdate;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        textClock = findViewById(R.id.textclockid);
        ampmid = findViewById(R.id.ampmid);
        textdate = findViewById(R.id.textDateid);


//        LocalDate myObj = LocalDate.now(); // Create a date object
//        System.out.println(myObj); // Display the current date
//        Output : 2024-10-21

//        LocalTime myObj = LocalTime.now();
//        System.out.println(myObj);
//        Output: 14:02:54.437770

    }
}