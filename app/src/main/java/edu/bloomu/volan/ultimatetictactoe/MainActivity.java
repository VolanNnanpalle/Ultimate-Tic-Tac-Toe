package edu.bloomu.volan.ultimatetictactoe;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //to exit out of the app
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                System.exit(0);
            }
        });

        String iconName = "exit_icon.png";
        try {
            InputStream stream = getAssets().open(iconName);
            Drawable d = Drawable.createFromStream(stream, null);
            fab.setImageDrawable(d);
        } catch (IOException e) {

        }
    }

    /**
     * This method enables the user to move from the the main activity to the board activity so that
     * the user can start the game.
     * @param view
     */
    public void startGame(View view) {
        // Intent = THIS reference to activity, then ref to next activity
        Intent intent = new Intent(getApplicationContext(), BoardActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}


