package com.google.intelligence.micore.pir.core;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PirClientSwig {
    public long a;
    protected boolean b = true;

    public PirClientSwig(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                PirClientModuleJNI.delete_PirClientSwig(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
