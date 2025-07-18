package defpackage;

import android.content.res.Resources;
import android.text.format.Formatter;
import android.view.View;
import android.widget.TextView;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axg extends awe {
    public static final /* synthetic */ int s = 0;
    private final TextView t;
    private final TextView u;
    private final TextView v;

    public axg(View view) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.total_updates);
        this.u = (TextView) view.findViewById(R.id.total_upload_size);
        this.v = (TextView) view.findViewById(R.id.total_download_size);
    }

    @Override // defpackage.awe
    public final void C(awk awkVar) throws Resources.NotFoundException {
        axf axfVar = ((axh) awkVar).a;
        Resources resources = this.a.getContext().getResources();
        int i = axfVar.a;
        this.t.setText(resources.getQuantityString(R.plurals.summary_banner_updates, i, Integer.valueOf(i)));
        this.u.setText(Formatter.formatShortFileSize(this.a.getContext(), axfVar.b));
        this.v.setText(Formatter.formatShortFileSize(this.a.getContext(), axfVar.c));
    }
}
