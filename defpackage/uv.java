package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uv extends fjt implements fiy {
    private final /* synthetic */ int d;
    public static final uv c = new uv(2);
    public static final uv b = new uv(1);
    public static final uv a = new uv(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(int i) {
        super(1);
        this.d = i;
    }

    @Override // defpackage.fiy
    public final /* synthetic */ Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            View view = (View) obj;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                return new ux(viewGroup, 1).a();
            }
            return null;
        }
        if (i != 1) {
            String str = (String) obj;
            str.getClass();
            return str;
        }
        Resources resources = (Resources) obj;
        resources.getClass();
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
