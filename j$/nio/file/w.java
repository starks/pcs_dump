package j$.nio.file;

import java.nio.file.DirectoryStream;

/* loaded from: classes2.dex */
public final class w implements DirectoryStream.Filter {
    private final DirectoryStream.Filter a;

    public w(DirectoryStream.Filter filter) {
        this.a = filter;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public final boolean accept(Object obj) {
        return this.a.accept(H.b(obj));
    }
}
