package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqf {
    public Uri b;
    public Uri c;
    public bqi d;
    public long e;
    public bqp f;
    public Map g;
    private String h;
    private int i;
    private boolean j;
    private String k;
    private Uri m;
    public int a = 0;
    private byte[] l = new byte[0];

    public final bqg a() {
        Bundle bundle;
        String str = this.h;
        int i = this.i;
        boolean z = this.j;
        String str2 = this.k;
        int i2 = this.a;
        Uri uri = this.b;
        bqi bqiVar = this.d;
        long j = this.e;
        Uri uri2 = this.c;
        bqp bqpVar = this.f;
        byte[] bArr = this.l;
        Uri uri3 = this.m;
        Map map = this.g;
        if (map == null) {
            bundle = Bundle.EMPTY;
        } else {
            Bundle bundle2 = new Bundle();
            for (String str3 : map.keySet()) {
                String str4 = str;
                bundle2.putParcelable(str3, (Parcelable) map.get(str3));
                map = map;
                str = str4;
            }
            bundle = bundle2;
        }
        return new bqg(str, i, z, str2, i2, uri, bqiVar, j, uri2, bqpVar, bArr, uri3, bundle, null);
    }

    public final void b(int i) {
        clq.v(bqg.b(i));
        if (this.b != null) {
            throw new IllegalArgumentException("Attestation is not supported for local computation.");
        }
        this.a = i;
    }

    public final void c(byte[] bArr) {
        bArr.getClass();
        this.l = Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(String str) {
        str.getClass();
        clq.v(!str.isEmpty());
        this.k = str;
    }

    public final void e(int i, boolean z) {
        this.i = i;
        this.j = z;
    }

    @Deprecated
    public final void f(Uri uri, Uri uri2, Uri uri3) {
        bqg.a(uri);
        bqg.a(uri2);
        bqg.a(uri3);
        this.a = 3;
        this.b = uri;
        this.m = uri2;
        this.c = uri3;
    }

    public final void g(String str) {
        str.getClass();
        clq.v(!str.isEmpty());
        this.h = str;
    }
}
