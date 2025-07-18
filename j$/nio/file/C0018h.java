package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.Set;

/* renamed from: j$.nio.file.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0018h extends AbstractC0020j {
    public final /* synthetic */ FileSystem a;

    private C0018h(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ AbstractC0020j m(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C0019i ? ((C0019i) fileSystem).a : new C0018h(fileSystem);
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ Iterable c() {
        return this.a.getFileStores();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ Path d(String str, String[] strArr) {
        return u.g(this.a.getPath(str, strArr));
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ D e(String str) {
        return B.b(this.a.getPathMatcher(str));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof C0018h) {
            obj = ((C0018h) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.AbstractC0020j
    public final Iterable f() {
        return new z(this.a.getRootDirectories());
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ String g() {
        return this.a.getSeparator();
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ j$.nio.file.attribute.H h() {
        return j$.nio.file.attribute.H.a(this.a.getUserPrincipalLookupService());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ boolean i() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ N j() {
        return N.c(this.a.newWatchService());
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ j$.nio.file.spi.d k() {
        return j$.nio.file.spi.b.B(this.a.provider());
    }

    @Override // j$.nio.file.AbstractC0020j
    public final /* synthetic */ Set l() {
        return this.a.supportedFileAttributeViews();
    }
}
