package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abp extends ab implements abw, abu, abv, aav {
    public RecyclerView a;
    private boolean ab;
    private abx c;
    private boolean d;
    private final abl b = new abl(this);
    private int ac = R.layout.preference_list_fragment;
    private final Handler ad = new abk(this, Looper.getMainLooper());
    private final Runnable ae = new ls(this, 10, null);

    @Override // defpackage.ab
    public final void O(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenL;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenL = l()) != null) {
            preferenceScreenL.t(bundle2);
        }
        if (this.d) {
            m();
        }
        this.ab = true;
    }

    @Override // defpackage.aav
    public final Preference aT(CharSequence charSequence) {
        abx abxVar = this.c;
        if (abxVar == null) {
            return null;
        }
        return abxVar.e(charSequence);
    }

    @Override // defpackage.ab
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = s().obtainStyledAttributes(null, acb.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.ac = typedArrayObtainStyledAttributes.getResourceId(0, this.ac);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(s());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.ac, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!s().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.T(new LinearLayoutManager(s()));
            recyclerView.R(new abz(recyclerView));
        }
        if (recyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.a = recyclerView;
        recyclerView.ap(this.b);
        abl ablVar = this.b;
        if (drawable != null) {
            ablVar.b = drawable.getIntrinsicHeight();
        } else {
            ablVar.b = 0;
        }
        ablVar.a = drawable;
        ablVar.d.a.G();
        if (dimensionPixelSize != -1) {
            abl ablVar2 = this.b;
            ablVar2.b = dimensionPixelSize;
            ablVar2.d.a.G();
        }
        this.b.c = z;
        if (this.a.getParent() == null) {
            viewGroup2.addView(this.a);
        }
        this.ad.post(this.ae);
        return viewInflate;
    }

    @Override // defpackage.abu
    public final void al(Preference preference) {
        x abfVar;
        boolean zA = false;
        for (ab abVar = this; !zA && abVar != null; abVar = abVar.C) {
            if (abVar instanceof abm) {
                zA = ((abm) abVar).a();
            }
        }
        if (!zA) {
            r();
        }
        if (zA) {
            return;
        }
        if (!((y() instanceof abm) && ((abm) y()).a()) && B().e("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.s;
                abfVar = new aay();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                abfVar.V(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.s;
                abfVar = new abc();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                abfVar.V(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.s;
                abfVar = new abf();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                abfVar.V(bundle3);
            }
            abfVar.ai(this);
            abfVar.l(B(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // defpackage.abv
    public final void am(PreferenceScreen preferenceScreen) {
        boolean zA = false;
        for (ab abVar = this; !zA && abVar != null; abVar = abVar.C) {
            if (abVar instanceof abo) {
                zA = ((abo) abVar).a();
            }
        }
        if (!zA) {
            r();
        }
        if (zA || !(y() instanceof abo)) {
            return;
        }
        ((abo) y()).a();
    }

    public final void an(int i, String str) throws Resources.NotFoundException {
        abx abxVar;
        PreferenceScreen preferenceScreen;
        abx abxVar2 = this.c;
        if (abxVar2 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextS = s();
        abxVar2.f(true);
        abt abtVar = new abt(contextS, abxVar2);
        XmlResourceParser xml = abtVar.a.getResources().getXml(i);
        try {
            Preference preferenceA = abtVar.a(xml);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceA;
            preferenceScreen2.y(abxVar2);
            abxVar2.f(false);
            Preference preference = preferenceScreen2;
            if (str != null) {
                Preference preferenceL = preferenceScreen2.l(str);
                boolean z = preferenceL instanceof PreferenceScreen;
                preference = preferenceL;
                if (!z) {
                    throw new IllegalArgumentException(a.z(str, "Preference object with key ", " is not a PreferenceScreen"));
                }
            }
            PreferenceScreen preferenceScreen3 = (PreferenceScreen) preference;
            if (preferenceScreen3 == null || preferenceScreen3 == (preferenceScreen = (abxVar = this.c).b)) {
                return;
            }
            if (preferenceScreen != null) {
                preferenceScreen.z();
            }
            abxVar.b = preferenceScreen3;
            this.d = true;
            if (!this.ab || this.ad.hasMessages(1)) {
                return;
            }
            this.ad.obtainMessage(1).sendToTarget();
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    @Override // defpackage.abw
    public boolean ao(Preference preference) {
        boolean zA = false;
        if (preference.u == null) {
            return false;
        }
        for (ab abVar = this; !zA && abVar != null; abVar = abVar.C) {
            if (abVar instanceof abn) {
                zA = ((abn) abVar).a();
            }
        }
        if (!zA) {
            r();
        }
        if (!zA && (!(y() instanceof abn) || !((abn) y()).a())) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            ax axVarB = B();
            Bundle bundleP = preference.p();
            ai aiVarG = axVarB.g();
            z().getClassLoader();
            ab abVarB = aiVarG.b(preference.u);
            abVarB.V(bundleP);
            abVarB.ai(this);
            bf bfVarK = new d(axVarB).k(((View) D().getParent()).getId(), abVarB);
            if (!bfVarK.k) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            bfVarK.j = true;
            bfVarK.l = null;
            bfVarK.j();
        }
        return true;
    }

    public abstract void ap(String str);

    @Override // defpackage.ab
    public final void d(Bundle bundle) {
        super.d(bundle);
        TypedValue typedValue = new TypedValue();
        s().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        s().getTheme().applyStyle(i, false);
        abx abxVar = new abx(s());
        this.c = abxVar;
        abxVar.e = this;
        Bundle bundle2 = this.l;
        ap(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // defpackage.ab
    public final void e() {
        this.ad.removeCallbacks(this.ae);
        this.ad.removeMessages(1);
        if (this.d) {
            this.a.S(null);
            PreferenceScreen preferenceScreenL = l();
            if (preferenceScreenL != null) {
                preferenceScreenL.z();
            }
        }
        this.a = null;
        super.e();
    }

    @Override // defpackage.ab
    public final void g(Bundle bundle) {
        PreferenceScreen preferenceScreenL = l();
        if (preferenceScreenL != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenL.u(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.ab
    public final void h() {
        super.h();
        abx abxVar = this.c;
        abxVar.c = this;
        abxVar.d = this;
    }

    @Override // defpackage.ab
    public final void i() {
        super.i();
        abx abxVar = this.c;
        abxVar.c = null;
        abxVar.d = null;
    }

    public final PreferenceScreen l() {
        abx abxVar = this.c;
        if (abxVar == null) {
            return null;
        }
        return abxVar.b;
    }

    final void m() {
        PreferenceScreen preferenceScreenL = l();
        if (preferenceScreenL != null) {
            this.a.S(new abs(preferenceScreenL));
            preferenceScreenL.x();
        }
    }
}
