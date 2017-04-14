package com.example.jisan.firebase;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Jisan on 3/27/2017.
 */

public class InfoViewHolder extends RecyclerView.ViewHolder {

    public TextView nameTextView;
    public TextView idTextView;

    public InfoViewHolder(View itemView){
        super(itemView);
        nameTextView = (TextView) itemView.findViewById(R.id.nameT);
        idTextView = (TextView) itemView.findViewById(R.id.idT);

    }
}
