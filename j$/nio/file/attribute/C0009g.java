package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0009g implements BasicFileAttributes {
    public final /* synthetic */ InterfaceC0010h a;

    private /* synthetic */ C0009g(InterfaceC0010h interfaceC0010h) {
        this.a = interfaceC0010h;
    }

    public static /* synthetic */ BasicFileAttributes a(InterfaceC0010h interfaceC0010h) {
        if (interfaceC0010h == null) {
            return null;
        }
        return interfaceC0010h instanceof C0008f ? ((C0008f) interfaceC0010h).a : interfaceC0010h instanceof j ? ((j) interfaceC0010h).a : interfaceC0010h instanceof B ? ((B) interfaceC0010h).a : new C0009g(interfaceC0010h);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return p.d(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0010h interfaceC0010h = this.a;
        if (obj instanceof C0009g) {
            obj = ((C0009g) obj).a;
        }
        return interfaceC0010h.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return p.d(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return p.d(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
