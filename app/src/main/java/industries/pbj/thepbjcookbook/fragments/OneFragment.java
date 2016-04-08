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
            View rootView = inflater.inflate(R.layout.fragment_one, container, false);
            myListView = (ListView) rootView.findViewById(R.id.myListView);
            strListView = getResources().getStringArray(R.array.Breakfast_list);
            ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, strListView);
            myListView.setAdapter(objAdapter);

            myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Object item = (Object) myListView.getItemAtPosition(position);
                    Intent intent = new Intent(getActivity(), Main2Activity.class);


                    String ingredients = "";
                    String instructions = "";
                    switch(item.toString()){
                        case "Cereal":
                            ingredients = getResources().getString(R.string.CerealIngredients);
                            instructions = getResources().getString(R.string.CerealInstructions);
                        break;
                        case "Porridge":
                            ingredients = getResources().getString(R.string.PorridgeIngredients);
                            instructions = getResources().getString(R.string.PorridgeInstructions);
                        break;
                        case "Scrambled Eggs":
                            ingredients = getResources().getString(R.string.ScrambledEggsIngredients);
                            instructions = getResources().getString(R.string.ScrambledEggsInstructions);
                            break;
                        case "French Toast":
                            ingredients = getResources().getString(R.string.FrenchToastIngredients);
                            instructions = getResources().getString(R.string.FrenchToastInstructions);
                            break;
                        case "Pancakes":
                            ingredients = getResources().getString(R.string.PancakesIngredients);
                            instructions = getResources().getString(R.string.PancakesInstructions);
                            break;
                        case "Waffles":
                            ingredients = getResources().getString(R.string.WafflesIngredients);
                            instructions = getResources().getString(R.string.WafflesInstructions);
                            break;
                        case "BLT":
                            ingredients = getResources().getString(R.string.BLTIngredients);
                            instructions = getResources().getString(R.string.BLTInstructions);
                            break;
                        case "Bagel with Cream Cheese":
                            ingredients = getResources().getString(R.string.BagelWithCreamCheeseIngredients);
                            instructions = getResources().getString(R.string.BagelWithCreamCheeseInstructions);
                            break;
                        case "Instant Coffee":
                            ingredients = getResources().getString(R.string.InstantCoffeeIngredients);
                            instructions = getResources().getString(R.string.InstantCoffeeInstructions);
                            break;
                    }

                    intent.putExtra("ItemName", item.toString());
                    intent.putExtra("ItemIngredients", ingredients);
                    intent.putExtra("ItemInstructions", instructions);
                    startActivity(intent);
            }


        });
        return rootView;
    }
}
