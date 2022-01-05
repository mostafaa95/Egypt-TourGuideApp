package com.example.android.egypt;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AswanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AswanFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AswanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AswanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AswanFragment newInstance(String param1, String param2) {
        AswanFragment fragment = new AswanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.nubian), R.drawable.anubian));
        places.add(new Place(getString(R.string.unfinished), R.drawable.aunfinished));
        places.add(new Place(getString(R.string.elephantine), R.drawable.alephentine));
        places.add(new Place(getString(R.string.kitcher), R.drawable.akitcher));
        places.add(new Place(getString(R.string.aga), R.drawable.aga));
        places.add(new Place(getString(R.string.qubbet), R.drawable.aqubbet));
        places.add(new Place(getString(R.string.botanical), R.drawable.abotanical));

        // Inflate current View object in places_list.xml
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        // Return current View object with the data
        return rootView;
    }
}