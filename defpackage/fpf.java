package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.SparseIntArray;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpf {
    public Object a;
    public final Object b;

    public fpf(bht bhtVar) {
        this.b = new SparseIntArray();
        aso.F(bhtVar);
        this.a = bhtVar;
    }

    public static /* synthetic */ void g(dkp dkpVar, dki dkiVar, djy djyVar, djy djyVar2, dje djeVar) {
        if (dkpVar.isDone()) {
            dkiVar.f(djyVar);
        } else if (djyVar2.isCancelled() && djeVar.compareAndSet(djd.NOT_RUN, djd.CANCELLED)) {
            dkpVar.cancel(false);
        }
    }

    public final int a() {
        return ((flg) this.b).a;
    }

    public final fpg b() {
        synchronized (this) {
        }
        return null;
    }

    public final fpg c(int i) {
        boolean z = fmd.a;
        throw null;
    }

    public final boolean d() {
        return a() == 0;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    public final void e(String str, String str2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
            }
        }
        while (true) {
            ekf ekfVar = (ekf) this.b;
            if (i >= ekfVar.a.size()) {
                ekfVar.a.add(str);
                ekfVar.a.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((String) ekfVar.a.get(i))) {
                    ekfVar.a.remove(i);
                    ekfVar.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    public final djy f(dir dirVar, Executor executor) {
        executor.getClass();
        final dje djeVar = new dje(executor, this);
        djc djcVar = new djc(djeVar, dirVar, 0);
        final dki dkiVar = new dki();
        final djy djyVar = (djy) ((AtomicReference) this.b).getAndSet(dkiVar);
        final dkp dkpVar = new dkp(djcVar);
        djyVar.c(dkpVar, djeVar);
        final djy djyVarD = cnx.D(dkpVar);
        Runnable runnable = new Runnable() { // from class: djb
            @Override // java.lang.Runnable
            public final void run() {
                fpf.g(dkpVar, dkiVar, djyVar, djyVarD, djeVar);
            }
        };
        djyVarD.c(runnable, diy.a);
        dkpVar.c(runnable, diy.a);
        return djyVarD;
    }

    public final void h() {
        synchronized (this.b) {
            ((SparseIntArray) this.b).clear();
        }
    }

    public final int i(int i) {
        int i2;
        synchronized (this.b) {
            i2 = ((SparseIntArray) this.b).get(i, -1);
        }
        return i2;
    }

    public fpf(Context context) {
        this.a = new chv();
        clq.o(context != null, "Context cannot be null", new Object[0]);
        this.b = context.getApplicationContext();
    }

    public fpf(byte[] bArr, byte[] bArr2) {
        this.a = new Uri.Builder().scheme("file").authority("").path("/");
        int i = cxc.d;
        this.b = new cwy();
    }

    public fpf(short[] sArr) {
        this.b = new AtomicReference(dju.a);
        this.a = new euw();
    }

    public fpf(char[] cArr) {
        this.b = new ekf((char[]) null, (byte[]) null);
    }

    public fpf(byte[] bArr) {
        this();
    }

    public fpf() {
        this.b = fjp.t(0);
    }
}
