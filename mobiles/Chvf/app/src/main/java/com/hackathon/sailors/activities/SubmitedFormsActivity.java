package com.hackathon.sailors.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SimpleAdapter;

import com.hackathon.sailors.R;
import com.hackathon.sailors.adapters.SubmitedFormsAdapter;
import com.hackathon.sailors.models.DataEntryForm;
import com.hackathon.sailors.remoteAccess.RetrofitServiceInstance;

import java.util.ArrayList;

public class SubmitedFormsActivity extends AppCompatActivity {
    RecyclerView submitedFormsRv;
    ArrayList<DataEntryForm> completedDataEntryForms = new ArrayList<>();
    RecyclerView.Adapter submitedFormAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submited_forms);
        submitedFormsRv = findViewById(R.id.submited_forms_rv);
        submitedFormAdapter = new SubmitedFormsAdapter(completedDataEntryForms);
        submitedFormsRv.setLayoutManager(new LinearLayoutManager(this));
        submitedFormsRv.setAdapter(submitedFormAdapter);
        submitedFormAdapter.notifyDataSetChanged();
    }
}