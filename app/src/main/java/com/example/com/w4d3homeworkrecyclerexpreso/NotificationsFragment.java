package com.example.com.w4d3homeworkrecyclerexpreso;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends Fragment {

    private RecyclerView notificationRecyclerView;
    private ArrayList<Notification> notificationArrayList;
    private NotificationsAdapter notificationAdapter;

    public NotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        // 1. get a reference to recyclerView
        notificationRecyclerView = (RecyclerView) view.findViewById(R.id.a_notifications_recycler);
        // 2. set layoutManger
        notificationRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        // 3. Get data from database
        notificationArrayList = new ArrayList<>();
        notificationArrayList.add(new Notification("title09", "body1", "30/10/2016"));
        notificationArrayList.add(new Notification("title10", "body2", "30/10/2016"));
        notificationArrayList.add(new Notification("title11", "body3", "30/10/2016"));
        notificationArrayList.add(new Notification("title12", "body4", "30/10/2016"));
        notificationArrayList.add(new Notification("title13", "body5", "30/10/2016"));
        notificationArrayList.add(new Notification("title14", "body6", "30/10/2016"));
        notificationArrayList.add(new Notification("title15", "body7", "30/10/2016"));
        notificationArrayList.add(new Notification("title16", "body8", "30/10/2016"));
        notificationArrayList.add(new Notification("title17", "body9", "30/10/2016"));
        notificationArrayList.add(new Notification("title18", "body10", "30/10/2016"));
        notificationArrayList.add(new Notification("title19", "body11", "30/10/2016"));

        // 4. set adapter
        notificationAdapter = new NotificationsAdapter(notificationArrayList);
        notificationRecyclerView.setAdapter(notificationAdapter);
        notificationRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        notificationRecyclerView.setItemAnimator(new DefaultItemAnimator());
        notificationRecyclerView.addItemDecoration(new SimpleDecorator(getActivity(), LinearLayoutManager.VERTICAL));
        // 5. notify changes
        notificationAdapter.notifyDataSetChanged();

        return view;
    }

}
