package id.eudeka.samplecustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class BeautyView extends LinearLayout {

    public BeautyView(Context context) {
        super(context);
        init(context, null);
    }

    public BeautyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public BeautyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public BeautyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, @Nullable AttributeSet set) {

        View view = inflate(context, R.layout.beauty_item, this);

        ImageView imageView = (ImageView) view.findViewById(R.id.foto);
        TextView textView = (TextView) view.findViewById(R.id.nama);

        TypedArray ta = getContext().obtainStyledAttributes(set, R.styleable.BeautyView);

        imageView.setImageDrawable(ta.getDrawable(R.styleable.BeautyView_foto));
        textView.setText(ta.getString(R.styleable.BeautyView_nama));

        ta.recycle();


    }
}
