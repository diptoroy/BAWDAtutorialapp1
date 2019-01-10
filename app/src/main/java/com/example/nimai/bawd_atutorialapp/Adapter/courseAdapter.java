package com.example.nimai.bawd_atutorialapp.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class courseAdapter extends RecyclerView.Adapter<courseAdapter.ViewHolder> {
    @NonNull
    @Override
    public courseAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int position) {
        return null;
    }

    @Override
    public void onBindViewHolder(courseAdapter.ViewHolder viewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder( View itemView) {
            super(itemView);
        }
    }
}
