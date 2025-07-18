package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
final class n implements m {
    final /* synthetic */ FileAttribute a;

    n(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.m
    public final String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.m
    public final Object value() {
        return Collections.unmodifiableSet(j$.nio.file.H.h((Set) this.a.value()));
    }
}
