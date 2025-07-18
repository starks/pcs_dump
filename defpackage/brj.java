package defpackage;

import com.google.fcp.client.http.HttpClientForNative;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brj extends HttpClientForNative.HttpRequestHandle {
    public final bvc a;
    public final fsc b;

    public brj(bvc bvcVar, fsc fscVar) {
        this.a = bvcVar;
        this.b = fscVar;
    }

    @Override // com.google.fcp.client.http.HttpClientForNative.HttpRequestHandle, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.S(new bks(this, 3, null));
    }

    @Override // com.google.fcp.client.http.HttpClientForNative.HttpRequestHandle
    public final byte[] getTotalSentReceivedBytes() {
        return (byte[]) this.b.R(new bri(this, 0));
    }
}
