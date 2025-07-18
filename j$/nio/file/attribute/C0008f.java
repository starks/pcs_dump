package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: j$.nio.file.attribute.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0008f implements InterfaceC0010h {
    public final /* synthetic */ BasicFileAttributes a;

    private /* synthetic */ C0008f(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ InterfaceC0010h a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        return basicFileAttributes instanceof C0009g ? ((C0009g) basicFileAttributes).a : AbstractC0004b.t(basicFileAttributes) ? j.a(AbstractC0004b.l(basicFileAttributes)) : AbstractC0004b.w(basicFileAttributes) ? B.a(AbstractC0004b.q(basicFileAttributes)) : new C0008f(basicFileAttributes);
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ y creationTime() {
        return p.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C0008f) {
            obj = ((C0008f) obj).a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ y lastAccessTime() {
        return p.b(this.a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ y lastModifiedTime() {
        return p.b(this.a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
