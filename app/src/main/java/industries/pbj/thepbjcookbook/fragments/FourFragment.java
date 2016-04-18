package industries.pbj.thepbjcookbook.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import industries.pbj.thepbjcookbook.Main2Activity;
import industries.pbj.thepbjcookbook.R;

public class FourFragment extends Fragment {
    private ListView myListView4;
    private String[] strListView;
    public FourFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_four, container, false);
        myListView4 = (ListView) rootView.findViewById(R.id.myListView4);
        strListView = getResources().getStringArray(R.array.PBJ_list);
        ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, strListView);
        myListView4.setAdapter(objAdapter);

        myListView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object item = (Object) myListView4.getItemAtPosition(position);
                Intent intent = new Intent(getActivity(), Main2Activity.class);

                String ingredients = "";
                String instructions = "";
                String imageId = "";


                switch(item.toString()) {
                    case "PB+J Muffins":
                        ingredients = getResources().getString(R.string.PBJMuffinsIngredients);
                        instructions = getResources().getString(R.string.PBJMuffinsInstructions);
                        imageId = String.valueOf(R.drawable.pbj_muffins);
                        break;
                    case "PB+J Smoothie":
                        ingredients = getResources().getString(R.string.PBJSmoothieIngredients);
                        instructions = getResources().getString(R.string.PBJSmoothieInstructions);
                        imageId = String.valueOf(R.drawable.pbj_smoothie);
                        break;
                    case "PB+J Donuts":
                        ingredients = getResources().getString(R.string.PBJDonutsIngredients);
                        instructions = getResources().getString(R.string.PBJDonutsInstructions);
                        imageId = String.valueOf(R.drawable.pbj_donuts);
                        break;
                    case "PB+J Overnight Oats":
                        ingredients = getResources().getString(R.string.PBJOvernightOatsIngredients);
                        instructions = getResources().getString(R.string.PBJOvernightOatsInstructions);
                        imageId = String.valueOf(R.drawable.pbj_overnigh_oats);
                        break;
                    case "PB+J Granola":
                        ingredients = getResources().getString(R.string.PBJGranolaIngredients);
                        instructions = getResources().getString(R.string.PBJGranolaInstructions);
                        imageId = String.valueOf(R.drawable.pbj_granola);
                        break;
                    case "PB+J Sandwich":
                        ingredients = getResources().getString(R.string.PBJSandwichIngredients);
                        instructions = getResources().getString(R.string.PBJSandwichInstructions);
                        imageId = String.valueOf(R.drawable.pbj_sandwich);
                        break;
                    case "PB+J Cups":
                        ingredients = getResources().getString(R.string.PBJCupsIngredients);
                        instructions = getResources().getString(R.string.PBJCupsInstructions);
                        imageId = String.valueOf(R.drawable.pbj_cups);
                        break;
                    case "PB+J Waffle-Grilled Sandwich":
                        ingredients = getResources().getString(R.string.PBJWaffleGrilledSandwichIngredients);
                        instructions = getResources().getString(R.string.PBJWaffleGrilledSandwichInstructions);
                        imageId = String.valueOf(R.drawable.pbj_waffle_grilled_sandwich);
                        break;
                    case "PB+J Ice Cream Sandwiches":
                        ingredients = getResources().getString(R.string.PBJIceCreamSandwichesIngredients);
                        instructions = getResources().getString(R.string.PBJIceCreamSandwichesInstructions);
                        imageId = String.valueOf(R.drawable.pbj_ice_cream_sandwiches);
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
