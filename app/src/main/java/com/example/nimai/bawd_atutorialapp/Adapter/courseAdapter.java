package com.example.nimai.bawd_atutorialapp.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nimai.bawd_atutorialapp.Model.Course;
import com.example.nimai.bawd_atutorialapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class courseAdapter extends RecyclerView.Adapter<courseAdapter.ViewHolder>{

    private CourseDate courseDate = new CourseDate();
    private OnItemClickListener itemClickListener;


    //private ArrayList<Course> courseArrayList;
    @NonNull
    @Override
    public courseAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int position) {

        View course_row = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.course_row,parent,false);
        return new ViewHolder(course_row);
    }

    @Override
    public void onBindViewHolder(final courseAdapter.ViewHolder viewHolder, int position) {

        final Context context = viewHolder.coursename.getContext();

        Course course = courseDate.courselist().get(position);
        viewHolder.coursename.setText(course.getCourseName());
        Picasso.with(context)
                .load(course.getImageResourceId(context))
                .into(viewHolder.courseImage);
        Picasso.with(viewHolder.coursename.getContext())
                .load(course.getImageResourceId(context))
                .into(viewHolder.Authorimage);

        Bitmap photo = BitmapFactory.decodeResource(context.getResources(),course.getImageResourceId(context));
        Palette.from(photo).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {

                int bgcolor = palette.getMutedColor(ContextCompat.getColor(context,android.R.color.black));
                viewHolder.coursename.setBackgroundColor(bgcolor);

            }
        });

    }

    @Override
    public int getItemCount() {
        return courseDate.courselist().size();
    }

    public void setOnClickListener(OnItemClickListener onItemClickListener){
        this.itemClickListener = onItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView coursename;
        public ImageView courseImage,Authorimage;
        public ViewHolder( View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            coursename = itemView.findViewById(R.id.coursename);
            courseImage = itemView.findViewById(R.id.courseimage);
            Authorimage = itemView.findViewById(R.id.authorname);
        }

        @Override
        public void onClick(View view) {
            itemClickListener.onItemClick(view,getAdapterPosition());

        }
    }
    public interface OnItemClickListener{
        void onItemClick(View view,int position);
    }
}
