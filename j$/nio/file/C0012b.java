package j$.nio.file;

import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;

/* renamed from: j$.nio.file.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0012b implements InterfaceC0014d {
    public final /* synthetic */ CopyOption a;

    private /* synthetic */ C0012b(CopyOption copyOption) {
        this.a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.d, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.nio.file.d, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.d, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v6, types: [j$.nio.file.d, java.nio.file.LinkOption] */
    public static /* synthetic */ InterfaceC0014d a(CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C0013c) {
            return ((C0013c) copyOption).a;
        }
        if (copyOption instanceof EnumC0024n) {
            return LinkOption.NOFOLLOW_LINKS;
        }
        if (!(copyOption instanceof E)) {
            return new C0012b(copyOption);
        }
        E e = (E) copyOption;
        return e == E.REPLACE_EXISTING ? StandardCopyOption.REPLACE_EXISTING : e == E.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CopyOption copyOption = this.a;
        if (obj instanceof C0012b) {
            obj = ((C0012b) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
