package com.example.marian.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView1)
    TextView textView1;

    @BindView(R.id.imageView1)
    ImageView imageView1;

    @OnClick(R.id.textView1)
    public void click(TextView textView) {
        textView.setBackgroundColor(Color.WHITE);
        textView.setText("Changed");
        textView.setTextColor(Color.BLACK);
    }
    @OnClick(R.id.imageView1)
    public void click2 (ImageView imageView) {
        imageView.setImageResource(R.drawable.imagen);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Picasso.with(this).load("http://www.skybondsor.com/wp-content/uploads/2011/08/click-me.png").into(imageView1);
    }
}
