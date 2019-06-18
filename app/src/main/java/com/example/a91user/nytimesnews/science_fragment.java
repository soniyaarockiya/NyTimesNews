package com.example.a91user.nytimesnews;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class science_fragment extends Fragment {

    private final static String API_KEY = "6WCs5uK0jCSNgvBRAbVEEqAC3yJ4ypG6";
    private RecyclerView myrecycler;
    private ApiInterface apiInterface;

    //private ProgressBar progressBar;

    private RecyclerViewAdapter adapter;


    public science_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_science, container, false);
        //progressBar = view.findViewById(R.id.progressbar_world);
        myrecycler = view.findViewById(R.id.recycler_science);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        // progressBar.setVisibility(View.VISIBLE);
        Call<MyPojo> call = apiInterface.getTopStoriesSci(API_KEY);


        call.enqueue(new Callback<MyPojo>() {
            @Override
            public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {

                if (response.isSuccessful()) {
                    List<Results> tempResults = Arrays.asList(response.body().getResults());
                    myrecycler.setLayoutManager(new LinearLayoutManager(getActivity()));


                    adapter = new RecyclerViewAdapter(getActivity(), tempResults);
                    myrecycler.setAdapter(adapter);
                    //progressBar.setVisibility(View.GONE);
                }


            }

            @Override
            public void onFailure(Call<MyPojo> call, Throwable t) {

                t.printStackTrace();

            }
        });


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
