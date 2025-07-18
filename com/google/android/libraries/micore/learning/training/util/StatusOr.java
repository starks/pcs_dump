package com.google.android.libraries.micore.learning.training.util;

import defpackage.cbw;
import defpackage.clq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StatusOr {
    private final Object a;
    private final cbw b;

    public StatusOr(Object obj, cbw cbwVar) {
        clq.v((cbwVar == null) ^ (obj == null));
        this.a = obj;
        this.b = cbwVar;
    }

    public int getCode() {
        cbw cbwVar = this.b;
        if (cbwVar == null) {
            return 0;
        }
        return cbwVar.a;
    }

    public String getDetails() {
        cbw cbwVar = this.b;
        return cbwVar == null ? "" : cbwVar.b;
    }

    public Object valueOrDie() {
        this.a.getClass();
        clq.F(this.b == null);
        return this.a;
    }
}
