package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fb implements AdapterView.OnItemClickListener, fr {
    Context a;
    public LayoutInflater b;
    ff c;
    public ExpandedMenuView d;
    final int e = R.layout.abc_list_menu_item_layout;
    public fq f;
    public fa g;

    public fb(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.g == null) {
            this.g = new fa(this);
        }
        return this.g;
    }

    @Override // defpackage.fr
    public final void c(Context context, ff ffVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = ffVar;
        fa faVar = this.g;
        if (faVar != null) {
            faVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.fr
    public final void d(ff ffVar, boolean z) {
        fq fqVar = this.f;
        if (fqVar != null) {
            fqVar.a(ffVar, z);
        }
    }

    @Override // defpackage.fr
    public final void e(fq fqVar) {
        throw null;
    }

    @Override // defpackage.fr
    public final boolean g() {
        return false;
    }

    @Override // defpackage.fr
    public final boolean h(fy fyVar) {
        if (!fyVar.hasVisibleItems()) {
            return false;
        }
        fg fgVar = new fg(fyVar);
        ff ffVar = fgVar.a;
        sx sxVar = new sx(ffVar.a);
        fgVar.c = new fb(((cg) sxVar.b).a);
        fb fbVar = fgVar.c;
        fbVar.f = fgVar;
        fgVar.a.g(fbVar);
        ListAdapter listAdapterA = fgVar.c.a();
        cg cgVar = (cg) sxVar.b;
        cgVar.o = listAdapterA;
        cgVar.p = fgVar;
        View view = ffVar.g;
        if (view != null) {
            cgVar.e = view;
        } else {
            sxVar.e(ffVar.f);
            sxVar.g(ffVar.e);
        }
        ((cg) sxVar.b).m = fgVar;
        fgVar.b = sxVar.d();
        fgVar.b.setOnDismissListener(fgVar);
        WindowManager.LayoutParams attributes = fgVar.b.getWindow().getAttributes();
        attributes.type = AIFeature.Id.LLM_CPU_GEM_SAMSUNG;
        attributes.flags |= 131072;
        fgVar.b.show();
        fq fqVar = this.f;
        if (fqVar == null) {
            return true;
        }
        fqVar.b(fyVar);
        return true;
    }

    @Override // defpackage.fr
    public final boolean i(fh fhVar) {
        return false;
    }

    @Override // defpackage.fr
    public final boolean j(fh fhVar) {
        return false;
    }

    @Override // defpackage.fr
    public final void l() {
        fa faVar = this.g;
        if (faVar != null) {
            faVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.g.getItem(i), this, 0);
    }
}
