package industries.pbj.thepbjcookbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

import industries.pbj.thepbjcookbook.R;

public class Main2Activity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView ingredientsText;
    private TextView instructionsText;
    public VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ingredientsText = (TextView) findViewById(R.id.ingredientsText);
        instructionsText = (TextView) findViewById(R.id.instructionsText);

        String keyName = getIntent().getStringExtra("ItemName");
        String keyIngredients = getIntent().getStringExtra("ItemIngredients");
        String keyInstructions = getIntent().getStringExtra("ItemInstructions");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(keyName);

        ingredientsText.setText(keyIngredients);
        instructionsText.setText(keyInstructions);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
