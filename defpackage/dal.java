package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dal extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new Random();
    }
}
