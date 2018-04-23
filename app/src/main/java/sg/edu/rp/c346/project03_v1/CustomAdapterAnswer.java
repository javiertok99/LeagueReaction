package sg.edu.rp.c346.project03_v1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterAnswer extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<Answer> ansList;
    public CustomAdapterAnswer(Context context, int resource,
                              ArrayList<Answer> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        ansList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        Answer currentItem = ansList.get(position);
        ImageView ivChamp = rowView.findViewById(R.id.ivChamp);
        TextView tvName = rowView.findViewById(R.id.tvName);
        ImageView ivUlt = rowView.findViewById(R.id.ivUlt);
        if(currentItem != null) {
            int strChamp = currentItem.getChampion();
            int strUlt = currentItem.getUltimate();
            ivChamp.setImageResource(strChamp);

            tvName.setText(currentItem.getName());
            ivUlt.setImageResource(strUlt);
        }
        return rowView;
    }

    protected static int getResourceID
            (final String resName, final String resType, final Context ctx) {
        final int ResourceID =
                ctx.getResources().getIdentifier(resName, resType,
                        ctx.getApplicationInfo().packageName);
        if (ResourceID == 0) {
            throw new IllegalArgumentException
                    (
                            "No resource string found with name " + resName
                    );
        } else {
            return ResourceID;
        }
    }

}
