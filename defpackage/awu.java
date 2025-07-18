package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.as.oss.R;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awu extends awe {
    public static final /* synthetic */ int s = 0;
    private final TextView t;
    private final TextView u;
    private final TextView v;
    private final avs w;

    public awu(View view, avs avsVar) {
        super(view);
        this.w = avsVar;
        this.t = (TextView) view.findViewById(R.id.usage_item_mechanism_name);
        this.u = (TextView) view.findViewById(R.id.usage_item_feature_name);
        this.v = (TextView) view.findViewById(R.id.usage_item_description);
    }

    @Override // defpackage.awe
    public final void C(awk awkVar) {
        aww awwVar = (aww) awkVar;
        aux auxVarA = awwVar.a();
        Optional optionalD = this.w.d(auxVarA);
        Optional optionalB = this.w.b(auxVarA);
        this.u.setText((CharSequence) optionalD.orElseThrow(new awq(auxVarA, 2)));
        this.v.setText((CharSequence) optionalB.orElseThrow(new awq(auxVarA, 3)));
        Instant instantF = awwVar.f();
        czn cznVar = awt.a;
        this.t.setText(String.format("%s • %s", DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault()).format(instantF), this.w.j(auxVarA)));
    }
}
