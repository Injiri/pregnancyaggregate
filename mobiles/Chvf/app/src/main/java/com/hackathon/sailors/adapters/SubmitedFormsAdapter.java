package com.hackathon.sailors.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class SubmitedFormsAdapter extends RecyclerView.Adapter<SubmitedFormsAdapter.SubmitedFormsHolder> {
    @NonNull
    @Override
    public SubmitedFormsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SubmitedFormsHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class SubmitedFormsHolder extends RecyclerView.ViewHolder {
        public SubmitedFormsHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
