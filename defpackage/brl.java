package defpackage;

import com.google.fcp.client.http.HttpClientForNative;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brl extends HttpClientForNative {
    public final bsp a;
    public final fsc b;

    public brl(fsc fscVar, bsp bspVar) {
        this.b = fscVar;
        this.a = bspVar;
    }

    @Override // com.google.fcp.client.http.HttpClientForNative
    public final /* bridge */ /* synthetic */ HttpClientForNative.HttpRequestHandle enqueueRequest(byte[] bArr) {
        return (brj) this.b.R(new cdb(this, bArr, 1));
    }

    @Override // com.google.fcp.client.http.HttpClientForNative
    public final byte[] performRequests(Object[] objArr) {
        return (byte[]) this.b.R(new bri(objArr, 1));
    }

    @Override // com.google.fcp.client.http.HttpClientForNative, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
