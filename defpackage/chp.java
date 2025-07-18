package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chp {
    private String a;
    private String b = "files";
    private String c = "common";
    private Account d = chq.b;
    private String e = "";
    private final cwy f;

    public chp(Context context) {
        int i = cxc.d;
        this.f = new cwy();
        clq.o(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public final Uri a() {
        String str;
        String str2 = this.b;
        String str3 = this.c;
        Account account = this.d;
        Account account2 = chn.a;
        clq.o(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        clq.o(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        clq.o(account.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (chn.a(account)) {
            str = "shared";
        } else {
            str = account.type + ":" + account.name;
        }
        return new Uri.Builder().scheme("android").authority(this.a).path("/" + str2 + "/" + str3 + "/" + str + "/" + this.e).encodedFragment(cid.a(this.f.g())).build();
    }

    public final void b() {
        c("directboot-files");
    }

    public final void c(String str) {
        clq.o(chq.d.contains(str), "The only supported locations are %s: %s", chq.d, str);
        this.b = str;
    }

    public final void d(String str) {
        clq.o(chq.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        clq.o(!chq.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public final void e(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = chq.a;
        this.e = str;
    }
}
