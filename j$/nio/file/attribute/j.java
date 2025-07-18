package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements InterfaceC0010h {
    public final /* synthetic */ DosFileAttributes a;

    private /* synthetic */ j(DosFileAttributes dosFileAttributes) {
        this.a = dosFileAttributes;
    }

    public static /* synthetic */ j a(DosFileAttributes dosFileAttributes) {
        if (dosFileAttributes == null) {
            return null;
        }
        return new j(dosFileAttributes);
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final /* synthetic */ y creationTime() {
        return p.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.a;
        if (obj instanceof j) {
            obj = ((j) obj).a;
        }
        return dosFileAttributes.equals(obj);
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
