package thewifeexpectancy.com.thewifeexpectancyv01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        TextView myEntries = (TextView) findViewById(R.id.myEntriesTv);
        myEntries.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomeScreen.this, Entries.class));
            }
        });

        TextView specText = (TextView) findViewById(R.id.mySpecsTv);
        specText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this, Specs.class));
            }
        });
    }
}
