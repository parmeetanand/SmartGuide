package com.example.anandparmeetsingh.smartguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ParmeetSingh on 4/2/2017.
 */

public class Indoors extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.hT), getString(R.string.r4_5), getString(R.string.palatial),
                R.drawable.humayuntomb));
        words.add(new Word(getString(R.string.pQ), getString(R.string.r4_2), getString(R.string.riverside),
                R.drawable.puranqila));
        words.add(new Word(getString(R.string.pOI), getString(R.string.r4_6), getString(R.string.landmark),
                R.drawable.parliamentofindia));
        words.add(new Word(getString(R.string.nM), getString(R.string.r5), getString(R.string.largest),
                R.drawable.nationalmuseum));
        words.add(new Word(getString(R.string.sT), getString(R.string.r4_3), getString(R.string.elegant),
                R.drawable.saftarjungtomb));

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.recycler);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}
