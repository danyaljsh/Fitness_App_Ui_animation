package com.danyal_jsh.fitnessuianimation;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView tvSplashTitle, tvSplashSubTitle,btnExercise;
  private ImageView ivSplash;
  private View bgProgress,bgProgressStop;
  private Animation ivSplashAnim,tvSplashTitleAnim,tvSplashSubTitleAnim,bgProgressAnim,bgProgressStopAnim,btnExerciseAnim;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    tvSplashTitle =findViewById(R.id.tvsplashtitle);
    tvSplashSubTitle =findViewById(R.id.tvsplashsubtitle);
    btnExercise =findViewById(R.id.btnexercise);
    ivSplash =findViewById(R.id.ivsplash);
    bgProgress =findViewById(R.id.bgprogress);
    bgProgressStop =findViewById(R.id.bgprogressstop);

    //load fonts
    Typeface MLight = Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
    Typeface MMedium = Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");
    Typeface Vidaloka = Typeface.createFromAsset(getAssets(),"fonts/Vidaloka.ttf");

    //customize font
    tvSplashTitle.setTypeface(Vidaloka);
    tvSplashSubTitle.setTypeface(MLight);
    btnExercise.setTypeface(MMedium);

    //loadAnimatinos
    ivSplashAnim = AnimationUtils.loadAnimation(this,R.anim.ivsplashanim);
    tvSplashTitleAnim = AnimationUtils.loadAnimation(this,R.anim.tvsplashtitleanim);
    tvSplashSubTitleAnim = AnimationUtils.loadAnimation(this,R.anim.tvsplashsubtitleanim);
    bgProgressAnim =AnimationUtils.loadAnimation(this,R.anim.bgprogressanim);
    bgProgressStopAnim =AnimationUtils.loadAnimation(this,R.anim.bgprogressstopanim);
    btnExerciseAnim =AnimationUtils.loadAnimation(this,R.anim.btnstartexserciseanim);

    //startAnimatnios
    ivSplash.startAnimation(ivSplashAnim);
    tvSplashTitle.startAnimation(tvSplashTitleAnim);
    tvSplashSubTitle.startAnimation(tvSplashSubTitleAnim);
    bgProgress.startAnimation(bgProgressAnim);
    bgProgressStop.startAnimation(bgProgressStopAnim);
    btnExercise.startAnimation(btnExerciseAnim);
  }
}
