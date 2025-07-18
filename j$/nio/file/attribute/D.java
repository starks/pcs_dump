package j$.nio.file.attribute;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class D implements s {
    public final /* synthetic */ UserDefinedFileAttributeView a;

    private /* synthetic */ D(UserDefinedFileAttributeView userDefinedFileAttributeView) {
        this.a = userDefinedFileAttributeView;
    }

    public static /* synthetic */ D c(UserDefinedFileAttributeView userDefinedFileAttributeView) {
        if (userDefinedFileAttributeView == null) {
            return null;
        }
        return new D(userDefinedFileAttributeView);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
