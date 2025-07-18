package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bta implements dxb {
    public final /* synthetic */ String a;

    public /* synthetic */ bta(String str) {
        this.a = str;
    }

    @Override // defpackage.dxb
    public final HttpURLConnection a(String str) {
        int i = bxy.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        String str2 = this.a;
        if (!clq.O(str2)) {
            httpURLConnection.setRequestProperty("X-SERVER-TOKEN", str2);
        }
        return httpURLConnection;
    }
}
