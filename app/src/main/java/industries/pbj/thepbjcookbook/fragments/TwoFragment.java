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

public class TwoFragment extends Fragment {
    private ListView myListView2;
    private String[] strListView;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        myListView2 = (ListView) rootView.findViewById(R.id.myListView2);
        strListView = getResources().getStringArray(R.array.Lunch_list);
        ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, strListView);
        myListView2.setAdapter(objAdapter);

        myListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object item = (Object) myListView2.getItemAtPosition(position);
                Intent intent = new Intent(getActivity(), Main2Activity.class);

                String ingredients = "";
                String instructions = "";
                String imageId = "";

                switch(item.toString()) {
                    case "Ham Sandwich":
                        ingredients = getResources().getString(R.string.HamSandwichIngredients);
                        instructions = getResources().getString(R.string.HamSandwichInstructions);
                        imageId = String.valueOf(R.drawable.ham_sandwich);
                        break;
                    case "Salad":
                        ingredients = getResources().getString(R.string.SaladIngredients);
                        instructions = getResources().getString(R.string.SaladInstructions);
                        imageId = String.valueOf(R.drawable.salad);
                        break;
                    case "Deli Sandwich":
                        ingredients = getResources().getString(R.string.DeliSandwichIngredients);
                        instructions = getResources().getString(R.string.DeliSandwichInstructions);
                        imageId = String.valueOf(R.drawable.deli_sandwich);
                        break;
                    case "Roast Beef Wrap":
                        ingredients = getResources().getString(R.string.RoastBeefWrapsIngredients);
                        instructions = getResources().getString(R.string.RoastBeefWrapsInstructions);
                        imageId = String.valueOf(R.drawable.roast_beef_wrap);
                        break;
                    case "Avocado Salad":
                        ingredients = getResources().getString(R.string.AvocadoSaladIngredients);
                        instructions = getResources().getString(R.string.AvocadoSaladInstructions);
                        imageId = String.valueOf(R.drawable.avocado_salad);
                        break;
                    case "Chicken Soup":
                        ingredients = getResources().getString(R.string.ChickenSoupIngredients);
                        instructions = getResources().getString(R.string.ChickenSoupInstructions);
                        imageId = String.valueOf(R.drawable.chicken_soup);
                        break;
                    case "Stew":
                        ingredients = getResources().getString(R.string.StewIngredients);
                        instructions = getResources().getString(R.string.StewInstructions);
                        imageId = String.valueOf(R.drawable.stew);
                        break;
                    case "Calzone":
                        ingredients = getResources().getString(R.string.CalzoneIngredients);
                        instructions = getResources().getString(R.string.CalzoneInstructions);
                        imageId = String.valueOf(R.drawable.calzone);
                        break;
                    case "Crispy Chicken Wrap":
                        ingredients = getResources().getString(R.string.CrispyChickenWrapIngredients);
                        instructions = getResources().getString(R.string.CrispyChickenWrapInstructions);
                        imageId = String.valueOf(R.drawable.crispy_chicken_wrap);
                        break;
                }

                intent.putExtra("ItemName", item.toString());
                intent.putExtra("ItemIngredients", ingredients);
                intent.putExtra("ItemInstructions", instructions);
                intent.putExtra("ItemImage", imageId);
                startActivity(intent);
            }
        });
        return rootView;

    }
}
