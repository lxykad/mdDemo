package ui.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Window;

import example.user.mddemo.R;

public class SettingActivity extends PreferenceActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_setting);
        addPreferencesFromResource(R.xml.setting_preference);
        getWindow().setEnterTransition(new Explode());


    }
}
