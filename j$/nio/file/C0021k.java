package j$.nio.file;

import java.security.PrivilegedAction;

/* renamed from: j$.nio.file.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0021k implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        j$.nio.file.spi.d dVarA = j$.adapter.c.a();
        String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if (property != null) {
            for (String str : property.split(",")) {
                try {
                    dVarA = (j$.nio.file.spi.d) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(j$.nio.file.spi.d.class).newInstance(dVarA);
                    if (!dVarA.l().equals("file")) {
                        throw new Error("Default provider must use scheme 'file'");
                    }
                } catch (Exception e) {
                    throw new Error(e);
                }
            }
        }
        return dVarA;
    }
}
