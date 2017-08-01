package com.example.bliss_000.recyclerviewtesting;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

/**
 * Created by bliss_000 on 7/30/2017.
 */

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder>{

    private List<Post> mPosts;
    // Store the context for easy access
    private Context mContext;

    public PostsAdapter(Context context, List<Post> posts) {
        mPosts = posts;
        mContext = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View postView = inflater.inflate(R.layout.item_post, parent, false);

        ViewHolder viewHolder = new ViewHolder(postView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Post post = mPosts.get(position);

        TextView dateView = holder.date;
        dateView.setText(post.getDate());

        TextView messageView = holder.message;
        messageView.setText(post.getMessage());

        TextView profileNameView = holder.profileName;
        profileNameView.setText(post.getUser());

        ImageView profilePic = holder.profile;
        Glide.with(mContext)
                .load(post.getProfileImageURL())
                .apply(RequestOptions.circleCropTransform())
                .into(profilePic);

        ImageView contentPic = holder.content;
        Glide.with(mContext)
                .load(post.getImageURL())
                .into(contentPic);
    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView message;
        public ImageView profile;
        public ImageView content;
        public TextView profileName;
        public TextView date;
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            message = (TextView) itemView.findViewById(R.id.Message);
            profile = (ImageView) itemView.findViewById(R.id.profilePicture);
            content = (ImageView) itemView.findViewById(R.id.postContent);
            profileName = (TextView) itemView.findViewById(R.id.profileName);
            date = (TextView) itemView.findViewById(R.id.postDate);
        }
    }
}
