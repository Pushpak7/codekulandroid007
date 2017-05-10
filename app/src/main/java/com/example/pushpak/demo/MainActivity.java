package com.example.pushpak.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layoutroot=new LinearLayout(this);
        layoutroot.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams paramroot=new LinearLayout.LayoutParams(500,200 );
        layoutroot.setLayoutParams(paramroot);

        final EditText txt=new EditText(this);
        txt.setHint("Type Here");
        LinearLayout.LayoutParams paramtxt=new LinearLayout.LayoutParams(500,100);
        txt.setLayoutParams(paramtxt);
        layoutroot.addView(txt);

        Button btn=new Button(this);
        btn.setText("CLICK");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=txt.getText().toString();
                txt.setText(str.toUpperCase());
            }
        });
        LinearLayout.LayoutParams parambtn=new LinearLayout.LayoutParams(500,100);
        btn.setLayoutParams(parambtn);
        layoutroot.addView(btn);

        setContentView(layoutroot);


    }
}
