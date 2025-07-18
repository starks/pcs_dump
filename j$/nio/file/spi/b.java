package j$.nio.file.spi;

import j$.nio.file.AbstractC0020j;
import j$.nio.file.C0013c;
import j$.nio.file.C0015e;
import j$.nio.file.C0018h;
import j$.nio.file.EnumC0002a;
import j$.nio.file.EnumC0024n;
import j$.nio.file.H;
import j$.nio.file.InterfaceC0014d;
import j$.nio.file.Path;
import j$.nio.file.attribute.C0008f;
import j$.nio.file.attribute.InterfaceC0010h;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.s;
import j$.nio.file.p;
import j$.nio.file.u;
import j$.nio.file.v;
import j$.nio.file.w;
import j$.nio.file.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.OpenOption;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class b extends d {
    public final /* synthetic */ FileSystemProvider b;

    private /* synthetic */ b(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    public static /* synthetic */ d B(FileSystemProvider fileSystemProvider) {
        if (fileSystemProvider == null) {
            return null;
        }
        return fileSystemProvider instanceof c ? ((c) fileSystemProvider).a : new b(fileSystemProvider);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void A(Path path, String str, Object obj, EnumC0024n[] enumC0024nArr) throws IOException {
        this.b.setAttribute(v.g(path), str, H.f(obj), H.k(enumC0024nArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void a(Path path, EnumC0002a[] enumC0002aArr) throws IOException {
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathG = v.g(path);
        AccessMode[] accessModeArr = null;
        if (enumC0002aArr != null) {
            int length = enumC0002aArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC0002a enumC0002a = enumC0002aArr[i];
                accessModeArr2[i] = enumC0002a == null ? null : enumC0002a == EnumC0002a.READ ? AccessMode.READ : enumC0002a == EnumC0002a.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathG, accessModeArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void b(Path path, Path path2, InterfaceC0014d[] interfaceC0014dArr) throws IOException {
        CopyOption[] copyOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathG = v.g(path);
        java.nio.file.Path pathG2 = v.g(path2);
        if (interfaceC0014dArr == null) {
            copyOptionArr = null;
        } else {
            int length = interfaceC0014dArr.length;
            CopyOption[] copyOptionArr2 = new CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr2[i] = C0013c.a(interfaceC0014dArr[i]);
            }
            copyOptionArr = copyOptionArr2;
        }
        fileSystemProvider.copy(pathG, pathG2, copyOptionArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void c(Path path, m[] mVarArr) throws IOException {
        this.b.createDirectory(v.g(path), j$.nio.channels.c.d(mVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.b.createLink(v.g(path), v.g(path2));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void e(Path path, Path path2, m[] mVarArr) throws IOException {
        this.b.createSymbolicLink(v.g(path), v.g(path2), j$.nio.channels.c.d(mVarArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof b) {
            obj = ((b) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void f(Path path) throws IOException {
        this.b.delete(v.g(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean g(Path path) {
        return this.b.deleteIfExists(v.g(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ s h(Path path, Class cls, EnumC0024n[] enumC0024nArr) {
        return q.c(this.b.getFileAttributeView(v.g(path), H.c(cls), H.k(enumC0024nArr)));
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ C0015e i(Path path) {
        return C0015e.a(this.b.getFileStore(v.g(path)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0020j j(URI uri) {
        return C0018h.m(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path k(URI uri) {
        return u.g(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean m(Path path) {
        return this.b.isHidden(v.g(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.b.isSameFile(v.g(path), v.g(path2));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void o(Path path, Path path2, InterfaceC0014d[] interfaceC0014dArr) throws IOException {
        CopyOption[] copyOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathG = v.g(path);
        java.nio.file.Path pathG2 = v.g(path2);
        if (interfaceC0014dArr == null) {
            copyOptionArr = null;
        } else {
            int length = interfaceC0014dArr.length;
            CopyOption[] copyOptionArr2 = new CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr2[i] = C0013c.a(interfaceC0014dArr[i]);
            }
            copyOptionArr = copyOptionArr2;
        }
        fileSystemProvider.move(pathG, pathG2, copyOptionArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, m[] mVarArr) {
        return j$.nio.channels.a.c(this.b.newAsynchronousFileChannel(v.g(path), H.g(set), executorService, j$.nio.channels.c.d(mVarArr)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, m[] mVarArr) {
        return this.b.newByteChannel(v.g(path), H.g(set), j$.nio.channels.c.d(mVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, w wVar) {
        return new y(this.b.newDirectoryStream(v.g(path), new w(wVar)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileChannel s(Path path, Set set, m[] mVarArr) {
        return this.b.newFileChannel(v.g(path), H.g(set), j$.nio.channels.c.d(mVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0020j t(Path path, Map map) {
        return C0018h.m(this.b.newFileSystem(v.g(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0020j u(URI uri, Map map) {
        return C0018h.m(this.b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InputStream v(Path path, j$.nio.file.q[] qVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathG = v.g(path);
        if (qVarArr == null) {
            openOptionArr = null;
        } else {
            int length = qVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = p.a(qVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathG, openOptionArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ OutputStream w(Path path, j$.nio.file.q[] qVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathG = v.g(path);
        if (qVarArr == null) {
            openOptionArr = null;
        } else {
            int length = qVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = p.a(qVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathG, openOptionArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InterfaceC0010h x(Path path, Class cls, EnumC0024n[] enumC0024nArr) {
        return C0008f.a(this.b.readAttributes(v.g(path), H.d(cls), H.k(enumC0024nArr)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Map y(Path path, String str, EnumC0024n[] enumC0024nArr) {
        return H.e(this.b.readAttributes(v.g(path), str, H.k(enumC0024nArr)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path z(Path path) {
        return u.g(this.b.readSymbolicLink(v.g(path)));
    }
}
