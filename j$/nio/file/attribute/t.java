package j$.nio.file.attribute;

import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.GroupPrincipal;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class t {
    public static /* bridge */ /* synthetic */ AclFileAttributeView l(Object obj) {
        return (AclFileAttributeView) obj;
    }

    public static /* bridge */ /* synthetic */ GroupPrincipal n(Object obj) {
        return (GroupPrincipal) obj;
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof AclFileAttributeView;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof GroupPrincipal;
    }
}
