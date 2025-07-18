package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager;
import defpackage.bpz;
import defpackage.bqm;
import defpackage.cbx;
import defpackage.cck;
import defpackage.ccr;
import defpackage.ccw;
import defpackage.cdc;
import defpackage.cdj;
import defpackage.cdk;
import defpackage.cdm;
import defpackage.dfa;
import defpackage.fsc;
import java.io.Closeable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeLCRunnerWrapper implements Closeable {
    public final cbx a;
    public final NativeLogManager b;
    public final bpz c;
    public final cdj d;
    public final String e;
    public final cck f;
    public final bqm g;
    public final cdm h;
    public final cdk i;
    public final dfa j;
    public final File k;
    public final File l;
    public final ccr m;
    public final cdc n;
    public final byte[] o;
    public final long p;
    public final fsc q;

    public NativeLCRunnerWrapper(cbx cbxVar, cdj cdjVar, String str, cck cckVar, fsc fscVar, bqm bqmVar, cdm cdmVar, cdk cdkVar, dfa dfaVar, bpz bpzVar, ccr ccrVar, File file, File file2, cdc cdcVar, byte[] bArr, long j) {
        this.a = cbxVar;
        this.q = fscVar;
        this.b = new ccw(bqmVar, str, dfaVar, fscVar);
        this.d = cdjVar;
        this.e = str;
        this.f = cckVar;
        this.g = bqmVar;
        this.h = cdmVar;
        this.i = cdkVar;
        this.j = dfaVar;
        this.c = bpzVar;
        this.m = ccrVar;
        this.k = file;
        this.l = file2;
        this.n = cdcVar;
        this.o = bArr;
        this.p = j;
    }

    public static native void runNative(NativeFLRunnerDeps nativeFLRunnerDeps, String str, NativeLogManager nativeLogManager, byte[] bArr, String str2, String str3, String str4, String str5, byte[] bArr2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
