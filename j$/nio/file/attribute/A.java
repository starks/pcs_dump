package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class A implements InterfaceC0007e, w {
    public final /* synthetic */ PosixFileAttributeView a;

    private /* synthetic */ A(PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    public static /* synthetic */ A c(PosixFileAttributeView posixFileAttributeView) {
        if (posixFileAttributeView == null) {
            return null;
        }
        return new A(posixFileAttributeView);
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final /* synthetic */ void a(y yVar, y yVar2, y yVar3) throws IOException {
        this.a.setTimes(p.d(yVar), p.d(yVar2), p.d(yVar3));
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ void b(G g) throws IOException {
        this.a.setOwner(F.a(g));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ G getOwner() {
        return E.a(this.a.getOwner());
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
