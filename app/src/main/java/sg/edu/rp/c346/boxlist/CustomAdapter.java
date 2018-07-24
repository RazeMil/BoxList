package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import sg.edu.rp.c346.boxlist.BoxListItem;
import sg.edu.rp.c346.boxlist.R;

/**
 * Created by andy_tao on 6/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<BoxListItem> BoxList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<BoxListItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        BoxList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.
        TextView tvBlue = rowView.findViewById(R.id.textViewBl);
        TextView tvOrange= rowView.findViewById(R.id.textViewO);
        TextView tvBrown = rowView.findViewById(R.id.textViewBr);
        ImageView ivColor = rowView.findViewById(R.id.imageViewColor);
        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        BoxListItem currentItem = BoxList.get(position);
        if(currentItem.isBlue()){
            ivColor.setImageResource(R.drawable.blue_box);
        } else if(currentItem.isOrange()){
            ivColor.setImageResource(R.drawable.orange_box);
        } else {
            ivColor.setImageResource(R.drawable.brown_box);
        }
        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}
