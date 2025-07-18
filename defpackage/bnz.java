package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnz {
    public final Object a;
    public final Object b;

    public bnz(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public static String a(Context context, Throwable th) {
        boolean z = th instanceof bix;
        String string = th.toString();
        if (z) {
            Status status = ((bix) th).a;
            String name = th.getClass().getName();
            String strD = yt.d(status.e);
            String str = status.f;
            bho bhoVar = status.h;
            string = String.format("%s: %s: %s%s", name, strD, str, bhoVar == null ? "" : ", ".concat(String.valueOf(String.valueOf(bhoVar))));
        }
        return ayg.j(bnh.z(bnh.y(context, ayg.l(string, th), cqy.a)));
    }

    public static String f(String str) {
        return det.g.h(str.getBytes(StandardCharsets.UTF_8));
    }

    public static final boolean l(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public final void b(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.b) {
            map = new HashMap((Map) this.b);
        }
        synchronized (this.a) {
            map2 = new HashMap((Map) this.a);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).l(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((brb) entry2.getKey()).E(new bix(status));
            }
        }
    }

    public final SharedPreferences c() {
        return ((Context) this.b).getSharedPreferences("protected_download_persistent_state", 0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [djz, java.lang.Object] */
    public final djy d(String str) {
        return this.a.submit(new amq(this, str, 5));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [djz, java.lang.Object] */
    public final djy e(String str, bbc bbcVar) {
        return this.a.submit(new amy(this, str, bbcVar, 3));
    }

    public final void g(final Runnable runnable) {
        ((Choreographer) this.a).postFrameCallback(new Choreographer.FrameCallback() { // from class: ww
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void h(sx sxVar) {
        int i = sxVar.a;
        if (i != 0) {
            this.a.execute(new sp((un) this.b, i, 0));
        } else {
            Object obj = sxVar.b;
            this.a.execute(new o((un) this.b, (Typeface) obj, 13));
        }
    }

    public final KeyListener i(KeyListener keyListener) {
        if (l(keyListener) && !(keyListener instanceof xt)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new xt(keyListener);
            }
        }
        return keyListener;
    }

    public final InputConnection j(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof xr) ? new xr((TextView) ((bnz) this.b).b, inputConnection) : inputConnection;
    }

    public final void k(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.a).getContext().obtainStyledAttributes(attributeSet, dp.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            xw xwVar = (xw) ((bnz) this.b).a;
            if (xwVar.a != z) {
                xwVar.a = z;
                if (z) {
                    xm.b();
                    throw null;
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void m(ab abVar, Bundle bundle, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.m(abVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void n(ab abVar, boolean z) {
        abVar.getClass();
        ax axVar = (ax) this.b;
        Context context = axVar.l.c;
        ab abVar2 = axVar.n;
        if (abVar2 != null) {
            abVar2.B().v.n(abVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void o(ab abVar, Bundle bundle, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.o(abVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void p(ab abVar, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.p(abVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void q(ab abVar, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.q(abVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void r(ab abVar, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.r(abVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void s(ab abVar, boolean z) {
        abVar.getClass();
        ax axVar = (ax) this.b;
        Context context = axVar.l.c;
        ab abVar2 = axVar.n;
        if (abVar2 != null) {
            abVar2.B().v.s(abVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void t(ab abVar, Bundle bundle, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.t(abVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void u(ab abVar, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.u(abVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void v(ab abVar, Bundle bundle, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.v(abVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void w(ab abVar, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.w(abVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void x(ab abVar, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.x(abVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void y(ab abVar, View view, Bundle bundle, boolean z) {
        abVar.getClass();
        view.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.y(abVar, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void z(ab abVar, boolean z) {
        abVar.getClass();
        ab abVar2 = ((ax) this.b).n;
        if (abVar2 != null) {
            abVar2.B().v.z(abVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public bnz(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public bnz(Context context, djz djzVar) {
        this.b = context;
        this.a = djzVar;
    }

    public bnz(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public bnz(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public bnz(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public bnz(ax axVar) {
        this.b = axVar;
        this.a = new CopyOnWriteArrayList();
    }

    public bnz(File file, String str) {
        this.a = file;
        bdg bdgVar = bxv.a;
        this.b = new File(bdg.e(file, str));
    }

    public bnz(List list, List list2) {
        int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.a)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.b)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public bnz(byte[] bArr) {
        this.b = new AtomicBoolean(false);
        this.a = new AtomicLong(0L);
    }

    public bnz(EditText editText, byte[] bArr) {
        this.a = editText;
        this.b = new bnz(editText);
    }

    public bnz() {
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public bnz(char[] cArr) {
        this.a = Choreographer.getInstance();
        this.b = Looper.myLooper();
    }

    public bnz(EditText editText) {
        this.b = editText;
        xw xwVar = new xw(editText);
        this.a = xwVar;
        editText.addTextChangedListener(xwVar);
        editText.setEditableFactory(xq.a());
    }
}
