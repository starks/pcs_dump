package defpackage;

import android.os.Parcelable;
import j$.time.Instant;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class awv implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ awv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return this.b != 0 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return this.b != 0 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return this.b != 0 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        if (this.b != 0) {
            return ((String) obj).startsWith((String) this.a);
        }
        Parcelable.Creator creator = aww.CREATOR;
        return ((ava) obj).i().isAfter((Instant) this.a);
    }
}
