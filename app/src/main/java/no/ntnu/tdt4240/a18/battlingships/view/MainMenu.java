package no.ntnu.tdt4240.a18.battlingships.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import no.ntnu.tdt4240.a18.battlingships.R;
import no.ntnu.tdt4240.a18.battlingships.controller.ShipController;
import no.ntnu.tdt4240.a18.battlingships.model.NetworkInterface;

public class MainMenu extends Activity {

    private ShipController aController;
    private NetworkInterface net;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        net = NetworkInterface.getInstance();
        net.checkStatus();

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
        Intent intent = new Intent(this, CreateNewGame.class);
        startActivity(intent);
    }

    /** Called when the user clicks the "CreditView" button */
    public void showCredits(View view) {
        Intent intent = new Intent(this, ActionView.class);
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
