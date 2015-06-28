package edu.ucsb.cs.cs185.juliolemus165.hitme;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.wenchao.cardstack.CardStack;


public class MainActivity extends ActionBarActivity {

    private CardStack cards;
    private CardsDataAdapter cardsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cards = (CardStack)findViewById(R.id.container);
        cards.setContentResource(R.layout.card_layout);
        cards.setStackMargin(20);

        cardsAdapter = new CardsDataAdapter(getApplicationContext(),0);
        cardsAdapter.add("Text1");
        cardsAdapter.add("Text2");

        cardsAdapter.add("Text3");
        cardsAdapter.add("Text4");
        cardsAdapter.add("Text5");

        cardsAdapter.add("Text3");
        cardsAdapter.add("Text4");
        cardsAdapter.add("Text5");

        cardsAdapter.add("Text3");
        cardsAdapter.add("Text4");
        cardsAdapter.add("Text5");

        cardsAdapter.add("Text3");
        cardsAdapter.add("Text4");
        cardsAdapter.add("Text5");

        cardsAdapter.add("Text3");
        cardsAdapter.add("Text4");
        cardsAdapter.add("Text5");

        cardsAdapter.add("Text3");
        cardsAdapter.add("Text4");
        cardsAdapter.add("Text5");

        cardsAdapter.add("Text3");
        cardsAdapter.add("Text4");
        cardsAdapter.add("Text5");


        cards.setAdapter(cardsAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
