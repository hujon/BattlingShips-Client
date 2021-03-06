package no.ntnu.tdt4240.a18.battlingships.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

import no.ntnu.tdt4240.a18.battlingships.R;
import no.ntnu.tdt4240.a18.battlingships.controller.ShipController;
import no.ntnu.tdt4240.a18.battlingships.model.NetworkInterface;

public class MainMenu extends Activity {

    private ShipController aController;
    //Timer t = new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        aController = (ShipController) getApplicationContext();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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

    /** Called when the user clicks the "Game View" button */
    public void createNewGame(View view) {
    /*    t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (aController.getNet().getgameCreated()!=""){
                    System.out.println(aController.getNet().getgameCreated());
                    t.cancel();
                }
            }
        },0,1000);
        if (aController.getNet().getgameCreated()=="no game created"){
            Intent intent = new Intent(this, CreateNewGame.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, JoinGameView.class);
            startActivity(intent);
        } */

        Intent intent = new Intent(this, CreateNewGame.class);
        startActivity(intent);
    }

    /** Called when the user clicks the "CreditView" button */
    public void showCredits(View view) {
        Intent intent = new Intent(this, CreditView.class);
        startActivity(intent);
    }

    /** Called when the user clicks the "JoinView" button */
    public void joinGame(View view) {
        Intent intent = new Intent(this, JoinGameView.class);
        startActivity(intent);
    }
    
    /** Called when the user clicks the "Game View" button */
    public void exitApp(View view) {
        finish();
        System.exit(0);
    }
}
