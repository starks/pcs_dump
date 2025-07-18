package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0005c implements InterfaceC0007e {
    public final /* synthetic */ BasicFileAttributeView a;

    private /* synthetic */ C0005c(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    public static /* synthetic */ InterfaceC0007e c(BasicFileAttributeView basicFileAttributeView) {
        if (basicFileAttributeView == null) {
            return null;
        }
        return basicFileAttributeView instanceof C0006d ? ((C0006d) basicFileAttributeView).a : j$.nio.file.t.r(basicFileAttributeView) ? C0011i.c(j$.nio.file.t.i(basicFileAttributeView)) : j$.nio.file.t.v(basicFileAttributeView) ? A.c(AbstractC0004b.p(basicFileAttributeView)) : new C0005c(basicFileAttributeView);
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final /* synthetic */ void a(y yVar, y yVar2, y yVar3) throws IOException {
        this.a.setTimes(p.d(yVar), p.d(yVar2), p.d(yVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C0005c) {
            obj = ((C0005c) obj).a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final /* synthetic */ InterfaceC0010h readAttributes() {
        return C0008f.a(this.a.readAttributes());
    }
}
