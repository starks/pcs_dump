package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.miphone.astrea.settings.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bdr implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bdr(bds bdsVar, int i) {
        this.b = i;
        this.a = bdsVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2;
        int i3 = this.b;
        if (i3 == 0) {
            bdp bdpVar = (bdp) adapterView.getItemAtPosition(i);
            LicenseMenuActivity licenseMenuActivity = ((bds) this.a).b;
            if (licenseMenuActivity != null) {
                licenseMenuActivity.B(bdpVar);
                return;
            }
            return;
        }
        if (i3 == 1) {
            ((ho) this.a).d.setSelection(i);
            if (((ho) this.a).d.getOnItemClickListener() != null) {
                ho hoVar = (ho) this.a;
                hoVar.d.performItemClick(view, i, hoVar.b.getItemId(i));
            }
            ((jk) this.a).f();
            return;
        }
        if (i < 0) {
            jk jkVar = ((cpb) this.a).a;
            item = !jkVar.u() ? null : jkVar.e.getSelectedItem();
        } else {
            item = ((cpb) this.a).getAdapter().getItem(i);
        }
        cpb cpbVar = (cpb) this.a;
        cpbVar.setText(cpbVar.convertSelectionToString(item), false);
        AdapterView.OnItemClickListener onItemClickListener = ((cpb) this.a).getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                jk jkVar2 = ((cpb) this.a).a;
                view = jkVar2.u() ? jkVar2.e.getSelectedView() : null;
                Object obj = this.a;
                jk jkVar3 = ((cpb) obj).a;
                int iO = ((cpb) obj).a.o();
                j = !jkVar3.u() ? Long.MIN_VALUE : jkVar3.e.getSelectedItemId();
                i2 = iO;
            } else {
                i2 = i;
            }
            onItemClickListener.onItemClick(((cpb) this.a).a.e, view, i2, j);
        }
        ((cpb) this.a).a.f();
    }

    public bdr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
