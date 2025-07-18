package defpackage;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqh {
    public Object a;
    public Object b;

    public eqh(byte[] bArr) {
        this.b = null;
        this.a = dos.c;
    }

    public static String g(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static ThreadFactory m(eqh eqhVar) {
        Object obj = eqhVar.a;
        Object obj2 = eqhVar.b;
        return new dkj(Executors.defaultThreadFactory(), (String) obj, obj != null ? new AtomicLong(0L) : null, (Boolean) obj2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void a(epg epgVar) {
        this.b.add(epgVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void b(Enum r2, Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
    }

    public final dot c() throws GeneralSecurityException {
        Object obj = this.b;
        if (obj == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.a != null) {
            return new dot(((Integer) obj).intValue(), (dos) this.a);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void d(int i) throws InvalidAlgorithmParameterException {
        if (i != 32 && i != 48 && i != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final dml e() throws GeneralSecurityException {
        Object obj = this.a;
        if (obj == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.b != null) {
            return new dml(((Integer) obj).intValue(), (dmk) this.b);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void f(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void h(String str) {
        g(str, 0);
        this.a = str;
    }

    public final void i() throws IOException {
        k();
    }

    public final void j(List list) {
        OutputStream outputStream = (OutputStream) dcr.z(list);
        if (outputStream instanceof cia) {
            this.b = (cia) outputStream;
            this.a = (OutputStream) list.get(0);
        }
    }

    public final void k() throws IOException {
        if (this.b == null) {
            throw new chy("Cannot sync underlying stream");
        }
        ((OutputStream) this.a).flush();
        ((cia) this.b).b();
    }

    public final biy l() {
        if (this.a == null) {
            this.a = new zl();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new biy((zl) this.a, (Looper) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final exo n() {
        return new exo(DesugarCollections.unmodifiableMap(this.a), DesugarCollections.unmodifiableMap(this.b));
    }

    public eqh(byte[] bArr, byte[] bArr2) {
        this.a = null;
        this.b = null;
    }

    public eqh(char[] cArr) {
        this.a = null;
        this.b = dmk.c;
    }

    public eqh(char[] cArr, byte[] bArr) {
    }

    public eqh() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public eqh(String str) {
        this.b = new ArrayList();
        this.a = str;
    }
}
