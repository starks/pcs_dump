package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.lang.reflect.Method;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ari implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ ari(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        if (i == 0) {
            return ((Optional) obj).isPresent();
        }
        if (i == 1) {
            Method method = (Method) obj;
            int i2 = ako.a;
            return method.getDeclaringClass().getName().startsWith("com.google.android.apps.aicore.aidl") && method.getParameterTypes().length == 0 && method.getName().startsWith("get") && !Objects.equals(method.getReturnType(), Void.TYPE);
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? !((aww) obj).b.isEmpty() : avz.b((aww) obj) : !avz.b((aww) obj);
        }
        aww awwVar = (aww) obj;
        return awwVar.a().c().equals("com.google.android.as") || awwVar.a().c().equals("unknown");
    }
}
