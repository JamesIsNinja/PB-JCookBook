package industries.pbj.thepbjcookbook.fragments;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

import industries.pbj.thepbjcookbook.Main2Activity;
import industries.pbj.thepbjcookbook.R;

public class OneFragment extends Fragment {
    private ListView myListView;
    private String[] strListView;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        //Make a view for the fragment_one list view
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        //Get the list view from fragment_one.xml
        myListView = (ListView) rootView.findViewById(R.id.myListView);

        //Make a list list view from the BreakFast array from breakfast.xml
        strListView = getResources().getStringArray(R.array.Breakfast_list);

        //Fill the adapter with strListview
        ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, strListView);

        //Set myListView to strListView
        myListView.setAdapter(objAdapter);

        //On Click listener for when an list view item it press
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object item = (Object) myListView.getItemAtPosition(position);
                String itemName = item.toString();
                Intent intent = new Intent(getActivity(), Main2Activity.class);


                String ingredients = "";
                String instructions = "";
                String imageId = "";
                String URL = "";

                switch(itemName){
                    case "Cereal":
                        ingredients = getResources().getString(R.string.CerealIngredients);
                        instructions = getResources().getString(R.string.CerealInstructions);
                        URL = getResources().getString(R.string.CerealURL);
                        imageId = String.valueOf(R.drawable.cereal);
                        break;
                    case "Porridge":
                        ingredients = getResources().getString(R.string.PorridgeIngredients);
                        instructions = getResources().getString(R.string.PorridgeInstructions);
                        URL = getResources().getString(R.string.PorridgeURL);
                        imageId = String.valueOf(R.drawable.porridge);
                        break;
                    case "Scrambled Eggs":
                        ingredients = getResources().getString(R.string.ScrambledEggsIngredients);
                        instructions = getResources().getString(R.string.ScrambledEggsInstructions);
                        URL = getResources().getString(R.string.ScrambledEggsURL);
                        imageId = String.valueOf(R.drawable.scrambled_eggs);
                        break;
                    case "French Toast":
                        ingredients = getResources().getString(R.string.FrenchToastIngredients);
                        instructions = getResources().getString(R.string.FrenchToastInstructions);
                        URL = getResources().getString(R.string.FrenchToastURL);
                        imageId = String.valueOf(R.drawable.french_toast);
                        break;
                    case "Pancakes":
                        ingredients = getResources().getString(R.string.PancakesIngredients);
                        instructions = getResources().getString(R.string.PancakesInstructions);
                        URL = getResources().getString(R.string.PancakesURL);
                        imageId = String.valueOf(R.drawable.pancakes);
                        break;
                    case "Waffles":
                        ingredients = getResources().getString(R.string.WafflesIngredients);
                        instructions = getResources().getString(R.string.WafflesInstructions);
                        URL = getResources().getString(R.string.WafflesURL);
                        imageId = String.valueOf(R.drawable.waffles);
                        break;
                    case "BLT":
                        ingredients = getResources().getString(R.string.BLTIngredients);
                        instructions = getResources().getString(R.string.BLTInstructions);
                        URL = getResources().getString(R.string.BLTURL);
                        imageId = String.valueOf(R.drawable.blt);
                        break;
                    case "Bagel with Cream Cheese":
                        ingredients = getResources().getString(R.string.BagelWithCreamCheeseIngredients);
                        instructions = getResources().getString(R.string.BagelWithCreamCheeseInstructions);
                        URL = getResources().getString(R.string.BagelWithCreamCheeseURL);
                        imageId = String.valueOf(R.drawable.bagel_with_cream_cheese);
                        break;
                    case "Instant Coffee":
                        ingredients = getResources().getString(R.string.InstantCoffeeIngredients);
                        instructions = getResources().getString(R.string.InstantCoffeeInstructions);
                        URL = getResources().getString(R.string.InstantCoffeeURL);
                        imageId = String.valueOf(R.drawable.coffee);
                        break;
                }

                intent.putExtra("ItemName", item.toString());
                intent.putExtra("ItemIngredients", ingredients);
                intent.putExtra("ItemInstructions", instructions);
                intent.putExtra("ItemImage", imageId);
                intent.putExtra("ItemURL", URL);

                startActivity(intent);
            }
        });
        return rootView;
    }
}
