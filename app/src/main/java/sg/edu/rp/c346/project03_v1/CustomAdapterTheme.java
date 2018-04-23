package sg.edu.rp.c346.project03_v1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterTheme extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<Theme> themeList;
    public CustomAdapterTheme(Context context, int resource,
                         ArrayList<Theme> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        themeList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        Theme currentItem = themeList.get(position);
        TextView tvTheme = rowView.findViewById(R.id.textViewTheme);
        if(currentItem != null) {
            tvTheme.setText(currentItem.getTheme());
        }
        return rowView;
    }
}
