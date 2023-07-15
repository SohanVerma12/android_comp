package com.example.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DisplayActivity extends AppCompatActivity {

    private static final String SHARED_PREF_NAME = "my_shared_pref";
    private static final String KEY_IMAGE = "image_key";
    private static final String KEY_TEXT_1 = "text_1_key";
    private static final String KEY_TEXT_2 = "text_2_key";

    private ImageView imageView;
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        imageView = findViewById(R.id.displayImageView);
        textView1 = findViewById(R.id.displayTextView1);
        textView2 = findViewById(R.id.displayTextView2);

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        String imageString = sharedPreferences.getString(KEY_IMAGE, null);
        String text1 = sharedPreferences.getString(KEY_TEXT_1, null);
        String text2 = sharedPreferences.getString(KEY_TEXT_2, null);

        if (imageString != null) {
            byte[] imageBytes = Base64.decode(imageString, Base64.DEFAULT);
            Glide.with(this).load(imageBytes).into(imageView);
        }

        if (text1 != null) {
            textView1.setText(text1);
        }

        if (text2 != null) {
            textView2.setText(text2);
        }
    }
}
