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


                switch(item.toString()) {
                    case "":

                        break;
                }
            }
        });
        return rootView;
    }

}
