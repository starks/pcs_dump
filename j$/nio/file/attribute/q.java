package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements s {
    public final /* synthetic */ FileAttributeView a;

    private /* synthetic */ q(FileAttributeView fileAttributeView) {
        this.a = fileAttributeView;
    }

    public static /* synthetic */ s c(FileAttributeView fileAttributeView) {
        if (fileAttributeView == null) {
            return null;
        }
        return fileAttributeView instanceof r ? ((r) fileAttributeView).a : AbstractC0004b.z(fileAttributeView) ? C0005c.c(AbstractC0004b.i(fileAttributeView)) : AbstractC0004b.B(fileAttributeView) ? u.c(AbstractC0004b.m(fileAttributeView)) : AbstractC0004b.D(fileAttributeView) ? D.c(AbstractC0004b.r(fileAttributeView)) : new q(fileAttributeView);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.a;
        if (obj instanceof q) {
            obj = ((q) obj).a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
