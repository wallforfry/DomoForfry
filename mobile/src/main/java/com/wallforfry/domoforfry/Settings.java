package com.wallforfry.domoforfry;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Settings extends ActionBarActivity {

    private TextView user = null;
    private String userS = null;
    private TextView pass = null;
    private TextView texte2 = null;
    // private String USER = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button submit = (Button)findViewById(R.id.connexion);

       // SharedPreferences settings = getPreferences(Context.MODE_PRIVATE);
        //user.setText(settings.getString(USER, "Inconnu"));
        //final SharedPreferences.Editor edition = settings.edit();


        user = (TextView) findViewById(R.id.user);
        pass = (TextView)findViewById(R.id.password);
        texte2 = (TextView)findViewById(R.id.textView2);
       // userS = (String) user.getText();
        submit.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                      //  edition.putString(USER, userS);
                          texte2.setText(user.getText());
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
