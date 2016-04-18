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


public class ThreeFragment extends Fragment {
    private ListView myListView3;
    private String[] strListView;
    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        myListView3 = (ListView) rootView.findViewById(R.id.myListView3);
        strListView = getResources().getStringArray(R.array.Dinner_list);
        ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, strListView);
        myListView3.setAdapter(objAdapter);

        myListView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object item = (Object) myListView3.getItemAtPosition(position);
                Intent intent = new Intent(getActivity(), Main2Activity.class);

                String ingredients = "";
                String instructions = "";
                String imageId = "";

                switch(item.toString()) {
                    case "Fish and Chips":
                        ingredients = getResources().getString(R.string.FishAndChipsIngredients);
                        instructions = getResources().getString(R.string.FishAndChipsInstructions);
                        imageId = String.valueOf(R.drawable.fish_chips);
                        break;
                    case "Roast Beef":
                        ingredients = getResources().getString(R.string.RoastBeefIngredients);
                        instructions = getResources().getString(R.string.RoastBeefInstructions);
                        imageId = String.valueOf(R.drawable.roast_beef);
                        break;
                    case "Ham Roast":
                        ingredients = getResources().getString(R.string.HamRoastIngredients);
                        instructions = getResources().getString(R.string.HamRoastInstructions);
                        imageId = String.valueOf(R.drawable.ham_roast);
                        break;
                    case "Burger":
                        ingredients = getResources().getString(R.string.HamRoastIngredients);
                        instructions = getResources().getString(R.string.HamRoastInstructions);
                        imageId = String.valueOf(R.drawable.burger);
                        break;
                    case "Pasta":
                        ingredients = getResources().getString(R.string.PastaIngredients);
                        instructions = getResources().getString(R.string.PastaInstructions);
                        imageId = String.valueOf(R.drawable.pasta);
                        break;
                    case "Tuna Casserole":
                        ingredients = getResources().getString(R.string.TunaCasseroleIngredients);
                        instructions = getResources().getString(R.string.TunaCasseroleInstructions);
                        imageId = String.valueOf(R.drawable.tuna_casserole);
                        break;
                    case "Chili":
                        ingredients = getResources().getString(R.string.ChiliIngredients);
                        instructions = getResources().getString(R.string.ChiliInstructions);
                        imageId = String.valueOf(R.drawable.chili);
                        break;
                    case "T-Bone Steak":
                        ingredients = getResources().getString(R.string.TBoneSteakIngredients);
                        instructions = getResources().getString(R.string.TBoneSteakInstructions);
                        imageId = String.valueOf(R.drawable.tbone_steak);
                        break;
                    case "Chicken Wings":
                        ingredients = getResources().getString(R.string.ChickenWingsIngredients);
                        instructions = getResources().getString(R.string.ChickenWingsInstructions);
                        imageId = String.valueOf(R.drawable.chicken_wings);
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
