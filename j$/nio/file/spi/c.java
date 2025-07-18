package j$.nio.file.spi;

import j$.nio.file.AbstractC0016f;
import j$.nio.file.C0012b;
import j$.nio.file.C0015e;
import j$.nio.file.C0019i;
import j$.nio.file.EnumC0002a;
import j$.nio.file.H;
import j$.nio.file.InterfaceC0014d;
import j$.nio.file.attribute.C0009g;
import j$.nio.file.attribute.r;
import j$.nio.file.o;
import j$.nio.file.q;
import j$.nio.file.u;
import j$.nio.file.v;
import j$.nio.file.w;
import j$.nio.file.y;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class c extends FileSystemProvider {
    public final /* synthetic */ d a;

    private /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    public static /* synthetic */ FileSystemProvider a(d dVar) {
        if (dVar == null) {
            return null;
        }
        return dVar instanceof b ? ((b) dVar).b : new c(dVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        d dVar = this.a;
        j$.nio.file.Path pathG = u.g(path);
        EnumC0002a[] enumC0002aArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC0002a[] enumC0002aArr2 = new EnumC0002a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                enumC0002aArr2[i] = accessMode == null ? null : accessMode == AccessMode.READ ? EnumC0002a.READ : accessMode == AccessMode.WRITE ? EnumC0002a.WRITE : EnumC0002a.EXECUTE;
            }
            enumC0002aArr = enumC0002aArr2;
        }
        dVar.a(pathG, enumC0002aArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC0014d[] interfaceC0014dArr;
        d dVar = this.a;
        j$.nio.file.Path pathG = u.g(path);
        j$.nio.file.Path pathG2 = u.g(path2);
        if (copyOptionArr == null) {
            interfaceC0014dArr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC0014d[] interfaceC0014dArr2 = new InterfaceC0014d[length];
            for (int i = 0; i < length; i++) {
                interfaceC0014dArr2[i] = C0012b.a(copyOptionArr[i]);
            }
            interfaceC0014dArr = interfaceC0014dArr2;
        }
        dVar.b(pathG, pathG2, interfaceC0014dArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(u.g(path), j$.nio.channels.c.c(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(u.g(path), u.g(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(u.g(path), u.g(path2), j$.nio.channels.c.c(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(u.g(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(u.g(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.a;
        if (obj instanceof c) {
            obj = ((c) obj).a;
        }
        return dVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        return r.a(this.a.h(u.g(path), H.c(cls), H.i(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        C0015e c0015eI = this.a.i(u.g(path));
        int i = AbstractC0016f.a;
        if (c0015eI == null) {
            return null;
        }
        return c0015eI.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C0019i.c(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return v.g(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(u.g(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(u.g(path), u.g(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC0014d[] interfaceC0014dArr;
        d dVar = this.a;
        j$.nio.file.Path pathG = u.g(path);
        j$.nio.file.Path pathG2 = u.g(path2);
        if (copyOptionArr == null) {
            interfaceC0014dArr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC0014d[] interfaceC0014dArr2 = new InterfaceC0014d[length];
            for (int i = 0; i < length; i++) {
                interfaceC0014dArr2[i] = C0012b.a(copyOptionArr[i]);
            }
            interfaceC0014dArr = interfaceC0014dArr2;
        }
        dVar.o(pathG, pathG2, interfaceC0014dArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a aVarP = this.a.p(u.g(path), H.g(set), executorService, j$.nio.channels.c.c(fileAttributeArr));
        int i = j$.nio.channels.b.a;
        if (aVarP == null) {
            return null;
        }
        return aVarP.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(u.g(path), H.g(set), j$.nio.channels.c.c(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new y(this.a.r(u.g(path), new w(filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(u.g(path), H.g(set), j$.nio.channels.c.c(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C0019i.c(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        q[] qVarArr;
        d dVar = this.a;
        j$.nio.file.Path pathG = u.g(path);
        if (openOptionArr == null) {
            qVarArr = null;
        } else {
            int length = openOptionArr.length;
            q[] qVarArr2 = new q[length];
            for (int i = 0; i < length; i++) {
                qVarArr2[i] = o.a(openOptionArr[i]);
            }
            qVarArr = qVarArr2;
        }
        return dVar.v(pathG, qVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        q[] qVarArr;
        d dVar = this.a;
        j$.nio.file.Path pathG = u.g(path);
        if (openOptionArr == null) {
            qVarArr = null;
        } else {
            int length = openOptionArr.length;
            q[] qVarArr2 = new q[length];
            for (int i = 0; i < length; i++) {
                qVarArr2[i] = o.a(openOptionArr[i]);
            }
            qVarArr = qVarArr2;
        }
        return dVar.w(pathG, qVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0009g.a(this.a.x(u.g(path), H.d(cls), H.i(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return v.g(this.a.z(u.g(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(u.g(path), str, H.f(obj), H.i(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C0019i.c(this.a.t(u.g(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return H.e(this.a.y(u.g(path), str, H.i(linkOptionArr)));
    }
}
