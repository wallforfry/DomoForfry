package com.wallforfry.domoforfry;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.TextView;
//test

public class MainActivity extends ActionBarActivity {
    private TextView switchStatus;
    private Switch mySwitch;
    private Switch toggle;
    private TextView texte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bouton = (Button)findViewById(R.id.Button);
        texte = (TextView)findViewById(R.id.text);
        final WebView myWebView = (WebView) findViewById(R.id.webView);

        bouton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        texte.setText("Bonjour");

                        Intent intent = new Intent(MainActivity.this, Settings.class);
                        startActivity(intent);
                    }

                }
        );
    }

        //fonction switch
        public void action(final View v){
            final WebView myWebView = (WebView) findViewById(R.id.webView);
            switchStatus = (TextView) findViewById(R.id.switchStatus);
        switch(v.getId()){
            case R.id.switch1:
                mySwitch = (Switch) findViewById(R.id.switch1);
                mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            switchStatus.setText("Oeuf Switch is currently ON");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=On&level=0");
                        }else{
                            switchStatus.setText("Oeuf Switch is currently OFF");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=Off&level=0");
                        }

                    }
                });
                break;

            case R.id.switch2:
                mySwitch = (Switch) findViewById(R.id.switch2);
                mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            switchStatus.setText("Switch is currently ON");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=On&level=0");
                        }else{
                            switchStatus.setText("Switch is currently OFF");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=Off&level=0");
                        }

                    }
                });
                break;
            case R.id.switch3:
                mySwitch = (Switch) findViewById(R.id.switch3);
                mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            switchStatus.setText("Oeuf Switch is currently ON");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=On&level=0");
                        }else{
                            switchStatus.setText("Oeuf Switch is currently OFF");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=Off&level=0");
                        }

                    }
                });
                break;
            case R.id.switch4:
                mySwitch = (Switch) findViewById(R.id.switch4);
                mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            switchStatus.setText("Oeuf Switch is currently ON");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=On&level=0");
                        }else{
                            switchStatus.setText("Oeuf Switch is currently OFF");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=Off&level=0");
                        }

                    }
                });
                break;
            case R.id.switch5:
                mySwitch = (Switch) findViewById(R.id.switch5);
                mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            switchStatus.setText("Oeuf Switch is currently ON");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=On&level=0");
                        }else{
                            switchStatus.setText("Oeuf Switch is currently OFF");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=Off&level=0");
                        }

                    }
                });
                break;
            case R.id.switch6:
                mySwitch = (Switch) findViewById(R.id.switch6);
                mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            switchStatus.setText("Oeuf Switch is currently ON");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=On&level=0");
                        }else{
                            switchStatus.setText("Oeuf Switch is currently OFF");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=Off&level=0");
                        }

                    }
                });
                break;
            case R.id.switch7:
                mySwitch = (Switch) findViewById(R.id.switch7);
                mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            switchStatus.setText("Oeuf Switch is currently ON");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=On&level=0");
                        }else{
                            switchStatus.setText("Oeuf Switch is currently OFF");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=Off&level=0");
                        }

                    }
                });
                break;
            case R.id.switch8:
                mySwitch = (Switch) findViewById(R.id.switch8);
                mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            switchStatus.setText("Oeuf Switch is currently ON");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=On&level=0");
                        }else{
                            switchStatus.setText("Oeuf Switch is currently OFF");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=Off&level=0");
                        }

                    }
                });
                break;
            case R.id.switch9:
                mySwitch = (Switch) findViewById(R.id.switch9);
                mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            switchStatus.setText("Oeuf Switch is currently ON");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=On&level=0");
                        }else{
                            switchStatus.setText("Oeuf Switch is currently OFF");
                            myWebView.loadUrl("http://forfry.fr.nf:1528/json.htm?type=command&param=switchlight&idx="+v.getTag()+"&switchcmd=Off&level=0");
                        }

                    }
                });
                break;
            }


        }
        //fin fonction







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

switch(item.getItemId()){
    case R.id.action_settings:
        Intent intent = new Intent(MainActivity.this, Settings.class);
        startActivity(intent);
        return true;

    case R.id.Json:
        // Intent intent2 = new Intent(MainActivity.this, JsonActivity.class);
        // startActivity(intent2);
        return true;

}

        return super.onOptionsItemSelected(item);
    }



}
