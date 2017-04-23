package ch.theforce.miwok;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        CategoryAdapter categoryAdapter = new CategoryAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(categoryAdapter);
    }
}
