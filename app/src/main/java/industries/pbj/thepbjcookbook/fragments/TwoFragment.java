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


                switch(item.toString()) {
                    case "Ham Sandwich":
                        ingredients = getResources().getString(R.string.HamSandwichIngredients);
                        instructions = getResources().getString(R.string.HamSandwichInstructions);
                        break;
                    case "Salad":
                        ingredients = getResources().getString(R.string.SaladIngredients);
                        instructions = getResources().getString(R.string.SaladInstructions);
                        break;
                    case "Deli Sandwich":
                        ingredients = getResources().getString(R.string.DeliSandwichIngredients);
                        instructions = getResources().getString(R.string.DeliSandwichIngredients);
                        break;
                    case "Wraps":
                        ingredients = getResources().getString(R.string.WrapsIngredients);;
                        instructions = getResources().getString(R.string.WafflesInstructions);
                        break;
                    case "Avacodo Salad":
                        ingredients = getResources().getString(R.string.AvacodoSaladIngredients);
                        instructions = getResources().getString(R.string.AvacodoSaladInstructions);
                        break;
                    case "Soup":
                        ingredients = getResources().getString(R.string.SoupIngredients);
                        instructions = getResources().getString(R.string.SoupInstructions);
                        break;
                    case "Stew":
                        ingredients = getResources().getString(R.string.StewIngredients);
                        instructions = getResources().getString(R.string.StewInstructions);
                        break;
                    case "Calzone":
                        ingredients = getResources().getString(R.string.CalzoneIngredients);
                        instructions = getResources().getString(R.string.CalzoneInstructions);
                        break;
                    case "Crispy Chicken Wrap":
                        ingredients = getResources().getString(R.string.CrispyChickenWrapIngredients);
                        instructions = getResources().getString(R.string.CrispyChickenWrapInstructions);
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
