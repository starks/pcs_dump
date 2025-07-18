package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements UserPrincipal {
    public final /* synthetic */ G a;

    private /* synthetic */ F(G g) {
        this.a = g;
    }

    public static /* synthetic */ UserPrincipal a(G g) {
        if (g == null) {
            return null;
        }
        return g instanceof E ? ((E) g).a : g instanceof z ? ((z) g).a : new F(g);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        G g = this.a;
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return g.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
