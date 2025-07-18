package j$.nio.file;

import j$.nio.file.attribute.InterfaceC0010h;
import java.io.IOException;

/* renamed from: j$.nio.file.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0023m {
    public static final /* synthetic */ int a = 0;

    static {
        j$.desugar.sun.nio.fs.g.c(new Object[]{F.CREATE_NEW, F.WRITE});
    }

    public static boolean a(Path path, EnumC0024n... enumC0024nArr) {
        if (enumC0024nArr.length == 0) {
            path.getFileSystem().k();
        }
        try {
            int length = enumC0024nArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                EnumC0024n enumC0024n = enumC0024nArr[i];
                if (enumC0024n != EnumC0024n.NOFOLLOW_LINKS) {
                    enumC0024n.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                path.getFileSystem().k().a(path, new EnumC0002a[0]);
                return true;
            }
            path.getFileSystem().k().x(path, InterfaceC0010h.class, EnumC0024n.NOFOLLOW_LINKS);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
