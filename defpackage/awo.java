package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awo extends awe {
    public static final /* synthetic */ int s = 0;
    private final TextView t;
    private final TextView u;

    public awo(View view) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.network_usage_item_info_title);
        this.u = (TextView) view.findViewById(R.id.network_usage_item_info_body);
    }

    @Override // defpackage.awe
    public final void C(awk awkVar) {
        awn awnVar = (awn) awkVar;
        this.t.setText(awnVar.a);
        this.u.setText(awnVar.b);
    }
}
