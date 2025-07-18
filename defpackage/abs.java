package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abs extends jr {
    public List a;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Runnable i = new ls(this, 11, null);
    private final Handler h = new Handler(Looper.getMainLooper());

    public abs(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.E = this;
        this.f = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            g(((PreferenceScreen) preferenceGroup).g);
        } else {
            g(true);
        }
        h();
    }

    private final List j(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            Preference preferenceN = preferenceGroup.n(i2);
            if (preferenceN.x) {
                if (!l(preferenceGroup) || i < preferenceGroup.f) {
                    arrayList.add(preferenceN);
                } else {
                    arrayList2.add(preferenceN);
                }
                if (preferenceN instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceN;
                    if (!preferenceGroup2.R()) {
                        continue;
                    } else {
                        if (l(preferenceGroup) && l(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : j(preferenceGroup2)) {
                            if (!l(preferenceGroup) || i < preferenceGroup.f) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (l(preferenceGroup) && i > preferenceGroup.f) {
            aaz aazVar = new aaz(preferenceGroup.j, arrayList2, preferenceGroup.aL());
            aazVar.F = new bot(this, preferenceGroup);
            arrayList.add(aazVar);
        }
        return arrayList;
    }

    private final void k(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceN = preferenceGroup.n(i);
            list.add(preferenceN);
            abr abrVar = new abr(preferenceN);
            if (!this.g.contains(abrVar)) {
                this.g.add(abrVar);
            }
            if (preferenceN instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceN;
                if (preferenceGroup2.R()) {
                    k(list, preferenceGroup2);
                }
            }
            preferenceN.E = this;
        }
    }

    private static final boolean l(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f != Integer.MAX_VALUE;
    }

    @Override // defpackage.jr
    public final int a() {
        return this.a.size();
    }

    public final Preference b(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.a.get(i);
    }

    @Override // defpackage.jr
    public final int c(int i) {
        abr abrVar = new abr(b(i));
        int iIndexOf = this.g.indexOf(abrVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        List list = this.g;
        int size = list.size();
        list.add(abrVar);
        return size;
    }

    @Override // defpackage.jr
    public final /* bridge */ /* synthetic */ km d(ViewGroup viewGroup, int i) {
        abr abrVar = (abr) this.g.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, acb.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = a.t(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(abrVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = abrVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new aca(viewInflate);
    }

    @Override // defpackage.jr
    public final /* bridge */ /* synthetic */ void e(km kmVar, int i) {
        aca acaVar = (aca) kmVar;
        View view = acaVar.a;
        Preference preferenceB = b(i);
        Drawable background = view.getBackground();
        Drawable drawable = acaVar.s;
        if (background != drawable) {
            acaVar.a.setBackground(drawable);
        }
        TextView textView = (TextView) acaVar.C(R.id.title);
        if (textView != null && acaVar.t != null && !textView.getTextColors().equals(acaVar.t)) {
            textView.setTextColor(acaVar.t);
        }
        preferenceB.a(acaVar);
    }

    @Override // defpackage.jr
    public final long f(int i) {
        if (this.c) {
            return b(i).aL();
        }
        return -1L;
    }

    public final void h() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).E = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        k(arrayList, this.e);
        this.a = j(this.e);
        abx abxVar = this.e.k;
        this.b.a();
        for (Preference preference : this.f) {
        }
    }

    public final void i() {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }
}
