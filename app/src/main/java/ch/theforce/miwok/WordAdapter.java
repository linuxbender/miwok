package ch.theforce.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private final int activityColor;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects, @NonNull int activityColor) {
        super(context, R.layout.list_item, objects);
        this.activityColor = activityColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get current Item
        Word currentWord = getItem(position);

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.detail);
        linearLayout.setBackgroundResource(this.activityColor);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.lang_eng);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.lang_miwok);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageResourceId);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
