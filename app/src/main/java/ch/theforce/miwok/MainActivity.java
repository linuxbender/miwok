package ch.theforce.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numberActivity = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberActivity);
            }
        });

        TextView familyMembers = (TextView) findViewById(R.id.family);
        familyMembers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent familyMembers = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyMembers);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrases);
            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colors);
            }
        });
    }
}
