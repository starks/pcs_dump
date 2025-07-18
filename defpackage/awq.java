package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class awq implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ awq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                czn cznVar = awt.a;
                return awl.a((aux) obj);
            case 1:
                return awl.b(((aww) this.a).a());
            case 2:
                Object obj2 = this.a;
                int i = awu.s;
                return awl.b((aux) obj2);
            case 3:
                Object obj3 = this.a;
                int i2 = awu.s;
                return awl.a((aux) obj3);
            case 4:
                int i3 = bbf.b;
                return new IllegalArgumentException(String.format("unable to convert %s to string", ((axm) this.a).name()));
            case 5:
                int i4 = bbf.b;
                return new IllegalArgumentException(String.format("unable to convert %s to string", ((axi) this.a).name()));
            case 6:
                int i5 = bbf.b;
                return new IllegalArgumentException(String.format("unable to convert %s to string", ((axj) this.a).name()));
            default:
                int i6 = bbf.b;
                return new IllegalArgumentException(String.format("unable to convert %s to string", ((axn) this.a).name()));
        }
    }
}
