package j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements OpenOption {
    public final /* synthetic */ q a;

    private /* synthetic */ p(q qVar) {
        this.a = qVar;
    }

    public static /* synthetic */ OpenOption a(q qVar) {
        if (qVar == null) {
            return null;
        }
        if (qVar instanceof o) {
            return ((o) qVar).a;
        }
        if (!(qVar instanceof EnumC0024n)) {
            return qVar instanceof F ? H.a((F) qVar) : new p(qVar);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        q qVar = this.a;
        if (obj instanceof p) {
            obj = ((p) obj).a;
        }
        return qVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
