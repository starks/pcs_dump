package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements w {
    public final /* synthetic */ FileOwnerAttributeView a;

    private /* synthetic */ u(FileOwnerAttributeView fileOwnerAttributeView) {
        this.a = fileOwnerAttributeView;
    }

    public static /* synthetic */ w c(FileOwnerAttributeView fileOwnerAttributeView) {
        if (fileOwnerAttributeView == null) {
            return null;
        }
        return fileOwnerAttributeView instanceof v ? ((v) fileOwnerAttributeView).a : t.s(fileOwnerAttributeView) ? C0003a.c(t.l(fileOwnerAttributeView)) : j$.nio.file.t.v(fileOwnerAttributeView) ? A.c(AbstractC0004b.p(fileOwnerAttributeView)) : new u(fileOwnerAttributeView);
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ void b(G g) throws IOException {
        this.a.setOwner(F.a(g));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ G getOwner() {
        return E.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
