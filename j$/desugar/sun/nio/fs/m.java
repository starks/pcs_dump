package j$.desugar.sun.nio.fs;

import j$.nio.channels.DesugarChannels;
import j$.nio.file.AbstractC0020j;
import j$.nio.file.AbstractC0023m;
import j$.nio.file.C0015e;
import j$.nio.file.E;
import j$.nio.file.EnumC0002a;
import j$.nio.file.EnumC0024n;
import j$.nio.file.F;
import j$.nio.file.InterfaceC0014d;
import j$.nio.file.Path;
import j$.nio.file.attribute.InterfaceC0007e;
import j$.nio.file.attribute.InterfaceC0010h;
import j$.nio.file.attribute.s;
import j$.nio.file.attribute.y;
import j$.nio.file.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class m extends j$.nio.file.spi.d {
    private final String b;
    private final String c = "/";
    private volatile i d;

    m(String str) {
        this.b = str;
    }

    private static void E(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }

    private static boolean F(InterfaceC0014d[] interfaceC0014dArr, E e) {
        for (InterfaceC0014d interfaceC0014d : interfaceC0014dArr) {
            if (interfaceC0014d == e) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.spi.d
    public final void A(Path path, String str, Object obj, EnumC0024n... enumC0024nArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            str = str.substring(iIndexOf + 1);
        }
        b bVar = new b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((y) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (y) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    @Override // j$.nio.file.spi.d
    public final void a(Path path, EnumC0002a... enumC0002aArr) throws IOException {
        boolean zCanRead;
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean z = true;
        for (EnumC0002a enumC0002a : enumC0002aArr) {
            int i = j.a[enumC0002a.ordinal()];
            if (i == 1) {
                zCanRead = file.canRead();
            } else if (i == 2) {
                zCanRead = file.canWrite();
            } else if (i == 3) {
                zCanRead = file.canExecute();
            }
            z &= zCanRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // j$.nio.file.spi.d
    public final void b(Path path, Path path2, InterfaceC0014d... interfaceC0014dArr) throws IOException {
        if (!F(interfaceC0014dArr, E.REPLACE_EXISTING) && AbstractC0023m.a(path2, new EnumC0024n[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (F(interfaceC0014dArr, E.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i < 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // j$.nio.file.spi.d
    public final void c(Path path, j$.nio.file.attribute.m... mVarArr) throws NoSuchFileException, FileAlreadyExistsException {
        if (path.getParent() != null && !AbstractC0023m.a(path.getParent(), new EnumC0024n[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.d
    public final void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final void e(Path path, Path path2, j$.nio.file.attribute.m... mVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final void f(Path path) throws NoSuchFileException {
        try {
            a(path, new EnumC0002a[0]);
            path.toFile().delete();
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.d
    public final boolean g(Path path) {
        return path.toFile().delete();
    }

    @Override // j$.nio.file.spi.d
    public final s h(Path path, Class cls, EnumC0024n... enumC0024nArr) {
        cls.getClass();
        if (cls == InterfaceC0007e.class) {
            return (s) cls.cast(new b(path));
        }
        return null;
    }

    @Override // j$.nio.file.spi.d
    public final C0015e i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // j$.nio.file.spi.d
    public final AbstractC0020j j(URI uri) {
        i iVar;
        E(uri);
        i iVar2 = this.d;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this) {
            try {
                iVar = this.d;
                if (iVar == null) {
                    iVar = new i(this, this.b, this.c);
                    this.d = iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // j$.nio.file.spi.d
    public final Path k(URI uri) {
        return p.b(this.d, uri, this.b, this.c);
    }

    @Override // j$.nio.file.spi.d
    public final String l() {
        return "file";
    }

    @Override // j$.nio.file.spi.d
    public final boolean m(Path path) {
        return path.toFile().isHidden();
    }

    @Override // j$.nio.file.spi.d
    public final boolean n(Path path, Path path2) throws IOException {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new EnumC0002a[0]);
        a(path2, new EnumC0002a[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.d
    public final void o(Path path, Path path2, InterfaceC0014d... interfaceC0014dArr) throws FileAlreadyExistsException {
        if (!F(interfaceC0014dArr, E.REPLACE_EXISTING) && AbstractC0023m.a(path2, new EnumC0024n[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (F(interfaceC0014dArr, E.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    @Override // j$.nio.file.spi.d
    public final j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, j$.nio.file.attribute.m... mVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final SeekableByteChannel q(Path path, Set set, j$.nio.file.attribute.m... mVarArr) {
        return s(path, set, mVarArr);
    }

    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, w wVar) {
        k kVar = new k();
        kVar.a = new l(this, path, wVar);
        return kVar;
    }

    @Override // j$.nio.file.spi.d
    public final FileChannel s(Path path, Set set, j$.nio.file.attribute.m... mVarArr) throws IOException {
        if (path.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: ".concat(String.valueOf(path)));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j$.nio.file.q) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(F.CREATE_NEW) && set.contains(F.WRITE)) {
                throw new FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(F.CREATE) && !set.contains(F.CREATE_NEW)) {
            throw new NoSuchFileException(path.toString());
        }
        if (set.contains(F.READ) && set.contains(F.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        F f = F.APPEND;
        if (set.contains(f) && set.contains(F.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = path.toFile();
        F f2 = F.WRITE;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, (set.contains(f2) || set.contains(f)) ? set.contains(F.SYNC) ? "rws" : set.contains(F.DSYNC) ? "rwd" : "rw" : "r");
        if (set.contains(F.TRUNCATE_EXISTING) && set.contains(f2)) {
            randomAccessFile.setLength(0L);
        }
        return (set.contains(f) || set.contains(F.DELETE_ON_CLOSE)) ? e.c(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), set, path) : DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
    }

    @Override // j$.nio.file.spi.d
    public final AbstractC0020j u(URI uri, Map map) {
        E(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.d
    public final InterfaceC0010h x(Path path, Class cls, EnumC0024n... enumC0024nArr) {
        if (cls == InterfaceC0010h.class) {
            return (InterfaceC0010h) cls.cast(((InterfaceC0007e) h(path, InterfaceC0007e.class, enumC0024nArr)).readAttributes());
        }
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final Map y(Path path, String str, EnumC0024n... enumC0024nArr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        b bVar = new b(path);
        a aVarB = a.b(b.b, strArrSplit);
        InterfaceC0010h attributes = bVar.readAttributes();
        if (aVarB.c("size")) {
            aVarB.a(Long.valueOf(((c) attributes).size()), "size");
        }
        if (aVarB.c("creationTime")) {
            aVarB.a(((c) attributes).creationTime(), "creationTime");
        }
        if (aVarB.c("lastAccessTime")) {
            aVarB.a(((c) attributes).lastAccessTime(), "lastAccessTime");
        }
        if (aVarB.c("lastModifiedTime")) {
            aVarB.a(((c) attributes).lastModifiedTime(), "lastModifiedTime");
        }
        if (aVarB.c("fileKey")) {
            aVarB.a(((c) attributes).fileKey(), "fileKey");
        }
        if (aVarB.c("isDirectory")) {
            aVarB.a(Boolean.valueOf(((c) attributes).isDirectory()), "isDirectory");
        }
        if (aVarB.c("isRegularFile")) {
            aVarB.a(Boolean.valueOf(((c) attributes).isRegularFile()), "isRegularFile");
        }
        if (aVarB.c("isSymbolicLink")) {
            aVarB.a(Boolean.valueOf(((c) attributes).isSymbolicLink()), "isSymbolicLink");
        }
        if (aVarB.c("isOther")) {
            aVarB.a(Boolean.valueOf(((c) attributes).isOther()), "isOther");
        }
        return aVarB.d();
    }

    @Override // j$.nio.file.spi.d
    public final Path z(Path path) {
        return new o(this.d, path.toFile().getCanonicalPath(), this.b, this.c);
    }
}
