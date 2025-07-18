package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class L {
    public final /* synthetic */ WatchEvent.Modifier a;

    private /* synthetic */ L(WatchEvent.Modifier modifier) {
        this.a = modifier;
    }

    public static /* synthetic */ L a(WatchEvent.Modifier modifier) {
        if (modifier == null) {
            return null;
        }
        return new L(modifier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof L) {
            obj = ((L) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
