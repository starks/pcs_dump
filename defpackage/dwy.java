package defpackage;

import com.google.fcp.client.http.HttpClientForNative;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwy extends HttpClientForNative {
    public final bss a;
    private final fsc b;

    public dwy(fsc fscVar, bss bssVar) {
        this.b = fscVar;
        this.a = bssVar;
    }

    @Override // com.google.fcp.client.http.HttpClientForNative
    public final /* bridge */ /* synthetic */ HttpClientForNative.HttpRequestHandle enqueueRequest(byte[] bArr) {
        return (dxe) this.b.R(new cdb(this, bArr, 2));
    }

    @Override // com.google.fcp.client.http.HttpClientForNative
    public final byte[] performRequests(Object[] objArr) {
        return (byte[]) this.b.R(new bri(objArr, 6));
    }

    @Override // com.google.fcp.client.http.HttpClientForNative, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
