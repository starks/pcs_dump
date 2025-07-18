package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* loaded from: classes2.dex */
public final /* synthetic */ class H {
    public final /* synthetic */ UserPrincipalLookupService a;

    private H(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }

    public static /* synthetic */ H a(UserPrincipalLookupService userPrincipalLookupService) {
        if (userPrincipalLookupService == null) {
            return null;
        }
        return new H(userPrincipalLookupService);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
