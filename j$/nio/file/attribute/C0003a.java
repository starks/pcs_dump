package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;

/* renamed from: j$.nio.file.attribute.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0003a implements w {
    public final /* synthetic */ AclFileAttributeView a;

    private /* synthetic */ C0003a(AclFileAttributeView aclFileAttributeView) {
        this.a = aclFileAttributeView;
    }

    public static /* synthetic */ C0003a c(AclFileAttributeView aclFileAttributeView) {
        if (aclFileAttributeView == null) {
            return null;
        }
        return new C0003a(aclFileAttributeView);
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ void b(G g) throws IOException {
        this.a.setOwner(F.a(g));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.a;
        if (obj instanceof C0003a) {
            obj = ((C0003a) obj).a;
        }
        return aclFileAttributeView.equals(obj);
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
