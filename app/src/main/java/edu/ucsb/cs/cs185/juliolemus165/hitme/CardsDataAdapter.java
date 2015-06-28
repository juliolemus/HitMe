package edu.ucsb.cs.cs185.juliolemus165.hitme;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by julio on 6/27/15.
 */
public class CardsDataAdapter extends ArrayAdapter<String> {

    public CardsDataAdapter(Context context,int resource){
        super(context,resource);
    }

    @Override
    public View getView(int position, final View contentView, ViewGroup parent){
        TextView v = (TextView)contentView.findViewById(R.id.content);
        v.setText(getItem(position));
        return contentView;
    }

}
