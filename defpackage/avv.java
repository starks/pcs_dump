package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avv extends awe {
    public static final /* synthetic */ int s = 0;
    private final TextView t;

    public avv(View view) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.date_time_divider);
    }

    @Override // defpackage.awe
    public final void C(awk awkVar) {
        this.t.setText(((avu) awkVar).a);
    }
}
