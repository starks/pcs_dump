package defpackage;

import com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps;
import com.google.android.libraries.micore.learning.training.util.StatusOr;
import com.google.fcp.client.http.HttpClientForNative;
import java.io.Closeable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdg implements NativeFLRunnerDeps, Closeable {
    public final cbx a;
    public final cdj b;
    public final String c;
    public final String d;
    public final cck e;
    public final bqm f;
    public final cdm g;
    public final cdk h;
    public final ccu i;
    public final boolean j;
    public final long k;
    public final Object l = new Object();
    public final byte[] m;
    public final double n;
    public final cdf o;
    public dfa p;
    private final File q;
    private final File r;
    private final cdc s;
    private final byte[] t;
    private final fsc u;

    public cdg(bpz bpzVar, cbx cbxVar, cdj cdjVar, String str, String str2, cck cckVar, bqm bqmVar, cdm cdmVar, cdk cdkVar, dfa dfaVar, ccr ccrVar, File file, File file2, fsc fscVar, boolean z, cdc cdcVar, byte[] bArr, long j, cdf cdfVar, byte[] bArr2) {
        this.a = cbxVar;
        this.b = cdjVar;
        this.c = str;
        this.d = str2;
        this.e = cckVar;
        this.f = bqmVar;
        this.g = cdmVar;
        this.h = cdkVar;
        this.p = dfaVar;
        this.i = new ccu(ccrVar, fscVar, bpzVar.bq());
        this.q = file;
        this.r = file2;
        this.u = fscVar;
        this.j = z;
        this.s = cdcVar;
        this.m = bArr;
        this.k = j;
        this.n = bpzVar.y(str2);
        this.o = cdfVar;
        this.t = bArr2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.u.S(new bks(this.i, 14, null));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final StatusOr createExampleIterator(byte[] bArr) {
        return (StatusOr) this.u.R(new cda(this, bArr, dzi.a.toByteArray()));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final StatusOr createExampleIteratorWithContext(byte[] bArr, byte[] bArr2) {
        return (StatusOr) this.u.R(new cda(this, bArr, bArr2));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final HttpClientForNative createHttpClient() {
        return (HttpClientForNative) this.s.a();
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final byte[] getAccessPolicyEndorsementOptionsBytes() {
        return this.t;
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final String getBaseDir() {
        File file = this.q;
        file.getClass();
        return (String) this.u.R(new bri(file, 4));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final String getCacheDir() {
        File file = this.r;
        file.getClass();
        return (String) this.u.R(new bri(file, 4));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final boolean onTaskCompleted(byte[] bArr) {
        return ((Boolean) this.u.R(new cdb(this, bArr, 0))).booleanValue();
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final void publishEvent(byte[] bArr) {
        this.u.S(new bkd(this, bArr, 20));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final boolean trainingConditionsSatisfied() {
        return ((Boolean) this.u.R(new bri(this, 3))).booleanValue();
    }
}
