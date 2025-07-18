package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import j$.util.Optional;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayo {
    public final Object a;
    public final Object b;

    public ayo(all allVar, ali aliVar) {
        this.b = allVar;
        this.a = aliVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cta, java.lang.Object] */
    public final elu a(axi axiVar) {
        return (elu) this.a.b(axiVar);
    }

    public final Optional b() {
        return (Optional) this.b;
    }

    public final void c() {
        synchronized (this) {
            ((AtomicInteger) this.b).decrementAndGet();
            if (((AtomicInteger) this.b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean d() {
        synchronized (this) {
            if (((AtomicBoolean) this.a).get()) {
                return false;
            }
            ((AtomicInteger) this.b).incrementAndGet();
            return true;
        }
    }

    public final void e(km kmVar) {
        lo loVarA = (lo) ((oc) this.a).get(kmVar);
        if (loVarA == null) {
            Object obj = this.a;
            loVarA = lo.a();
            ((oc) obj).put(kmVar, loVarA);
        }
        loVarA.a |= 1;
    }

    public final void f(long j, km kmVar) {
        ((nz) this.b).f(j, kmVar);
    }

    public final void g() {
        ((oc) this.a).clear();
        ((nz) this.b).e();
    }

    public final void h(km kmVar) {
        lo loVar = (lo) ((oc) this.a).get(kmVar);
        if (loVar == null) {
            return;
        }
        loVar.a &= -2;
    }

    public final void i(km kmVar) {
        int iA = ((nz) this.b).a();
        while (true) {
            iA--;
            if (iA < 0) {
                break;
            }
            if (kmVar == ((nz) this.b).d(iA)) {
                nz nzVar = (nz) this.b;
                Object[] objArr = nzVar.c;
                Object obj = objArr[iA];
                Object obj2 = oa.a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    nzVar.a = true;
                }
            }
        }
        lo loVar = (lo) ((oc) this.a).remove(kmVar);
        if (loVar != null) {
            lo.b(loVar);
        }
    }

    public final boolean j(km kmVar) {
        lo loVar = (lo) ((oc) this.a).get(kmVar);
        return (loVar == null || (loVar.a & 1) == 0) ? false : true;
    }

    public final tz k(km kmVar, int i) {
        lo loVar;
        tz tzVar;
        int iC = ((oc) this.a).c(kmVar);
        if (iC >= 0 && (loVar = (lo) ((oc) this.a).g(iC)) != null) {
            int i2 = loVar.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                loVar.a = i3;
                if (i == 4) {
                    tzVar = loVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    tzVar = loVar.d;
                }
                if ((i3 & 12) == 0) {
                    ((oc) this.a).e(iC);
                    lo.b(loVar);
                }
                return tzVar;
            }
        }
        return null;
    }

    public final void l(km kmVar, tz tzVar) {
        lo loVarA = (lo) ((oc) this.a).get(kmVar);
        if (loVarA == null) {
            Object obj = this.a;
            loVarA = lo.a();
            ((oc) obj).put(kmVar, loVarA);
        }
        loVarA.d = tzVar;
        loVarA.a |= 8;
    }

    public final void m(km kmVar, tz tzVar) {
        lo loVarA = (lo) ((oc) this.a).get(kmVar);
        if (loVarA == null) {
            Object obj = this.a;
            loVarA = lo.a();
            ((oc) obj).put(kmVar, loVarA);
        }
        loVarA.c = tzVar;
        loVarA.a |= 4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ln] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ln] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ln] */
    public final View n(int i, int i2, int i3, int i4) {
        ?? r0 = this.a;
        int iD = r0.d();
        int iC = r0.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            ?? r4 = this.a;
            View viewE = r4.e(i5);
            ((lm) this.b).c(iD, iC, r4.b(viewE), this.a.a(viewE));
            ((lm) this.b).b();
            ((lm) this.b).a(i3);
            if (((lm) this.b).d()) {
                return viewE;
            }
            ((lm) this.b).b();
            ((lm) this.b).a(i4);
            int i6 = 1;
            if (true == ((lm) this.b).d()) {
                view = viewE;
            }
            if (i2 <= i) {
                i6 = -1;
            }
            i5 += i6;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ln] */
    public final boolean o(View view) {
        Object obj = this.b;
        ?? r1 = this.a;
        ((lm) obj).c(r1.d(), r1.c(), r1.b(view), r1.a(view));
        ((lm) this.b).b();
        ((lm) this.b).a(24579);
        return ((lm) this.b).d();
    }

    public final void p(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((TextView) this.b).getContext().obtainStyledAttributes(attributeSet, dp.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((uo) ((brb) this.a).a).e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void q(boolean z) {
        ((uo) ((brb) this.a).a).d(z);
    }

    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        return ((uo) ((brb) this.a).a).g(inputFilterArr);
    }

    public ayo(TextView textView) {
        this.b = textView;
        this.a = new brb(textView);
    }

    public ayo(ln lnVar) {
        this.a = lnVar;
        this.b = new lm();
    }

    public ayo(mq mqVar, mu muVar) {
        this.b = mqVar;
        this.a = muVar;
    }

    public ayo(add addVar) {
        this.a = addVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.getClass();
        this.b = setNewSetFromMap;
    }

    public ayo(cxg cxgVar, Optional optional) {
        this.b = optional;
        this.a = new csv().a(new csw(new ayn(cxgVar, 0)));
    }

    public ayo(byte[] bArr) {
        this.a = new oc();
        this.b = new nz();
    }

    public ayo() {
        this.b = new AtomicInteger(0);
        this.a = new AtomicBoolean(false);
    }
}
