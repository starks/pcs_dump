package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hl implements DialogInterface.OnClickListener, hq {
    ck a;
    final /* synthetic */ hr b;
    private ListAdapter c;
    private CharSequence d;

    public hl(hr hrVar) {
        this.b = hrVar;
    }

    @Override // defpackage.hq
    public final int a() {
        return 0;
    }

    @Override // defpackage.hq
    public final int b() {
        return 0;
    }

    @Override // defpackage.hq
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.hq
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.hq
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.hq
    public final void f() {
        ck ckVar = this.a;
        if (ckVar != null) {
            ckVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.hq
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.hq
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.hq
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.hq
    public final void j(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.hq
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.hq
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        sx sxVar = new sx(this.b.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            sxVar.g(charSequence);
        }
        ListAdapter listAdapter = this.c;
        hr hrVar = this.b;
        Object obj = sxVar.b;
        int selectedItemPosition = hrVar.getSelectedItemPosition();
        cg cgVar = (cg) obj;
        cgVar.o = listAdapter;
        cgVar.p = this;
        cgVar.u = selectedItemPosition;
        cgVar.t = true;
        ck ckVarD = sxVar.d();
        this.a = ckVarD;
        ListView listView = ckVarD.a.f;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, i, this.c.getItemId(i));
        }
        f();
    }

    @Override // defpackage.hq
    public final boolean u() {
        ck ckVar = this.a;
        if (ckVar != null) {
            return ckVar.isShowing();
        }
        return false;
    }
}
