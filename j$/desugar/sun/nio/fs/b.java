package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0002a;
import j$.nio.file.Path;
import j$.nio.file.attribute.InterfaceC0007e;
import j$.nio.file.attribute.InterfaceC0010h;
import j$.nio.file.attribute.y;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class b implements InterfaceC0007e {
    static final HashSet b;
    private final Path a;

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        int i = q.b;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 9; i2++) {
            hashSet.add(strArr[i2]);
        }
        b = hashSet;
    }

    public b(Path path) {
        this.a = path;
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final void a(y yVar, y yVar2, y yVar3) {
        if (yVar == null && yVar2 == null) {
            return;
        }
        Path path = this.a;
        path.getFileSystem().k().a(path, EnumC0002a.WRITE);
        File file = path.toFile();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (!file.setLastModified(yVar.I())) {
            throw new IOException("File.setLastModified did not succeed on ".concat(String.valueOf(path)));
        }
    }

    @Override // j$.nio.file.attribute.s
    public final String name() {
        return "basic";
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final InterfaceC0010h readAttributes() {
        boolean z;
        Path path = this.a;
        path.getFileSystem().k().a(path, new EnumC0002a[0]);
        File file = path.toFile();
        long jLastModified = file.lastModified();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y yVarT = y.t(jLastModified);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new c(yVarT, yVarT, yVarT, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }
}
