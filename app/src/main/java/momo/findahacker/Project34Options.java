package momo.findahacker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * Created by Momo on 4/4/15.
 */
public class Project34Options extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project34options);
    }

    public void buttonOnClick14(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), Project34Categories.class));
    }
}
