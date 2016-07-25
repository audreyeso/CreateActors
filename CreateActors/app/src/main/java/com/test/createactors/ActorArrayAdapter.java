package com.test.createactors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jon Kim on 7/25/16.
 */
public class ActorArrayAdapter extends BaseAdapter{
    private ArrayList<Actor> data;
    private Context context;

    public ActorArrayAdapter(ArrayList<Actor> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.custom_layout_adapter, viewGroup, false);
        }
        TextView nameTextView = (TextView) view.findViewById(R.id.name_view);
        TextView dobTextView = (TextView) view.findViewById(R.id.DOB_view);
        TextView oscarsTextView = (TextView) view.findViewById(R.id.oscars_won_view);

        Actor curActor = data.get(i);

        nameTextView.setText(curActor.getName());
        dobTextView.setText(curActor.getDob());
        oscarsTextView.setText(curActor.getOscars());



        return null;
    }
}
