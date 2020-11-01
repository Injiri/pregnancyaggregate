package com.hackathon.sailors.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hackathon.sailors.R;
import com.hackathon.sailors.models.DataEntryForm;

import java.util.ArrayList;

public class SubmitedFormsAdapter extends RecyclerView.Adapter<SubmitedFormsAdapter.SubmitedFormsHolder> {
    ArrayList<DataEntryForm> completedDataEntryForms;

    public SubmitedFormsAdapter(ArrayList<DataEntryForm> completedDataEntryForms) {
        this.completedDataEntryForms = completedDataEntryForms;
    }

    @NonNull
    @Override
    public SubmitedFormsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.completed_form_item_view, parent, false);
        return new SubmitedFormsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubmitedFormsHolder holder, int position) {
        String formIndex = String.valueOf(++position);
        String completedFormName = completedDataEntryForms.get(position).getName();
        if (!completedFormName.isEmpty()) {
            holder.formIndex.setText(formIndex);
            holder.completedFormName.setText(completedFormName);
        }
    }

    @Override
    public int getItemCount() {
        return completedDataEntryForms.size();
    }

    public class SubmitedFormsHolder extends RecyclerView.ViewHolder {
        TextView completedFormName, formIndex;

        public SubmitedFormsHolder(@NonNull View itemView) {
            super(itemView);
            formIndex = itemView.findViewById(R.id.item_index);
            completedFormName = itemView.findViewById(R.id.completed_form_name);
        }
    }
}
