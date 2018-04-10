package com.essalud.essalud.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.essalud.essalud.R;
import com.essalud.essalud.model.Picture;
import com.essalud.essalud.view.AboutUsActivity;
import com.essalud.essalud.view.AreasServicesActivity;
import com.essalud.essalud.view.LocationActivity;
import com.essalud.essalud.view.LoginActivity;
import com.essalud.essalud.view.OurStaffActivity;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;


public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;
    

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PictureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PictureViewHolder holder, final int position) {
        final Picture picture = pictures.get(position);
        holder.textupCard.setText(picture.getTextup());
        holder.textbottomCard.setText(picture.getTextbottom());
        holder.iconCard.setImageResource(picture.getIcon());
        holder.pictureCard.setImageResource(picture.getPicture());
        //holder.colorCard.setBackgroundColor(picture.getColor());
        holder.colorCard.setBackgroundResource(picture.getColor());
        holder.linearCard.setBackgroundResource(picture.getTransparentcolor());
        holder.contrastColor.setBackgroundResource(picture.getContrastcolor());
        holder.pictureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (position){
                    case 0:
                            Intent intent0 = new Intent(activity, AboutUsActivity.class);
                            activity.startActivity(intent0);
                            break;
                    case 1:
                            Intent intent1 = new Intent(activity, AreasServicesActivity.class);
                            activity.startActivity(intent1);
                            break;
                    case 2:
                        Intent intent2 = new Intent(activity, OurStaffActivity.class);
                        activity.startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(activity, LoginActivity.class);
                        activity.startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(activity, LocationActivity.class);
                        activity.startActivity(intent4);
                        break;
                }

            }
        });
        //Picasso.get().load(picture.getPicture()).into(holder.pictureCard);

    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{
        private ImageView pictureCard;
        private TextView textupCard;
        private TextView textbottomCard;
        private ImageView iconCard;
        private LinearLayout colorCard;
        private LinearLayout linearCard;
        private LinearLayout contrastColor;
        public PictureViewHolder(View itemView) {
            super(itemView);
            pictureCard = (ImageView) itemView.findViewById(R.id.pacienteCard);
            textupCard  = (TextView) itemView.findViewById(R.id.textupCard);
            textbottomCard=(TextView) itemView.findViewById(R.id.textbottomCard);
            iconCard    = (ImageView) itemView.findViewById(R.id.iconCard);
            colorCard   = (LinearLayout) itemView.findViewById(R.id.color_card);
            linearCard  = (LinearLayout) itemView.findViewById(R.id.linear_card);
            contrastColor = (LinearLayout) itemView.findViewById(R.id.contrastIconColor);
        }

    }
}
