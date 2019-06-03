package com.example.viewspkears;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolderClass> {
    Context context;
    String names[];
    String titles[];
    int[] images;

    public Adapter(Context context, String names[], String titles[], int[] images) {

        this.context = context;
        this.names = names;
        this.titles = titles;
        this.images = images;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup, false);
        ViewHolderClass holderClass = new ViewHolderClass(view);
        return holderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, int position) {
        viewHolderClass.getName().setText(names[position]);
        viewHolderClass.getTitle().setText(titles[position]);
        viewHolderClass.getImageView().setImageResource(images[position]);


    }

    @Override
    public int getItemCount() {
        return names.length;
    }


    public static class ViewHolderClass extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView title;
        private ImageView imageView;
        private View currentView;

        public ViewHolderClass(View itemView) {
            super(itemView);
            this.currentView = itemView;
        }

        public TextView getName() {
            if (name == null)
                name = currentView.findViewById(R.id.nameID);
            return name;
        }

        public TextView getTitle() {
            if (title == null)
                title = currentView.findViewById(R.id.titleID);
            return title;
        }

        public ImageView getImageView() {
            if (imageView == null)
                imageView = currentView.findViewById(R.id.image);
            return imageView;
        }
    }
}
