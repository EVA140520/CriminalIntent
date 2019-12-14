package org.eva.criminalintent;


import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import static androidx.recyclerview.widget.RecyclerView.*;

public class ListRow extends ViewHolder {
    public ImageView mThumbnail;

    public ListRow(@NonNull View itemView) {
        super(itemView);
    }
}
