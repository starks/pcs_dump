package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awr extends awn {
    final /* synthetic */ ava c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awr(String str, String str2, ava avaVar) {
        super(str, str2);
        this.c = avaVar;
    }

    @Override // defpackage.awk
    public final void e(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getApplicationContext().getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText("URL", this.c.j());
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }
}
