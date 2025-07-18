package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager;
import defpackage.bpv;
import defpackage.bpz;
import defpackage.bqm;
import defpackage.cbv;
import defpackage.cbx;
import defpackage.cck;
import defpackage.ccr;
import defpackage.ccw;
import defpackage.cdc;
import defpackage.cdf;
import defpackage.cdj;
import defpackage.cdk;
import defpackage.cdm;
import defpackage.dfa;
import defpackage.fsc;
import java.io.Closeable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeFLRunnerWrapper implements Closeable {
    public final cbx a;
    public final NativeLogManager b;
    public final bpz c;
    public final String d;
    public final File e;
    public final File f;
    public final cbv g;
    public final cdj h;
    public final String i;
    public final cck j;
    public final bqm k;
    public final cdm l;
    public final cdk m;
    public final dfa n;
    public final ccr o;
    public final cdc p;
    public final byte[] q;
    public final bpv r;
    public final long s;
    public final cdf t;
    public final byte[] u;
    public final fsc v;

    public NativeFLRunnerWrapper(cbx cbxVar, cdj cdjVar, String str, cck cckVar, fsc fscVar, bqm bqmVar, cdm cdmVar, cdk cdkVar, dfa dfaVar, bpz bpzVar, String str2, cbv cbvVar, ccr ccrVar, File file, File file2, cdc cdcVar, byte[] bArr, bpv bpvVar, long j, cdf cdfVar, byte[] bArr2) {
        this.a = cbxVar;
        this.v = fscVar;
        this.b = new ccw(bqmVar, str, dfaVar, fscVar);
        this.h = cdjVar;
        this.i = str;
        this.j = cckVar;
        this.k = bqmVar;
        this.l = cdmVar;
        this.m = cdkVar;
        this.n = dfaVar;
        this.o = ccrVar;
        this.e = file;
        this.f = file2;
        this.c = bpzVar;
        this.d = str2;
        this.g = cbvVar;
        this.p = cdcVar;
        this.q = bArr;
        this.r = bpvVar;
        this.s = j;
        this.t = cdfVar;
        this.u = bArr2;
    }

    public static native byte[] runNative(NativeFLRunnerDeps nativeFLRunnerDeps, String str, Object obj, NativeLogManager nativeLogManager, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, String str9);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
