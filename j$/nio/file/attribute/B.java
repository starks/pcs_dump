package j$.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements InterfaceC0010h {
    public final /* synthetic */ PosixFileAttributes a;

    private /* synthetic */ B(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    public static /* synthetic */ B a(PosixFileAttributes posixFileAttributes) {
        if (posixFileAttributes == null) {
            return null;
        }
        return new B(posixFileAttributes);
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ y creationTime() {
        return p.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return posixFileAttributes.equals(obj);
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
