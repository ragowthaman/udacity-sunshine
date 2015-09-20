package com.data2sense.gramasamy.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // inflate the root view from fragmetn_main.xml, so content can be injected into it
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Create a arrayList with daily values as string
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Today - Sunny 88/63");
        arrayList.add("monday - Sunny 88/63");
        arrayList.add("tuesday - Sunny 88/63");
        arrayList.add("Wednesday - Sunny 88/63");
        arrayList.add("Thursday - Sunny 88/63");
        arrayList.add("Friday - Sunny 88/63");
        arrayList.add("Saturday - Sunny 88/63");
        arrayList.add("Next Sunday - Sunny 88/63");

        // create an arrayAdapter that links the data (arrayList) and its view (list_item_forecast.xml)
        // list_item_forecast contains layout about how each element in arrayList needs to be displayed
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecaset_textview, arrayList);


        // Now bind this to a List view where items in arrayList will be displayed per layout in list_item_forecast
        final ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(arrayAdapter);

        return rootView;
        //return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
