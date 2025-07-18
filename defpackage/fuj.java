package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuj extends IOException {
    public final fta a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuj(fta ftaVar) {
        super("stream was reset: ".concat(ftaVar.toString()));
        Objects.toString(ftaVar);
        this.a = ftaVar;
    }
}
