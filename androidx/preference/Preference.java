package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a;
import defpackage.abg;
import defpackage.abh;
import defpackage.abi;
import defpackage.abs;
import defpackage.abw;
import defpackage.abx;
import defpackage.aca;
import defpackage.acb;
import defpackage.bot;
import defpackage.gc;
import defpackage.ul;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Preference implements Comparable {
    public int A;
    public int B;
    public PreferenceGroup C;
    public abi D;
    public abs E;
    public bot F;
    private boolean G;
    private boolean H;
    private boolean I;
    private List J;
    private boolean K;
    private abh L;
    private final View.OnClickListener M;
    private Bundle a;
    private boolean b;
    private boolean c;
    private String d;
    private Object e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    public final Context j;
    public abx k;
    public long l;
    public boolean m;
    public int n;
    public CharSequence o;
    public CharSequence p;
    public int q;
    public Drawable r;
    public String s;
    public Intent t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Preference(Context context) {
        this(context, null);
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void A() {
        Intent intent;
        abw abwVar;
        if (K() && this.c) {
            c();
            bot botVar = this.F;
            if (botVar != null) {
                ((PreferenceGroup) botVar.a).Q(Integer.MAX_VALUE);
                ((abs) botVar.b).i();
                return;
            }
            abx abxVar = this.k;
            if ((abxVar == null || (abwVar = abxVar.c) == null || !abwVar.ao(this)) && (intent = this.t) != null) {
                this.j.startActivity(intent);
            }
        }
    }

    public final void B() {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        Preference preferenceQ = q(this.d);
        if (preferenceQ != null) {
            if (preferenceQ.J == null) {
                preferenceQ.J = new ArrayList();
            }
            preferenceQ.J.add(this);
            M(preferenceQ.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.d + "\" not found for preference \"" + this.s + "\" (title: \"" + ((Object) this.o) + "\"");
    }

    public final void C(int i) {
        Drawable drawableT = a.t(this.j, i);
        if (this.r != drawableT) {
            this.r = drawableT;
            this.q = 0;
            d();
        }
        this.q = i;
    }

    public final void D(int i) {
        if (i != this.n) {
            this.n = i;
            w();
        }
    }

    public final void E(abi abiVar) {
        this.D = abiVar;
        d();
    }

    public void F(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.o)) {
            return;
        }
        this.o = charSequence;
        d();
    }

    public final void G(SharedPreferences.Editor editor) {
        if (this.k.a) {
            return;
        }
        editor.apply();
    }

    public final void H() {
        Preference preferenceQ;
        List list;
        String str = this.d;
        if (str == null || (preferenceQ = q(str)) == null || (list = preferenceQ.J) == null) {
            return;
        }
        list.remove(this);
    }

    protected final boolean I(boolean z) {
        return !L() ? z : this.k.d().getBoolean(this.s, z);
    }

    public final boolean J() {
        return !TextUtils.isEmpty(this.s);
    }

    public boolean K() {
        return this.b && this.f && this.g;
    }

    protected final boolean L() {
        return this.k != null && this.w && J();
    }

    public final void M(boolean z) {
        if (this.f == z) {
            this.f = !z;
            v(j());
            d();
        }
    }

    public final void N(boolean z) {
        if (this.g == z) {
            this.g = !z;
            v(j());
            d();
        }
    }

    protected final void O(String str) {
        if (L() && !TextUtils.equals(str, r(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putString(this.s, str);
            G(editorB);
        }
    }

    public final void P() {
        if (this.c) {
            this.c = false;
            d();
        }
    }

    public void a(aca acaVar) {
        Integer numValueOf;
        View view = acaVar.a;
        view.setOnClickListener(this.M);
        view.setId(0);
        TextView textView = (TextView) acaVar.C(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceM = m();
            if (TextUtils.isEmpty(charSequenceM)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceM);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) acaVar.C(R.id.title);
        if (textView2 != null) {
            CharSequence charSequence = this.o;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.G) {
                    textView2.setSingleLine(this.H);
                }
                if (!this.c && K() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) acaVar.C(R.id.icon);
        if (imageView != null) {
            int i = this.q;
            if (i != 0 || this.r != null) {
                if (this.r == null) {
                    this.r = a.t(this.j, i);
                }
                Drawable drawable = this.r;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.r != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(true != this.y ? 8 : 4);
            }
        }
        View viewC = acaVar.C(com.google.android.as.oss.R.id.icon_frame);
        if (viewC == null) {
            viewC = acaVar.C(R.id.icon_frame);
        }
        if (viewC != null) {
            if (this.r != null) {
                viewC.setVisibility(0);
            } else {
                viewC.setVisibility(true == this.y ? 4 : 8);
            }
        }
        if (this.I) {
            k(view, K());
        } else {
            k(view, true);
        }
        boolean z = this.c;
        view.setFocusable(z);
        view.setClickable(z);
        acaVar.u = this.h;
        acaVar.v = this.i;
        boolean z2 = this.z;
        if (z2 && this.L == null) {
            this.L = new abh(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.L : null);
        view.setLongClickable(z2);
        if (!z2 || z) {
            return;
        }
        view.setBackground(null);
    }

    public long aL() {
        return this.l;
    }

    public void b(View view) {
        A();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.n;
        int i2 = preference.n;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.o;
        CharSequence charSequence2 = preference.o;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.o.toString());
    }

    protected void d() {
        int iIndexOf;
        abs absVar = this.E;
        if (absVar == null || (iIndexOf = absVar.a.indexOf(this)) == -1) {
            return;
        }
        absVar.b.c(iIndexOf, 1, this);
    }

    protected Parcelable e() {
        this.K = true;
        return abg.EMPTY_STATE;
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    protected void g(Parcelable parcelable) {
        this.K = true;
        if (parcelable != abg.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public boolean j() {
        return !K();
    }

    public CharSequence m() {
        abi abiVar = this.D;
        return abiVar != null ? abiVar.a(this) : this.p;
    }

    protected final int o(int i) {
        return !L() ? i : this.k.d().getInt(this.s, i);
    }

    public final Bundle p() {
        if (this.a == null) {
            this.a = new Bundle();
        }
        return this.a;
    }

    protected final Preference q(String str) {
        abx abxVar = this.k;
        if (abxVar == null) {
            return null;
        }
        return abxVar.e(str);
    }

    protected final String r(String str) {
        return !L() ? str : this.k.d().getString(this.s, str);
    }

    public final Set s(Set set) {
        return !L() ? set : this.k.d().getStringSet(this.s, set);
    }

    public void t(Bundle bundle) {
        Parcelable parcelable;
        if (!J() || (parcelable = bundle.getParcelable(this.s)) == null) {
            return;
        }
        this.K = false;
        g(parcelable);
        if (!this.K) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.o;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceM = m();
        if (!TextUtils.isEmpty(charSequenceM)) {
            sb.append(charSequenceM);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u(Bundle bundle) {
        if (J()) {
            this.K = false;
            Parcelable parcelableE = e();
            if (!this.K) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableE != null) {
                bundle.putParcelable(this.s, parcelableE);
            }
        }
    }

    public void v(boolean z) {
        List list = this.J;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).M(z);
        }
    }

    public final void w() {
        abs absVar = this.E;
        if (absVar != null) {
            absVar.i();
        }
    }

    public void x() {
        B();
    }

    public final void y(abx abxVar) {
        this.k = abxVar;
        if (!this.m) {
            this.l = abxVar.a();
        }
        if (L()) {
            abx abxVar2 = this.k;
            if ((abxVar2 != null ? abxVar2.d() : null).contains(this.s)) {
                h(null);
                return;
            }
        }
        Object obj = this.e;
        if (obj != null) {
            h(obj);
        }
    }

    public void z() {
        H();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ul.r(context, com.google.android.as.oss.R.attr.preferenceStyle, R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.n = Integer.MAX_VALUE;
        this.b = true;
        this.c = true;
        this.w = true;
        this.f = true;
        this.g = true;
        this.x = true;
        this.h = true;
        this.i = true;
        this.H = true;
        this.I = true;
        this.A = com.google.android.as.oss.R.layout.preference;
        this.M = new gc(this, 3);
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.g, i, i2);
        this.q = ul.t(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.s = ul.w(typedArrayObtainStyledAttributes, 26, 6);
        this.o = ul.v(typedArrayObtainStyledAttributes, 34, 4);
        this.p = ul.v(typedArrayObtainStyledAttributes, 33, 7);
        this.n = ul.A(typedArrayObtainStyledAttributes, 28, 8);
        this.u = ul.w(typedArrayObtainStyledAttributes, 22, 13);
        this.A = ul.t(typedArrayObtainStyledAttributes, 27, 3, com.google.android.as.oss.R.layout.preference);
        this.B = ul.t(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.b = ul.x(typedArrayObtainStyledAttributes, 21, 2, true);
        this.c = ul.x(typedArrayObtainStyledAttributes, 30, 5, true);
        this.w = ul.x(typedArrayObtainStyledAttributes, 29, 1, true);
        this.d = ul.w(typedArrayObtainStyledAttributes, 19, 10);
        this.h = ul.x(typedArrayObtainStyledAttributes, 16, 16, this.c);
        this.i = ul.x(typedArrayObtainStyledAttributes, 17, 17, this.c);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.e = f(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.e = f(typedArrayObtainStyledAttributes, 11);
        }
        this.I = ul.x(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.G = zHasValue;
        if (zHasValue) {
            this.H = ul.x(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.y = ul.x(typedArrayObtainStyledAttributes, 24, 15, false);
        this.x = ul.x(typedArrayObtainStyledAttributes, 25, 25, true);
        this.z = ul.x(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected void c() {
    }

    protected void h(Object obj) {
    }
}
