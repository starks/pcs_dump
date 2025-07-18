package com.google.android.libraries.micore.learning.base;

import defpackage.cbw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ErrorStatusException extends Exception {
    public final cbw a;

    public ErrorStatusException(int i, String str) {
        this((Throwable) null, new cbw(i, str));
    }

    public static ErrorStatusException a(int i, Throwable th) {
        return new ErrorStatusException(th, new cbw(i, null));
    }

    public static ErrorStatusException b(int i, String str, Object... objArr) {
        return new ErrorStatusException((Throwable) null, cbw.a(i, str, objArr));
    }

    public static ErrorStatusException c(int i, Throwable th, String str, Object... objArr) {
        return new ErrorStatusException(th, cbw.a(i, str, objArr));
    }

    public ErrorStatusException(Throwable th, cbw cbwVar) {
        super(cbwVar.toString(), th);
        this.a = cbwVar;
    }
}
