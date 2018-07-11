package tools.wpfang.recycleview01;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalHolder> {
    String anim_name[], anim_desc[];
    int anim_images[];
    Context context;
    LayoutInflater mInflator;
    AnimalHolder animalHolder;
    public AnimalAdapter(Context ctx,String name[],String desc[], int img[])
    {
        context=ctx;
        anim_name=name;
        anim_desc=desc;
        anim_images=img;
        mInflator=LayoutInflater.from(ctx);

    }
    @NonNull
    @Override
    public AnimalAdapter.AnimalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView=mInflator.inflate(R.layout.row_layout, parent,false);

        return new AnimalHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalAdapter.AnimalHolder holder, int position) {
        holder.mTextView1.setText(anim_name[position]);
        holder.mTextView2.setText(anim_desc[position]);
        holder.mImageView.setImageResource(anim_images[position]);
    }

    @Override
    public int getItemCount() {
        return anim_name.length;
    }

    public class AnimalHolder extends RecyclerView.ViewHolder {
        TextView mTextView1;
        TextView mTextView2;
        ImageView mImageView;

        public AnimalHolder(View itemView) {
            super(itemView);
            mTextView1=itemView.findViewById(R.id.anim_name);
            mTextView2=itemView.findViewById(R.id.anim_desc);
            mImageView=itemView.findViewById(R.id.imageView);

        }
    }
}
