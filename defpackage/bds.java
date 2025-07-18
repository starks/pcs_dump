package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.miphone.astrea.settings.licenses.LicenseMenuActivity;
import com.google.android.as.oss.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bds extends ab {
    public ArrayAdapter a;
    public LicenseMenuActivity b;

    @Override // defpackage.ab
    public final void N() {
        super.N();
        aak aakVarA = aak.a(y());
        aap aapVar = (aap) aakVarA;
        if (aapVar.b.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (aap.c(2)) {
            Objects.toString(aakVarA);
        }
        aal aalVarB = aapVar.b.b();
        if (aalVarB != null) {
            aalVarB.l();
            od odVar = aapVar.b.b;
            int iA = of.a(odVar.b, odVar.d, 54321);
            if (iA >= 0) {
                Object[] objArr = odVar.c;
                Object obj = objArr[iA];
                Object obj2 = oe.a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    odVar.a = true;
                }
            }
        }
    }

    @Override // defpackage.ab
    public final void O(View view, Bundle bundle) {
        ae aeVarY = y();
        this.a = new ArrayAdapter(aeVarY, R.layout.pcs_licenses_license, R.id.license, new ArrayList());
        aak aakVarA = aak.a(aeVarY);
        aap aapVar = (aap) aakVarA;
        if (aapVar.b.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        aal aalVarB = aapVar.b.b();
        if (aap.c(2)) {
            Objects.toString(aakVarA);
        }
        if (aalVarB == null) {
            try {
                ((aap) aakVarA).b.c = true;
                aar aarVar = new aar(y(), null);
                if (aarVar.getClass().isMemberClass() && !Modifier.isStatic(aarVar.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + aarVar);
                }
                aal aalVar = new aal(aarVar);
                if (aap.c(3)) {
                    aalVar.toString();
                }
                ((aap) aakVarA).b.b.e(54321, aalVar);
                aapVar.b.a();
                aalVar.m(aapVar.a, this);
            } catch (Throwable th) {
                aapVar.b.a();
                throw th;
            }
        } else {
            if (aap.c(3)) {
                Objects.toString(aalVarB);
            }
            aalVarB.m(aapVar.a, this);
        }
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.a);
        listView.setOnItemClickListener(new bdr(this, 0));
    }

    @Override // defpackage.ab
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.pcs_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.ab
    public final void c(Context context) {
        super.c(context);
        ae aeVarY = y();
        if (aeVarY instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity) aeVarY;
        }
    }

    @Override // defpackage.ab
    public final void f() {
        super.f();
        this.b = null;
    }
}
