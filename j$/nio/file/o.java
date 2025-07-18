package j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements q {
    public final /* synthetic */ OpenOption a;

    private /* synthetic */ o(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.q, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.q, java.nio.file.LinkOption] */
    public static /* synthetic */ q a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof p) {
            return ((p) openOption).a;
        }
        if (!(openOption instanceof EnumC0024n)) {
            return openOption instanceof F ? H.a((F) openOption) : new o(openOption);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof o) {
            obj = ((o) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
