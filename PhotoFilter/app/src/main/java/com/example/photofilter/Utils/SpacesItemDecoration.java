package com.example.photofilter.Utils;

import android.graphics.Rect;
import android.view.View;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public SpacesItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        if(parent.getChildAdapterPosition(view) == state.getItemCount()-1)
        {
            outRect.left = space;
            outRect.right = 0;
        }
        else
        {
            outRect.left = 0;
            outRect.right = space;
        }
    }
}
