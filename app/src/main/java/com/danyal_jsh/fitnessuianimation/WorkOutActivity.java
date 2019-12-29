package com.danyal_jsh.fitnessuianimation;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class WorkOutActivity extends AppCompatActivity {

  private TextView tvTitle, tvSubTitle,tvIntro,tvSubIntro,btnStart;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_work_out);

    tvTitle =findViewById(R.id.tvworkouttitle);
    tvSubTitle =findViewById(R.id.tvworkoutsubtitle);
    tvIntro =findViewById(R.id.tvworkoutintro);
    tvSubIntro =findViewById(R.id.tvworkoutsubintro);

    //load fonts
    Typeface MLight = Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
    Typeface MMedium = Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");
    Typeface Vidaloka = Typeface.createFromAsset(getAssets(),"fonts/Vidaloka.ttf");

    //customize font
    tvTitle.setTypeface(Vidaloka);
    tvSubTitle.setTypeface(MLight);
    tvIntro.setTypeface(Vidaloka);
    tvSubIntro.setTypeface(MLight);



  }
}
