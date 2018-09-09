package com.ulan.timetable.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.ulan.timetable.Adapters.WeekListAdapter;
import com.ulan.timetable.Utils.DbHelper;
import com.ulan.timetable.R;

public class ThursdayFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_thursday, container, false);
        DbHelper db = new DbHelper(getActivity());
        ListView listView = view.findViewById(R.id.thursdaylist);

        WeekListAdapter adapter = new WeekListAdapter(getActivity(), R.layout.adapter_listview_layout, db.getData("Thursday"));
        listView.setAdapter(adapter);
        return view;
    }
}