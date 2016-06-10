package ui.activity;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import example.user.mddemo.R;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawLayout;
    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvents();
    }

    private void initView() {
        mDrawLayout = (DrawerLayout) findViewById(R.id.draw_layout);
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
    }

    private void initEvents() {
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item1:
                        mDrawLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.item2:
                        mDrawLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.item_night:
                        mDrawLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.item_setting:
                        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                        mDrawLayout.closeDrawer(GravityCompat.START);
                        return true;
                }
                return true;
            }
        });
    }

    @Override//toolbar 菜单
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.navigation_menu,menu);
        return true;
    }

    @Override//toolbar
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}
