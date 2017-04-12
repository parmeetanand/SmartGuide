package com.example.anandparmeetsingh.smartguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TopSpots extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.rf), getString(R.string.r4_4), getString(R.string.iconic),
                R.drawable.redfort));
        words.add(new Word(getString(R.string.jM), getString(R.string.r4_4), getString(R.string.vast),
                R.drawable.jamamasjid));
        words.add(new Word(getString(R.string.rB), getString(R.string.r4_6), getString(R.string.president),
                R.drawable.rashtrapati));
        words.add(new Word(getString(R.string.jtM), getString(R.string.r4_1), getString(R.string.complex),
                R.drawable.jantarmanta));
        words.add(new Word(getString(R.string.gBS), getString(R.string.r4_7), getString(R.string.sikh),
                R.drawable.banglasahib));

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
