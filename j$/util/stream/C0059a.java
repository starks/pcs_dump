package j$.util.stream;

import j$.util.StringJoiner;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.LongFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0059a implements Supplier, LongFunction, Consumer, N, BooleanSupplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0059a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((N) this.b).accept(obj);
                break;
            case 4:
                ((U) this.b).accept(obj);
                break;
            case 5:
            default:
                ((ArrayList) this.b).add(obj);
                break;
            case 6:
                ((Consumer) this.b).accept(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return A.b(j, (C0063e) this.b);
    }

    @Override // j$.util.stream.N
    public /* synthetic */ void b() {
        int i = this.a;
    }

    @Override // j$.util.stream.N
    public /* synthetic */ void c(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.N
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return false;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return ((AbstractC0060b) obj).i();
            default:
                Set set = Collectors.a;
                return new StringJoiner((CharSequence) obj, 0);
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        Y y = (Y) this.b;
        return y.d.tryAdvance(y.e);
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void d(long j) {
    }

    private final /* synthetic */ void g() {
    }

    private final /* synthetic */ void h() {
    }
}
